public class Automobile {
	private int vin;
	private String model;
	private String make;
	final private double price;
	
	Automobile (int vin, String model, String make, double price) {
		System.out.println(" Inside Automobile (int vin, String model, String make, double price) ");
		this.vin = vin;
		this.model = model;
		this.make = make;
		this.price = price;
	}
	void display() {
		System.out.println("vin : " + vin);
		System.out.println("model : " + model);
		System.out.println("make : " + make);
		System.out.println("price : " + price);
	}
}
	