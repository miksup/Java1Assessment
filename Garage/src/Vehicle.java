
public class Vehicle {
	private String name;
	private int noOfWheels;
	int engineSizeInCC;
	int passengerCapacity;
	String bodytype;
	String manufacturer;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String name, int wheelNum, int cc, String body, String manu) {
		this.name = name;
		this.noOfWheels = wheelNum;
		this.engineSizeInCC = cc;
		this.bodytype = body;
		this.manufacturer = manu;
	}
	
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
