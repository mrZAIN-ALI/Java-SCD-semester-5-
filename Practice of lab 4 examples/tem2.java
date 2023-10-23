// import java.util.ArrayList;
// import java.util.List;

// // Single Responsibility Principle
// interface Employee {
//     void employeeDetails();
// }

// class TechnicalOperator implements Employee {
//     private int employeeId;
//     private String employeeName;
//     private String designation;
//     private double salary;

//     public TechnicalOperator(int employeeId, String employeeName, double salary) {
//         this.employeeId = employeeId;
//         this.employeeName = employeeName;
//         this.designation = "Technical Operator";
//         this.salary = salary;
//     }

//     public void employeeDetails() {
//         System.out.println("Employee ID: " + employeeId);
//         System.out.println("Employee Name: " + employeeName);
//         System.out.println("Designation: " + designation);
//         System.out.println("Salary: " + salary);
//     }
// }

// class SupportStaff implements Employee {
//     private int employeeId;
//     private String employeeName;
//     private String designation;
//     private double salary;

//     public SupportStaff(int employeeId, String employeeName, double salary) {
//         this.employeeId = employeeId;
//         this.employeeName = employeeName;
//         this.designation = "Support Staff";
//         this.salary = salary;
//     }

//     public void employeeDetails() {
//         System.out.println("Employee ID: " + employeeId);
//         System.out.println("Employee Name: " + employeeName);
//         System.out.println("Designation: " + designation);
//         System.out.println("Salary: " + salary);
//     }
// }

// // Open-Closed Principle
// interface Movie {
//     void displayMovieDetails();
// }

// class MovieImpl implements Movie {
//     private int movieId;
//     private String movieName;
//     private String genre;
//     private int duration;

//     public MovieImpl(int movieId, String movieName, String genre, int duration) {
//         this.movieId = movieId;
//         this.movieName = movieName;
//         this.genre = genre;
//         this.duration = duration;
//     }

//     public void displayMovieDetails() {
//         System.out.println("Movie Name: " + movieName);
//         System.out.println("Genre: " + genre);
//         System.out.println("Duration: " + duration + " minutes");
//     }
// }

// // Liskov Substitution Principle
// class Theatre {
//     private String theatreName;
//     private String city;
//     private int noOfScreens;
//     private List<Movie> movieList;

//     public Theatre(String theatreName, String city, int noOfScreens) {
//         this.theatreName = theatreName;
//         this.city = city;
//         this.noOfScreens = noOfScreens;
//         this.movieList = new ArrayList<>();
//     }

//     public void isOpen() {
//         System.out.println(theatreName + " is open.");
//     }

//     public void displayMovies() {
//         System.out.println("Movies currently playing at " + theatreName + ":");
//         for (Movie movie : movieList) {
//             movie.displayMovieDetails();
//         }
//     }

//     public void addMovie(Movie movie) {
//         movieList.add(movie);
//     }
// }

// // Interface Segregation Principle
// interface Hall {
//     void displayDetails();
// }

// class HallImpl implements Hall {
//     private int hallId;
//     private String hallName;

//     public HallImpl(int hallId, String hallName) {
//         this.hallId = hallId;
//         this.hallName = hallName;
//     }

//     public void displayDetails() {
//         System.out.println("Hall Name: " + hallName);
//     }
// }

// // Dependency Inversion Principle
// public class Main {
//     public static void main(String[] args) {
//         Theatre theatre = new Theatre("ABC Theatre", "CityName", 5);

//         Movie movie1 = new MovieImpl(1, "Movie 1", "Action", 120);
//         theatre.addMovie(movie1);

//         Hall hall1 = new HallImpl(1, "Hall 1");
        
//         Employee techOperator = new TechnicalOperator(1, "Tech Operator 1", 5000);
//         Employee supportStaff = new SupportStaff(2, "Support Staff 1", 3000);

//         // Display theatre status
//         theatre.isOpen();
//         theatre.displayMovies();

//         // Display hall details
//         hall1.displayDetails();

//         // Display employee details
//         techOperator.employeeDetails();
//         supportStaff.employeeDetails();
//     }
// }
