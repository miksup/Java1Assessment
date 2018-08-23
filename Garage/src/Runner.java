import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.setNoOfWheels(4);
		myCar.passengerCapacity = 5;
		myCar.noOfDoors = 2;
		myCar.bodytype = "Coupe";
		myCar.convertible = false;
		myCar.manufacturer = "Mercedes-Benz";
		myCar.engineSizeInCC = 1722;
		myCar.setName("A3");
		
		Car yourCar = new Car();
		yourCar.setNoOfWheels(3);
		yourCar.passengerCapacity = 5;
		yourCar.noOfDoors = 2;
		yourCar.bodytype = "Coupe";
		yourCar.convertible = false;
		yourCar.manufacturer = "BMW";
		yourCar.engineSizeInCC = 1400;
		yourCar.setName("i3");
		
		Motorcycle myBike = new Motorcycle();
		myBike.setNoOfWheels(2);
		myBike.passengerCapacity = 2;
		myBike.bodytype = "Chopper";
		myBike.colour = "Black";
		myBike.manufacturer = "Harley-Davidson";
		myBike.fairing = "full";
		myBike.engineSizeInCC = 350;
		myBike.setName("Death Angel");


		Boat ssMyBoat = new Boat();
		ssMyBoat.passengerCapacity = 30;
		ssMyBoat.bodytype = "Yacht";
		ssMyBoat.colour = "White";
		ssMyBoat.hullType = "Deep-V";
		ssMyBoat.manufacturer = "YachtMaster";
		ssMyBoat.engineSizeInCC = 420;
		ssMyBoat.boatLen = 30;
		ssMyBoat.setName("Ahoy");
		
		Motorcycle yourBike = new Motorcycle("Dirt", 4, 150, "Yamaha", "Dirty Boy", "Neon Green", "quarter", false);


		Garage mySpot = new Garage();
		ArrayList<Vehicle> myGarage = new ArrayList<Vehicle>(); 
		myGarage = mySpot.vehicles;
		
		mySpot.vehicles.add(ssMyBoat);
		myGarage.add(myCar);
		myGarage.add(myBike);
		mySpot.vehicles.add(yourCar);
		mySpot.add(yourBike);
		
		
//		System.out.println(yourCar.noOfWheels);
		
		mySpot.fixFee(yourCar);
		
		
		mySpot.fee(myGarage);
		System.out.println("\n");
		
		
		mySpot.removeBy(myGarage, "Chopper");
		
		mySpot.fee(myGarage);
		System.out.println("\n");
	
		mySpot.removeBy(myGarage, "Car");
		
		mySpot.fee(myGarage);
		System.out.println("\n");
		
		mySpot.clearGarage();
		
		mySpot.fee(mySpot.vehicles);
		
	}

}
