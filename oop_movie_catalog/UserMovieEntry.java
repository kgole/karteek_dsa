public class UserMovieEntry {
    private Movie movie;
    private double personalRating;

    public UserMovieEntry(Movie movie, double personalRating) {
        if (movie == null) {
            throw new IllegalArgumentException("Movie cannot be null.");
        }
        setPersonalRating(personalRating);
        this.movie = movie;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getPersonalRating() {
        return personalRating;
    }

    public void setPersonalRating(double personalRating) {
        if (personalRating < 0.0 || personalRating > 5.0) {
            throw new IllegalArgumentException("Rating must be between 0.0 and 5.0");
        }
        this.personalRating = personalRating;
    }

    public void displayUserMovieInfo() {
        System.out.println(movie.getTitle() + " - Your Rating: " + personalRating + "/5");
    }
}
