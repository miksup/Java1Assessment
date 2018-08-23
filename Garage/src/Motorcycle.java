
public class Motorcycle extends Vehicle {
	//String[] bodyType = {"Chopper", "Cruiser", "Dirt", "Sports", "Touring"};
	//String[] fairings = {"full", "half", "quarter"};
	String fairing;
	String colour;
	Boolean addStorage = false;
	int passengerCapacity = 2;
	
	
	public Motorcycle() {
		
	}
	
	public Motorcycle(String bodytype, int wheels, int cc, String manufacturer, String name, String colour, String fairings, Boolean storage) {
		super(name,wheels,cc,bodytype,manufacturer);
		
		this.colour = colour;
		this.fairing = fairings;
		this.addStorage = storage;
	}
}
