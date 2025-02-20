public class Salesperson {
    private String salespersonId;
    private String phoneNumber;
    private String address;

    public Salesperson(String salespersonId, String phoneNumber, String address) {
        this.salespersonId = salespersonId;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getSalespersonId() { return salespersonId; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getAddress() { return address; }
}
