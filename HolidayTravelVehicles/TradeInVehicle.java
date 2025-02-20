public class TradeInVehicle {
    private String serialNumber;
    private String make;
    private String model;
    private int year;

    public TradeInVehicle(String serialNumber, String make, String model, int year) {
        this.serialNumber = serialNumber;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Trade-In Vehicle: " + make + " " + model + " (" + year + ")");
        System.out.println("Serial Number: " + serialNumber);
    }
}
