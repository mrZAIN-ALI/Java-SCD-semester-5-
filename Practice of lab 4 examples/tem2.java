
import java.util.Scanner;

class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TheatreManagement theatre = new TheatreManagement("Demo Theatre", "Lahore", 5);

        while (true) {
            // System.out.flush();
            System.out.println("======================================================");
            System.out.println("Theatre Management System Menu");
            System.out.println("1. Check if the theatre is open");
            System.out.println("2. Display list of movies");
            System.out.println("3. Add a movie");
            System.out.println("4. Add a hall");
            System.out.println("5. Add an employee");
            System.out.println("6. Add a ticket counter");
            System.out.println("7. Add parking details");
            System.out.println("8. Add shop details");
            System.out.println("9. Add operator room details");
            System.out.println("10. Add restroom details");
            System.out.println("0. Exit");
            System.out.println("======================================================");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    boolean isOpen = theatre.isTheatreOpen();
                    System.out.println("Theatre is open: " + isOpen);
                    break;
                case 2:
                    System.out.println("Movies currently playing:");
                    theatre.displayMovies();
                    break;
                case 3:
                    Movie movie = createMovie(scanner);
                    theatre.addMovie(movie);
                    break;
                case 4:
                    Hall hall = createHall(scanner);
                    theatre.addHall(hall);
                    break;
                case 5:
                    Employee employee = createEmployee(scanner);
                    theatre.addEmployee(employee);
                    break;
                case 6:
                    TicketCounter ticketCounter = createTicketCounter(scanner);
                    theatre.addTicketCounter(ticketCounter);
                    break;
                case 7:
                    Parking parking = createParking(scanner);
                    theatre.addParking(parking);
                    break;
                case 8:
                    Shops shop = createShop(scanner);
                    theatre.addShop(shop);
                    break;
                case 9:
                    OperatorRoom operatorRoom = createOperatorRoom(scanner);
                    theatre.addOperatorRoom(operatorRoom);
                    break;
                case 10:
                    RestRoom restRoom = createRestRoom(scanner);
                    theatre.addRestRoom(restRoom);
                    break;
                case 0:
                    System.out.println("Exiting");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.valid opetion pelase.");
                    break;
            }
        }
    }

    private static Movie createMovie(Scanner scanner) {
        System.out.print("Enter Movie ID (int): ");
        int movieId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();
        System.out.print("Enter Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter Duration (int) : ");
        int duration = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Hall Number (int): ");
        int hallNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Timings: ");
        String timings = scanner.nextLine();

        return new Movie(movieId, movieName, genre, duration, hallNumber, timings);
    }

    private static Hall createHall(Scanner scanner) {
        System.out.print("Enter Hall ID (int) : ");
        int hallId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Hall Name: ");
        String hallName = scanner.nextLine();
        System.out.print("Enter Movie ID (int) : ");
        int movieId = scanner.nextInt();
        scanner.nextLine();

        return new Hall(hallId, hallName, movieId,null);
    }

    private static Employee createEmployee(Scanner scanner) {
        System.out.print("Enter Employee ID (int) : ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter Salary (sallary): ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Designation (Technical Operator or Support Staff): ");
        String designation = scanner.nextLine();

        if (designation.equalsIgnoreCase("Technical Operator")) {
            return new TechnicalOperator(employeeId, employeeName, salary);
        } else if (designation.equalsIgnoreCase("Support Staff")) {
            return new SupportStaff(employeeId, employeeName, salary);
        } else {
            System.out.println("Invalid designation. Employee not added.");
            return null;
        }
    }

    private static TicketCounter createTicketCounter(Scanner scanner) {
        System.out.print("Enter Ticket ID (int) : ");
        int ticketId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Customer ID (int) : ");
        int customerId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Hall ID (int) : ");
        int hallId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();
        System.out.print("Enter Ticket Price (double): ");
        double ticketPrice = scanner.nextDouble();
        scanner.nextLine();

        return new TicketCounter(ticketId, customerId, hallId, movieName, ticketPrice);
    }

    private static Parking createParking(Scanner scanner) {
        System.out.print("Enter Total Parking Slots (int) : ");
        int totalSlots = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Occupied Parking Slots (int) : ");
        int slotsOccupied = scanner.nextInt();
        scanner.nextLine();

        return new Parking(totalSlots, slotsOccupied);
    }

    private static Shops createShop(Scanner scanner) {
        System.out.print("Enter Shop ID (int) : ");
        int shopId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee ID (int) : ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Shop Name: ");
        String shopName = scanner.nextLine();
        
        return new Shops(shopId, employeeId, shopName);
    }

    private static OperatorRoom createOperatorRoom(Scanner scanner) {
        System.out.print("Enter Incharge ID (int) : ");
        int inchargeId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Incharge Name: ");
        String inchargeName = scanner.nextLine();
        System.out.print("Enter Hall ID (int) : ");
        int hallId = scanner.nextInt();
        scanner.nextLine();

        return new OperatorRoom(inchargeId, inchargeName, hallId);
    }

    private static RestRoom createRestRoom(Scanner scanner) {
        System.out.print("Enter Number of Slots (int) : ");
        int noOfSlots = scanner.nextInt();
        scanner.nextLine();

        return new RestRoom(noOfSlots);
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
        System.out.println("Contrilitn grom operator room");
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
        System.out.println("Parking the car");

    }

    public void pay() {
        System.out.println("Paying cash");
    }
}

class RestRoom {
    private int noOfSlots;

    public RestRoom(int noOfSlots) {
        this.noOfSlots = noOfSlots;
    }

    public void use() {
                System.out.println("Hehe Using rest room");

    }
}
import java.util.ArrayList;
import java.util.List;

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
        System.out.println("Buying from shop");
    }
}
class SupportStaff extends Employee {
    public SupportStaff(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary, "Support Staff");
    }
}
class TechnicalOperator extends Employee {
    public TechnicalOperator(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary, "Technical Operator");
    }
    public void employeeDetails() {
        System.out.println("Here i can concept of polymorphism of this function (overrding)");
    }
}
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
        if(movieList.isEmpty()){
            System.out.println("No movie abailable please add some :)");

        }else{

            for (Movie movie : movieList) {
                System.out.println("Movie: " + movie.getMovieName());
            }
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
        if(movieList.isEmpty()){
            System.out.println("No movie abailable please add some :)");

        }else{

            for (Movie movie : movieList) {
                System.out.println("Movie: " + movie.getMovieName());
            }
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
