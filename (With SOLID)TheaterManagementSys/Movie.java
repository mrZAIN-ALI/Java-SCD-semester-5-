class Movie {
    private int movieId;
    private String movieName;
    private String genre;
    private int duration;
    private int hallNumber;
    private String timings;

    public Movie(int movieId, String movieName, String genre, int duration, int hallNumber, String timings) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
        this.duration = duration;
        this.hallNumber = hallNumber;
        this.timings = timings;
    }

    public String getMovieName() {
        return movieName;
    }

    public void displayMovieDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Genre: " + genre);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Hall Number: " + hallNumber);
        System.out.println("Timings: " + timings);
    }
}
