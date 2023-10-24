class TechnicalOperator extends Employee {
    public TechnicalOperator(int employeeId, String employeeName, double salary) {
        super(employeeId, employeeName, salary, "Technical Operator");
    }
    public void employeeDetails() {
        System.out.println("Here i can concept of polymorphism of this function (overrding)");
    }
}