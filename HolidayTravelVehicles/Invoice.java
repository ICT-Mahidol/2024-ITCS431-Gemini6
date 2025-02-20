import java.util.List;

public class Invoice {
    private String invoiceNumber;
    private Customer customer;
    private Vehicle vehicle;
    private List<DealerInstalledOption> options;
    private double finalPrice;

    public Invoice(String invoiceNumber, Customer customer, Vehicle vehicle, List<DealerInstalledOption> options, double finalPrice) {
        this.invoiceNumber = invoiceNumber;
        this.customer = customer;
        this.vehicle = vehicle;
        this.options = options;
        this.finalPrice = finalPrice;
    }

    public void displayInfo() {
        System.out.println("Invoice Number: " + invoiceNumber);
        customer.displayInfo();
        vehicle.displayInfo();
        System.out.println("Dealer Installed Options:");
        for (DealerInstalledOption option : options) {
            option.displayInfo();
        }
        System.out.println("Final Price: " + finalPrice + "฿");
    }
}
