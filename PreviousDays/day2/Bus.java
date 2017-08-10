public class Bus extends Automobile {
	int noOfSeats;
	
	Bus(int vin, String make, String model, double price, int noOfSeats) {
			super(vin, make, model, price);
			System.out.println(" Inside Bus(int vin, String make, String model, double price, int noOfSeats) ");
			this.noOfSeats = noOfSeats;
	}
	
	void display() {
		super.display();
		System.out.println("noOfSeats : " + noOfSeats);
		System.out.println("================== ");
	}
}
	