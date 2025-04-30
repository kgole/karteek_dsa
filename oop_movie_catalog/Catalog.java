import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Catalog {
    private List<Movie> movies;

    public Catalog() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        if (movie == null) {
            System.out.println("Cannot add a null movie.");
            return;
        }
        if (findExactMovieByTitle(movie.getTitle()) != null) {
            System.out.println("Movie with title '" + movie.getTitle() + "' already exists.");
            return;
        }
        movies.add(movie);
    }

    public void deleteMovieByTitle(String title) {
        if (title == null || title.isEmpty()) {
            System.out.println("Invalid title.");
            return;
        }
        Movie movie = findExactMovieByTitle(title);
        if (movie != null) {
            movies.remove(movie);
            System.out.println("Movie '" + title + "' has been deleted.");
        } else {
            System.out.println("Movie '" + title + "' not found.");
        }
    }

    public Movie findExactMovieByTitle(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null;
    }

    public List<Movie> searchMoviesByTitle(String searchTerm) {
        if (searchTerm == null || searchTerm.isEmpty()) {
            System.out.println("Search term is invalid.");
            return new ArrayList<>();
        }
        return movies.stream()
                .filter(movie -> movie.getTitle().toLowerCase().contains(searchTerm.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Movie> listAllMovies() {
        return new ArrayList<>(movies); // Return a copy
    }

    public List<Movie> listMoviesSortedByTitle() {
        return movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle))
                .collect(Collectors.toList());
    }

    public List<Movie> listMoviesSortedByYear() {
        return movies.stream()
                .sorted(Comparator.comparing(Movie::getReleaseYear))
                .collect(Collectors.toList());
    }

    public List<Movie> listTopRatedMovies() {
        return movies.stream()
                .sorted(Comparator.comparing(Movie::getRating).reversed())
                .collect(Collectors.toList());
    }

    public boolean isEmpty() {
        return movies.isEmpty();
    }
}
