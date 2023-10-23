// A theatre is a place where everyone enjoys the movie in public. In this article, let’s see about the typical Indian theatre’s management system along with its class diagram.

// Classes :

// TheatreManagement : This class contains the details of theatre.
// Movie : It contains the movie’s details along with their hall number and timings.
// Hall : This class contains the movie screen in the theatre and it is the place where people sit and watch the movie.
// Seats : This shows the details of seats in a particular hall and describes the type of the seat. The type of seats can be front seat, back seat, balcony seat.
// Customer : This contains information about the customer.
// TicketCounter : This class is to sell tickets to the customers based on the rate of the movie.
// Employee : This class is used to store employee data. The employee can be of two types. So this class is the base class of two child classes – TechnicalOperators and SupportStaff
// TechnicalOperators : This class is the child class of Employees. Technical staff are those who operate the screens and sound systems.
// SupportStaff : This is also the child class of Employee. These are the people who are responsible for cleaning, issuing tickets, guarding, and maintaining the theatre.
// Parking : This class contains the details of parking lots. Here we can park our vehicles and pay the parking fees.
// Shops : This class contains the details of the shops which will be present in the theatre for selling snacks and other stuff.
// OperatorRoom : This room is responsible for displaying the movie. The operator in this room controls the screen and the sound systems of the theatre.
// RestRoom : This class is about the restrooms in the theatre, their availability, etc.
// Attributes :

// TheatreManagement : TheatreName, City , NoOfScreens, MovieList
// Movie : MovieId, MovieName, Genre, Duration
// Hall : Hall_Id, HallName, MovieId
// Seats : SeatId, Hall_Id, SeatType,TotalSeat, NoOfSeatsBooked
// Customer : CustomerId, CustomerName, CustomerAge, CustomerGender
// TicketCounter : TicketId, CustomerId, Hall_Id, MovieName, TicketPrice
// Employee : EmployeeId, EmployeeName, Designation, Salary
// Parking : TotalSlots, SlotsOccupied,
// Shops : ShopId, EmployeeId, ShopName, ItemList
// OperatorRoom : InchargeId, Incharge name,Hall_Id
// RestRoom : NoOfSlots
// Methods :


// 1. TheatreManagement  :

// IsOpen() – This method tells whether the particular theatre is opened or closed.
// DisplayMovies() – This method shows the list of movies in a particular theatre.
// 2. Movie  :

// DisplayMovieDetails() – It shows a detailed description of movies like their screen number, timings and genre of the movie.
// 3. Hall :

// DisplayDetails() – This method displays the details of the hall in the theatre.
// 4. Seats :

// DisplayAvailableSeats() – This method shows the available seats in a particular hall in each category.
// 5. Customer :

// CustomerDetails() – This method contains the details of customers who came to watch movies in the theatre.
// 6. TicketCounter : 

// ShowTickets() – This method shows the available tickets for the movie along with their price.
// BookTickets()– This method is used to book the tickets for a particular show.
// 7. Employee :

// EmployeeDetails()– This method is to display the details of the employees along with their designation.
// 8. Parking :

// Park() – This method is to park the vehicles in the available slot.
// Pay() – This method is to pay the fees for parking.
// 9. Shops :


// ShopDetails(): – This method displays the details of the shop.
// ItemDetails()– This method shows the available items along with their cost price.
// Buy() – This method is used to buy the items in the shop.
// 10. OperatorRoom :

// control() – This method is to control the screen, the movies displayed and the volume and other controls of sound systems.
// 11. RestRoom :  

// Use() – This method is to use the restroom
// Relationships :

// Inheritance :

// Inheritance is the concept of acquiring the resource from parents  or base class by the child class. In inheritance the class which allows its properties to be shared is known as parent class and the class which acquires the properties from its parent class is known as the child class. Inheritance greatly reduces the need to code again and allows code reusability.

// Here Employee is the parent class and the Technical staff and support staff are its child classes.

// Composition :

// Composition is a type of relationship in which a particular class owns another class. In composition, the dependent class cannot exist without the independent class and is physically contained inside the independent class.

// Here composition relation exists between these classes,

// TheatreManagement and OperatorRoom
// TheatreManagement and Hall
// Theatremanagement and Movie
// Hall and Seats
// TheatreManagement and Ticket
// So here the operator room, hall, movie, and ticket cannot even exist if there is no theatre so they are physically contained inside the theatre. Likewise, without the hall, there are no seats.

// Association :

//                   Association is a kind of relationship in which both the classes use one another and their methods. In association, no class is the owner of another class, because both classes use each other and still remain in their own space.

//         Here Association relationships exist between 

// Customer and Employee
// Customer and Shops
// Because they Customer needs employee and employee needs customer and in the same way customer buys from shops and shops get profited from customers.

// Unidirectional association :

// As the name suggests unidirectional association is the kind of association in which the relationship is in one direction only. Only one class uses the methods of another class, whereas the other class is not benefited by this relationship.

// Here unidirectional association exists between these classes,

// Customer and  Restroom
// Customer and Ticket
// Employee and Parking
// Employee and Restroom
// Here the customer uses restroom and ticket, the employee uses parking and restroom. Here only the former classes are benefitted from the latter.

// Aggregation :

// Aggregation is a type of relationship in which one class is dependent on another class but can exist even without the other class. In short, the dependent class is not physically contained inside the independent class.

// Here aggregation relation exists between these classes

// Theatre management and Parking
// Movie and Hall
// TickerCounter and  Employee
// These classes use each other but are not entirely dependent on one another and not physically contained also.
// understand this
// Write java code of this cenario keep in mind oop concepts like inheritenc , agregation and compostion etc it is also mention in scenario


import java.util.ArrayList;
import java.util.List;

// Base class for employees
class Employee {
    private int employeeId;
    private String employeeName;
    private String designation;
    private double salary;

    public Employee(int employeeId, String employeeName, String designation, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
        this.salary = salary;
    }

    public void employeeDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

// Child class for technical operators
class TechnicalOperator extends Employee {
    public TechnicalOperator(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, "Technical Operator", salary);
    }
}

// Child class for support staff
class SupportStaff extends Employee {
    public SupportStaff(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, "Support Staff", salary);
    }
}

class TheatreManagement {
    private String theatreName;
    private String city;
    private int noOfScreens;
    private List<Movie> movieList;

    // Composition: TheatreManagement owns OperatorRoom
    private OperatorRoom operatorRoom;

    // Composition: TheatreManagement owns Hall
    private List<Hall> halls;

    public TheatreManagement(String theatreName, String city, int noOfScreens) {
        this.theatreName = theatreName;
        this.city = city;
        this.noOfScreens = noOfScreens;
        this.movieList = new ArrayList<>();
        this.operatorRoom = new OperatorRoom(1, "John", 1); // OperatorRoom example
        this.halls = new ArrayList<>();
    }

    public void isOpen() {
        System.out.println(theatreName + " is open.");
    }

    public void displayMovies() {
        System.out.println("Movies currently playing at " + theatreName + ":");
        for (Movie movie : movieList) {
            System.out.println(movie.getMovieName());
        }
    }
}

class Movie {
    private int movieId;
    private String movieName;
    private String genre;
    private int duration;

    // Aggregation: Movie depends on Hall
    private Hall hall;

    public Movie(int movieId, String movieName, String genre, int duration, Hall hall) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.genre = genre;
        this.duration = duration;
        this.hall = hall;
    }

    public void displayMovieDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Genre: " + genre);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Screen Number: " + hall.getHallName());
    }
}

class Hall {
    private int hallId;
    private String hallName;

    // Aggregation: Hall depends on Seats
    private List<Seats> seats;

    public Hall(int hallId, String hallName) {
        this.hallId = hallId;
        this.hallName = hallName;
        this.seats = new ArrayList<>();
    }

    public void displayDetails() {
        System.out.println("Hall Name: " + hallName);
    }
}

class Seats {
    private int seatId;
    private String seatType;
    private int totalSeat;
    private int noOfSeatsBooked;

    public Seats(int seatId, String seatType, int totalSeat) {
        this.seatId = seatId;
        this.seatType = seatType;
        this.totalSeat = totalSeat;
    }

    public void displayAvailableSeats() {
        System.out.println("Seat Type: " + seatType);
        System.out.println("Total Seats: " + totalSeat);
        System.out.println("Seats Booked: " + noOfSeatsBooked);
        System.out.println("Available Seats: " + (totalSeat - noOfSeatsBooked));
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a TheatreManagement object
        TheatreManagement theatre = new TheatreManagement("ABC Theatre", "CityName", 5);

        // Create a Hall object and add it to the theatre
        Hall hall1 = new Hall(1, "Hall 1");
        theatre.halls.add(hall1);

        // Create a Movie object and add it to the theatre
        Movie movie1 = new Movie(1, "Movie 1", "Action", 120, hall1);
        theatre.movieList.add(movie1);

        // Create a Seats object and add it to the hall
        Seats seats1 = new Seats(1, "Front Seat", 100);
        hall1.seats.add(seats1);

        // Display theatre status
        theatre.isOpen();
        theatre.displayMovies();

        // Display movie details
        movie1.displayMovieDetails();

        // Display available seats
        seats1.displayAvailableSeats();
    }
}
