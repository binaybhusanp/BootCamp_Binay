public class FlyingCar extends Car{ 
	
	double areaOfWings;
	
	FlyingCar(int vin, String make, String model, double price, String carType, double areaOfWings) {
		super(vin, make, model, price, carType);
		System.out.println(" Inside FlyingCarCar(int vin, String make, String model, double price, String carType, double areaOfWings) ");
		this.areaOfWings = areaOfWings;
	}
	
	void display() {
		super.display();
		System.out.println("areaOfWings : " + areaOfWings);
		System.out.println("================== ");
	}
	
	
}