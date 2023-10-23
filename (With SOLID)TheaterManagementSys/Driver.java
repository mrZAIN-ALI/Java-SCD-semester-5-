
import java.util.Scanner;

class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TheatreManagement theatre = new TheatreManagement("ABC Theatre", "CityName", 5);

        while (true) {
            System.out.println("========= Theatre Management System Menu =========");
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
        System.out.print("Enter Movie ID: ");
        int movieId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();
        System.out.print("Enter Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter Duration: ");
        int duration = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Hall Number: ");
        int hallNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Timings: ");
        String timings = scanner.nextLine();

        return new Movie(movieId, movieName, genre, duration, hallNumber, timings);
    }

    private static Hall createHall(Scanner scanner) {
        System.out.print("Enter Hall ID: ");
        int hallId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Hall Name: ");
        String hallName = scanner.nextLine();
        System.out.print("Enter Movie ID: ");
        int movieId = scanner.nextInt();
        scanner.nextLine();

        return new Hall(hallId, hallName, movieId, null);
    }

    private static Employee createEmployee(Scanner scanner) {
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter Salary: ");
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
        System.out.print("Enter Ticket ID: ");
        int ticketId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Hall ID: ");
        int hallId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();
        System.out.print("Enter Ticket Price: ");
        double ticketPrice = scanner.nextDouble();
        scanner.nextLine();

        return new TicketCounter(ticketId, customerId, hallId, movieName, ticketPrice);
    }

    private static Parking createParking(Scanner scanner) {
        System.out.print("Enter Total Parking Slots: ");
        int totalSlots = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Occupied Parking Slots: ");
        int slotsOccupied = scanner.nextInt();
        scanner.nextLine();

        return new Parking(totalSlots, slotsOccupied);
    }

    private static Shops createShop(Scanner scanner) {
        System.out.print("Enter Shop ID: ");
        int shopId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Shop Name: ");
        String shopName = scanner.nextLine();
        
        return new Shops(shopId, employeeId, shopName);
    }

    private static OperatorRoom createOperatorRoom(Scanner scanner) {
        System.out.print("Enter Incharge ID: ");
        int inchargeId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Incharge Name: ");
        String inchargeName = scanner.nextLine();
        System.out.print("Enter Hall ID: ");
        int hallId = scanner.nextInt();
        scanner.nextLine();

        return new OperatorRoom(inchargeId, inchargeName, hallId);
    }

    private static RestRoom createRestRoom(Scanner scanner) {
        System.out.print("Enter Number of Slots: ");
        int noOfSlots = scanner.nextInt();
        scanner.nextLine();

        return new RestRoom(noOfSlots);
    }
}
