import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("EFG9871", "Honda Civics", "123", 2020, "Honda Thailand", 500000);
        Customer myCustomer = new Customer("C001", "Napatara", "Bangkok", "0810000000");
        DealerInstalledOption option1 = new DealerInstalledOption("D001", "Sunroof", 50000);
        DealerInstalledOption option2 = new DealerInstalledOption("D002", "White Seats", 30000);
        Invoice myInvoice = new Invoice("INV0001", myCustomer, myVehicle, Arrays.asList(option1, option2));

        System.out.println("=== Vehicle Information ===");
        System.out.println("Name: " + myVehicle.getName());
        System.out.println("Model: " + myVehicle.getModel());
        System.out.println("Year: " + myVehicle.getYear());
        System.out.println("Manufacturer: " + myVehicle.getManufacturer());
        System.out.println("Serial Number: " + myVehicle.getSerialNumber());
        System.out.println("Base Cost: " + myVehicle.getBaseCost() + "฿");
    }
}
