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