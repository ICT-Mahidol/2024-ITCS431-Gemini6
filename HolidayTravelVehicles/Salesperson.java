
public class Salesperson extends Person{

	private int numOfCarSold = 0;
	
	public Salesperson(String _name, String _phoneNo, int _carsold) {
		// TODO Auto-generated constructor stub
		super(_name, _phoneNo);
		this.numOfCarSold = _carsold;
	}
	
	public int getNumOfCarSold() {
		return this.numOfCarSold;
	}

}
