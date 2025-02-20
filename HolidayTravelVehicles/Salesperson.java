public class Salesperson {
    private String salespersonID;
    private String name;
    private String contactInfo;

    public Salesperson(String salespersonID, String name, String contactInfo) {
        this.salespersonID = salespersonID;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public void displaySalespersonInfo() {
        System.out.println("Salesperson ID: " + salespersonID);
        System.out.println("Name: " + name);
        System.out.println("Contact Info: " + contactInfo);
    }
}

