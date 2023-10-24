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
                System.out.println("Ticket Price: " + ticketPrice);
    }

}