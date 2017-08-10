abstract public class Vehicle {
	int vin;
	String model;
	String make;
	double price;
	
	Vehicle(int vin, String model, String make, double price) {
		System.out.println("Inside Vehicle(int vin, String model, String make, double price) ");
		this.vin = vin;
		this.model = model;
		this.make = make;
		this.price = price;
	}
	
	void details() {
		System.out.println("vin : " + vin);
		System.out.println("model : " + model);
		System.out.println("make : " + make);
		System.out.println("price : " + price);
	}
		
	abstract void drive();
	abstract void inspect();
}