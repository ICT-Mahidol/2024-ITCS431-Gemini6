public class Invoice {
    private String invoiceID;
    private String customerID;
    private String salespersonID;
    private String vehicleSerialNumber;
    private double tradeInAllowance;
    private double finalPrice;
    private double taxes;
    private double licenseFees;

    public Invoice(String invoiceID, String customerID, String salespersonID, String vehicleSerialNumber, 
                   double tradeInAllowance, double finalPrice, double taxes, double licenseFees) {
        this.invoiceID = invoiceID;
        this.customerID = customerID;
        this.salespersonID = salespersonID;
        this.vehicleSerialNumber = vehicleSerialNumber;
        this.tradeInAllowance = tradeInAllowance;
        this.finalPrice = finalPrice;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
    }

    public void displayInfo() {
        System.out.println("Invoice ID: " + invoiceID);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Salesperson ID: " + salespersonID);
        System.out.println("Vehicle Serial Number: " + vehicleSerialNumber);
        System.out.println("Trade-in Allowance: $" + tradeInAllowance);
        System.out.println("Final Price: $" + finalPrice);
        System.out.println("Taxes: $" + taxes);
        System.out.println("License Fees: $" + licenseFees);
    }
}
