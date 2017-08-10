public class Car extends Vehicle {
	
	Car(int vin, String model, String make, double price) {
		super(vin, model, make, price);
	}
	void drive() {
		System.out.println("Driving Car");
	}
	
	void inspect() {
		System.out.println("Condition of Car is superb. !!!");
	}
}