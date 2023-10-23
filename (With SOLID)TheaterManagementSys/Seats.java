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