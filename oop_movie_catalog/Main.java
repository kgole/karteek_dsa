import java.util.List;

public class Main {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        UserCatalog userCatalog = new UserCatalog();

        // Add movies
        catalog.addMovie(new Movie("Inception", "Christopher Nolan", 2010, "Science Fiction", 4.8));
        catalog.addMovie(new Movie("The Godfather", "Francis Ford Coppola", 1972, "Crime", 4.9));
        catalog.addMovie(new Movie("Pulp Fiction", "Quentin Tarantino", 1994, "Crime", 4.7));
        catalog.addMovie(new Movie("The Dark Knight", "Christopher Nolan", 2008, "Action", 4.9));

        // Add users
        User user1 = new User("alice");
        User user2 = new User("bob");
        userCatalog.addUser(user1);
        userCatalog.addUser(user2);

        // Users watch and rate movies
        Movie inception = catalog.findExactMovieByTitle("Inception");
        Movie godfather = catalog.findExactMovieByTitle("The Godfather");

        if (inception != null) {
            user1.addWatchedMovie(inception, 5.0);
            user2.addWatchedMovie(inception, 4.5);
        }
        if (godfather != null) {
            user1.addWatchedMovie(godfather, 4.8);
        }

        // Show all movies
        System.out.println("\n--- Full Movie Catalog ---");
        displayMovies(catalog.listAllMovies());

        // List all users
        System.out.println("\n--- User Profiles ---");
        userCatalog.listAllUsers();

        // Show individual user movie lists
        System.out.println("\n--- Alice's Watched Movies ---");
        user1.listWatchedMovies();

        System.out.println("\n--- Bob's Watched Movies ---");
        user2.listWatchedMovies();
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
