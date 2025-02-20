public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice Johnson", "123 Main St", "555-1234", "CUST1001");
        Salesperson salesperson = new Salesperson("Bob Smith", "456 Elm St", "555-5678", "EMP2002");
        Vehicle vehicle = new Vehicle("V123456", "Sedan", "Model S", 2023, "Tesla", 35000);
        Invoice invoice = new Invoice("INV3003", "CUST1001", "EMP2002", "V123456", 2000, 33000, 1000, 500);

        System.out.println("Customer Information:");
        customer.displayInfo();
        System.out.println("\nSalesperson Information:");
        salesperson.displayInfo();
        System.out.println("\nVehicle Information:");
        vehicle.displayInfo();
        System.out.println("\nInvoice Information:");
        invoice.displayInfo();
    }
}
