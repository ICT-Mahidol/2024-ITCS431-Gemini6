public class Vehicle {
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    public Vehicle(String serialNumber, String name, String model, int year, String manufacturer, double baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public void displayInfo() {
        System.out.println("Vehicle: " + name + " (" + model + ") - " + year);
        System.out.println("Manufacturer: " + manufacturer + ", Serial: " + serialNumber);
        System.out.println("Base Cost: " + baseCost + "฿");
    }
}
