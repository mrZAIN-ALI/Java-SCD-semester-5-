import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TheatreManagement theatre = new TheatreManagement("ABC Theatre", "CityName", 5);

        while (true) {
            System.out.println("********** Theatre Management System Menu **********");
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
                    // Input movie details and add the movie
                    System.out.print("Enter Movie Name: ");
                    String movieName = scanner.nextLine();
                    // Add more input for other movie details
                    // Create a Movie object and add it to the theatre
                    break;
                case 4:
                    // Input hall details and add the hall
                    break;
                case 5:
                    // Input employee details and add the employee
                    break;
                case 6:
                    // Input ticket counter details and add the ticket counter
                    break;
                case 7:
                    // Input parking details and add parking
                    break;
                case 8:
                    // Input shop details and add the shop
                    break;
                case 9:
                    // Input operator room details and add the operator room
                    break;
                case 10:
                    // Input restroom details and add the restroom
                    break;
                case 0:
                    System.out.println("Exiting. Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}
