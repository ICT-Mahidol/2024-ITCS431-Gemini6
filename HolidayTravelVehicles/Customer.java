public class Customer {
    private String customerId;
    private String name;
    private String address;
    private String phoneNumber;

    public Customer(String customerId, String name, String address, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void displayInfo() {
        System.out.println("Customer: " + name + " (ID: " + customerId + ")");
        System.out.println("Address: " + address + ", Phone: " + phoneNumber);
    }
}
