public class Salesperson {
    private String salespersonId;
    private String phoneNumber;
    private String address;

    public Salesperson(String salespersonId, String phoneNumber, String address) {
        this.salespersonId = salespersonId;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Salesperson ID: " + salespersonId);
        System.out.println("Phone: " + phoneNumber + ", Address: " + address);
    }
}
