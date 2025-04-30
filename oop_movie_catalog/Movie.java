public class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private String genre;
    private double rating; // Global rating (like Rotten Tomatoes)

    public Movie(String title, String director, int releaseYear, String genre, double rating) {
        if (title == null || director == null || genre == null) {
            throw new IllegalArgumentException("Title, director, and genre cannot be null.");
        }
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.genre = genre;
        setRating(rating);
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating < 0.0 || rating > 5.0) {
            throw new IllegalArgumentException("Rating must be between 0.0 and 5.0");
        }
        this.rating = rating;
    }

    public void displayInfo() {
        System.out.println(title + " (" + releaseYear + "), directed by " + director 
            + " - Genre: " + genre + " - Rating: " + rating + "/5");
    }
}
