public class Car extends Automobile {
	String carType;
	
	Car(int vin, String make, String model, double price, String carType) {
			super(vin, make, model, price);
			System.out.println(" Inside Car(int vin, String make, String model, double price, String carType) ");
			this.carType = carType;
	}
	
	void display() {
		super.display();
		System.out.println("carType : " + carType);
	}
}