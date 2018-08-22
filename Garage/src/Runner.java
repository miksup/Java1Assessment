
public class Runner {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.noOfWheels = 4;
		myCar.passengerCapacity = 5;
		myCar.noOfDoors = 2;
		myCar.bodytype = "Coupe";
		myCar.convertible = false;
		myCar.manufacturer = "Mercedes-Benz";
		myCar.engineSizeInCC = 1722;
		myCar.name = "A3";
		
		Car yourCar = new Car();
		yourCar.noOfWheels = 4;
		yourCar.passengerCapacity = 5;
		yourCar.noOfDoors = 2;
		yourCar.bodytype = "Coupe";
		yourCar.convertible = false;
		yourCar.manufacturer = "BMW";
		yourCar.engineSizeInCC = 1400;
		yourCar.name = "i3";
		
		Motorcycle myBike = new Motorcycle();
		myBike.noOfWheels = 2;
		myBike.passengerCapacity = 2;
		myBike.bodytype = "Chopper";
		myBike.colour = "Black";
		myBike.manufacturer = "Harley-Davidson";
		myBike.fairing = "full";
		myBike.engineSizeInCC = 350;
		myBike.name = "Death Angel";


		Boat ssMyBoat = new Boat();
		ssMyBoat.passengerCapacity = 30;
		ssMyBoat.bodytype = "Yacht";
		ssMyBoat.colour = "White";
		ssMyBoat.hullType = "Deep-V";
		ssMyBoat.manufacturer = "YachtMaster";
		ssMyBoat.engineSizeInCC = 420;
		ssMyBoat.boatLen = 30;
		ssMyBoat.name = "Ahoy";

		Garage mySpot = new Garage();
		mySpot.vehicles.add(ssMyBoat);
		mySpot.vehicles.add(myCar);
		mySpot.vehicles.add(myBike);
		mySpot.vehicles.add(yourCar);
		
		mySpot.fee(mySpot.vehicles);
	}

}
