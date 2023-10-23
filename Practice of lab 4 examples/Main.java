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
        // Implementation to determine if the theatre is open or closed
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

abstract class Employee {
    private int employeeId;
    private String employeeName;
    private String designation;
    private double salary;

    public Employee(int employeeId, String employeeName, double salary, String designation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.designation = designation;
    }

    public void employeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

class TechnicalOperator extends Employee {
    public TechnicalOperator(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary, "Technical Operator");
    }
}

class SupportStaff extends Employee {
    public SupportStaff(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary, "Support Staff");
    }
}


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

class Hall {
    private int hallId;
    private String hallName;
    private int movieId;

    public Hall(int hallId, String hallName, int movieId) {
        this.hallId = hallId;
        this.hallName = hallName;
        this.movieId = movieId;
    }

    public void displayDetails() {
        System.out.println("Hall: " + hallName);
        System.out.println("Movie ID: " + movieId);
    }
}

class Seats {
    private int seatId;
    private int hallId;
    private String seatType;
    private int totalSeats;
    private int noOfSeatsBooked;

    public Seats(int seatId, int hallId, String seatType, int totalSeats) {
        this.seatId = seatId;
        this.hallId = hallId;
        this.seatType = seatType;
        this.totalSeats = totalSeats;
    }

    public void displayAvailableSeats() {
        int availableSeats = totalSeats - noOfSeatsBooked;
        System.out.println("Seat Type: " + seatType);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Seats Booked: " + noOfSeatsBooked);
        System.out.println("Available Seats: " + availableSeats);
    }
}

class Customer {
    private int customerId;
    private String customerName;
    private int customerAge;
    private String customerGender;

    public Customer(int customerId, String customerName, int customerAge, String customerGender) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.customerGender = customerGender;
    }

    public void customerDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Age: " + customerAge);
        System.out.println("Customer Gender: " + customerGender);
    }
}

class TicketCounter {
    private int ticketId;
    private int customerId;
    private int hallId;
    private String movieName;
    private double ticketPrice;

    public TicketCounter(int ticketId, int customerId, int hallId, String movieName, double ticketPrice) {
        this.ticketId = ticketId;
        this.customerId = customerId;
        this.hallId = hallId;
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
    }

    public void showTickets() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Hall ID: " + hallId);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Ticket Price: " + ticketPrice);
    }

    public void bookTickets() {
        // Implement ticket booking logic
    }
}

class Parking {
    private int totalSlots;
    private int slotsOccupied;

    public Parking(int totalSlots, int slotsOccupied) {
        this.totalSlots = totalSlots;
        this.slotsOccupied = slotsOccupied;
    }

    public void park() {
        // Implement parking logic
    }

    public void pay() {
        // Implement payment logic
    }
}

class Shops {
    private int shopId;
    private int employeeId;
    private String shopName;
    private List<String> itemList;

    public Shops(int shopId, int employeeId, String shopName) {
        this.shopId = shopId;
        this.employeeId = employeeId;
        this.shopName = shopName;
        this.itemList = new ArrayList<>();
    }

    public void shopDetails() {
        System.out.println("Shop ID: " + shopId);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Shop Name: " + shopName);
    }

    public void itemDetails() {
        for (String item : itemList) {
            System.out.println("Item: " + item);
        }
    }

    public void buy() {
        // Implement item purchase logic
    }
}

class OperatorRoom {
    private int inchargeId;
    private String inchargeName;
    private int hallId;

    public OperatorRoom(int inchargeId, String inchargeName, int hallId) {
        this.inchargeId = inchargeId;
        this.inchargeName = inchargeName;
        this.hallId = hallId;
    }

    public void control() {
        // Implement control logic for screens and sound systems
    }
}

class RestRoom {
    private int noOfSlots;

    public RestRoom(int noOfSlots) {
        this.noOfSlots = noOfSlots;
    }

    public void use() {
        // Implement restroom usage logic
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
