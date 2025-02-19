
public class Customer extends Person {
	
	public static int runningID = 1;
	private int customerID = 0;
	private String address;
	

	public Customer(String _name,String _phoneNo, String _address) {
		// TODO Auto-generated constructor stub
		super(_name, _phoneNo);
		this.customerID = runningID;
    	runningID++;
    	this.address = _address;
	}
	
	public int getCustomerID() {
		return this.customerID;
	}
	
	public String getAddress() {
		return this.address;
	}

}
