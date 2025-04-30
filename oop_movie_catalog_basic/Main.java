import java.util.List;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        // Add movies to catalog
        catalog.addMovie(new Movie("Inception", "Christopher Nolan", 2010, "Science Fiction"));
        catalog.addMovie(new Movie("The Godfather", "Francis Ford Coppola", 1972, "Crime"));
        catalog.addMovie(new Movie("Pulp Fiction", "Quentin Tarantino", 1994, "Crime"));
        catalog.addMovie(new Movie("The Dark Knight", "Christopher Nolan", 2008, "Action"));

        // List all movies
        System.out.println("\n--- Full Movie Catalog ---");
        displayMovies(catalog.listAllMovies());

        // Search for a movie
        System.out.println("\n--- Searching for 'dark' ---");
        List<Movie> searchResults = catalog.searchMoviesByTitle("dark");
        if (searchResults.isEmpty()) {
            System.out.println("No movies found.");
        } else {
            displayMovies(searchResults);
        }

        // Sort by title
        System.out.println("\n--- Movies Sorted by Title ---");
        displayMovies(catalog.listMoviesSortedByTitle());

        // Sort by year
        System.out.println("\n--- Movies Sorted by Year ---");
        displayMovies(catalog.listMoviesSortedByYear());
    }

    private static void displayMovies(List<Movie> movies) {
        if (movies.isEmpty()) {
            System.out.println("No movies to display.");
        } else {
            for (Movie movie : movies) {
                movie.displayInfo();
            }
        }
    }
}
