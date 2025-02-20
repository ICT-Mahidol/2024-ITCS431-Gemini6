public class Customer extends Person {
    private String customerID;

    public Customer(String name, String address, String phone, String customerID) {
        super(name, address, phone);
        this.customerID = customerID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Customer ID: " + customerID);
    }
}
