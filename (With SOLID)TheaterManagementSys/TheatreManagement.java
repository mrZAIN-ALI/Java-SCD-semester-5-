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
        public void showTicketat(int i) {
            if(i<ticketCounters.size() || i>ticketCounters.size()){
                System.out.println("Please select vaild counter number available "+ticketCounters.size());
                return;
            }
        ticketCounters.get(i-1).showTickets();;
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
