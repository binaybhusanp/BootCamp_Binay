public class Bike extends Vehicle {

	Bike(int vin, String model, String make, double price) {
		super(vin, model, make, price);
	}
	
	void drive() {
		System.out.println("Driving bike");
	}
	
	void inspect() {
		System.out.println("Condition of bike is superb. !!!");
	}
}