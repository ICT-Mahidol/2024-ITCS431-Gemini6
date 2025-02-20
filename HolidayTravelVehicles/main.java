
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle newVehicle = new Vehicle("001", "Vios", "E", "2012", "Toyota", 720000); 
		System.out.println("Vehicle information: \n"
				+ "Serial Number: " + newVehicle.getSerialNo() + "\n"
				+ "Name: " + newVehicle.getVahicleName() + "\n"
				+ "Model: " + newVehicle.getModel() + "\n"
				+ "Year: " + newVehicle.getVahicleYear() + "\n"
				+ "Manufacturer: " + newVehicle.getManufacturer() + "\n"
				+ "Base Cost: " + newVehicle.getBaseCost());
	}

}
