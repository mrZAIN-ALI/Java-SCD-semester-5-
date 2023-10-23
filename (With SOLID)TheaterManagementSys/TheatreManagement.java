import java.util.ArrayList;
import java.util.List;

class TheatreManagement {
    private String theatreName;
    private String city;
    private int noOfScreens;
    private List<Movie> movieList;
    private List<Hall> halls;
    private List<Employee> employees;
    private List<TicketCounter> ticketCounters;
    private List<Parking> parkingLots;
    private List<Shops> shops;
    private List<OperatorRoom> operatorRooms;
    private List<RestRoom> restRooms;

    public TheatreManagement(String theatreName, String city, int noOfScreens) {
        this.theatreName = theatreName;
        this.city = city;
        this.noOfScreens = noOfScreens;
        this.movieList = new ArrayList<>();
        this.halls = new ArrayList<>();
        this.employees = new ArrayList<>();
        this.ticketCounters = new ArrayList<>();
        this.parkingLots = new ArrayList<>();
        this.shops = new ArrayList<>();
        this.operatorRooms = new ArrayList<>();
        this.restRooms = new ArrayList<>();
    }

    public boolean isTheatreOpen() {
        return true;
    }

    public void displayMovies() {
        for (Movie movie : movieList) {
            System.out.println("Movie: " + movie.getMovieName());
        }
    }

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }

    public void addHall(Hall hall) {
        halls.add(hall);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addTicketCounter(TicketCounter ticketCounter) {
        ticketCounters.add(ticketCounter);
    }

    public void addParking(Parking parking) {
        parkingLots.add(parking);
    }

    public void addShop(Shops shop) {
        shops.add(shop);
    }

    public void addOperatorRoom(OperatorRoom operatorRoom) {
        operatorRooms.add(operatorRoom);
    }

    public void addRestRoom(RestRoom restRoom) {
        restRooms.add(restRoom);
    }
}























// public class Main {
//     public static void main(String[] args) {
//         TheatreManagement theatre = new TheatreManagement("ABC Theatre", "CityName", 5);

//         Movie movie1 = new Movie(1, "Movie 1", "Action", 120, 1, "10:00 AM, 1:00 PM");
//         theatre.addMovie(movie1);

//         Hall hall1 = new Hall(1, "Hall 1", 1);
        
//         Employee techOperator = new TechnicalOperator(1, "Tech Operator 1", 5000);
//         Employee supportStaff = new SupportStaff(2, "Support Staff 1", 3000);

//         theatre.addHall(hall1);
//         theatre.addEmployee(techOperator);
//         theatre.addEmployee(supportStaff);

//         // Display theatre status
//         boolean isOpen = theatre.isTheatreOpen();
//         System.out.println("Is the theatre open? " + isOpen);
//         System.out.println("Movies currently playing:");
//         theatre.displayMovies();
//     }
// }
