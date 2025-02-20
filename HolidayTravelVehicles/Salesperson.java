public class Salesperson extends Person {
    private String employeeID;

    public Salesperson(String name, String address, String phone, String employeeID) {
        super(name, address, phone);
        this.employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Employee ID: " + employeeID);
    }
}
