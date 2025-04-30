import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<UserMovieEntry> watchedMovies;

    public User(String username) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty.");
        }
        this.username = username;
        this.watchedMovies = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void addWatchedMovie(Movie movie, double personalRating) {
        if (movie == null) {
            System.out.println("Cannot add null movie.");
            return;
        }
        watchedMovies.add(new UserMovieEntry(movie, personalRating));
    }

    public void listWatchedMovies() {
        if (watchedMovies.isEmpty()) {
            System.out.println(username + " has not watched any movies yet.");
            return;
        }
        System.out.println("Movies watched by " + username + ":");
        for (UserMovieEntry entry : watchedMovies) {
            entry.displayUserMovieInfo();
        }
    }
}
