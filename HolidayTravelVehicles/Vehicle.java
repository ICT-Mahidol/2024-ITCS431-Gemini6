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

    public void displayVehicleInfo() {
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Base Cost: " + baseCost + " Baht");
    }
}

// public class main {
//     public static void main(String[] args) {
//         Vehicle vehicle = new Vehicle("V789", "Toyota", "Camry", 2023, "Toyota", 25000.0);
//         vehicle.displayVehicleInfo(); // Now prints vehicle details
//     }
// }
