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