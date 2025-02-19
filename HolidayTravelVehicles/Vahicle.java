
public class Vahicle {
	
	private String serialNo;
	private String name;
	private String model;
	private String year;
	private String manufacturer;
	private int baseCost;
	private String make;
	
	public Vahicle(String _serialNo, String _name, String _model, String _year,String _manufacturer, int _baseCost, String _make) {
		this.serialNo = _serialNo;
		this.name = _name;
		this.model = _model;
		this.year = _year;
		this.manufacturer = _manufacturer;
		this.baseCost = _baseCost;
		this.make = _make;
	}

	public String getVahicleName() {
		return this.name;
	}
	
	public String getSerialNo() {
		return this.serialNo;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getVahicleYear() {
		return this.year;
	}
	
	public String getManufacturer() {
		return this.manufacturer;
	}
	
	public int getBaseCost() {
		return this.baseCost;
	}
	
	public String getMake() {
		return this.make;
	}

}
