public class SportsCar extends Car { 

	double turningRadius ;
	
	SportsCar(int vin, String make, String model, double price, String carType, double turningRadius) {
		super(vin, make, model, price, carType);
		System.out.println(" Inside FlyingCarCar(int vin, String make, String model, double price, String carType, double turningRadius) ");
		this.turningRadius = turningRadius;
	}
	
	void display() {
		super.display();
		System.out.println("turningRadius : " + turningRadius);
		System.out.println("================== ");
	}
	
	
	
}