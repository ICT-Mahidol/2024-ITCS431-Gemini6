import java.util.List;

public class Invoice {
    private String invoiceID;
    private Customer customer;
    private Vehicle vehicle;
    private Salesperson salesperson;
    private String customerSignature;
    private double finalPrice;
    private double taxes;
    private double licenseFees;
    private List<DealerInstalledOption> options;

    public Invoice(String invoiceID, Customer customer, Vehicle vehicle, Salesperson salesperson, 
                   String customerSignature, double finalPrice, double taxes, double licenseFees, 
                   List<DealerInstalledOption> options) {
        this.invoiceID = invoiceID;
        this.customer = customer;
        this.vehicle = vehicle;
        this.salesperson = salesperson;
        this.customerSignature = customerSignature;
        this.finalPrice = finalPrice;
        this.taxes = taxes;
        this.licenseFees = licenseFees;
        this.options = options;
    }

    public void displayInvoice() {
        System.out.println("Invoice ID: " + invoiceID);
        customer.displayCustomerInfo();
        vehicle.displayVehicleInfo();
        salesperson.displaySalespersonInfo();
        System.out.println("Customer Signature: " + customerSignature);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("Taxes: " + taxes);
        System.out.println("License Fees: " + licenseFees);
        System.out.println("Dealer Installed Options:");
        for (DealerInstalledOption option : options) {
            option.displayOptionInfo();
        }
    }
}

