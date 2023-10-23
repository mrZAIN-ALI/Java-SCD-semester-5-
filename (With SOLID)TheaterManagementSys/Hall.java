import java.util.List;

class Hall {
    private int hallId;
    private String hallName;
    private int movieId;
    private List<Seats> seats;

    public Hall(int hallId, String hallName, int movieId, List<Seats> seats[]) {
        this.hallId = hallId;
        this.hallName = hallName;
        this.movieId = movieId;
    }

    public void displayDetails() {
        System.out.println("Hall: " + hallName);
        System.out.println("Movie ID: " + movieId);
    }
}