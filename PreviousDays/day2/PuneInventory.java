public class PuneInventory {
	public static void main(String[] args) {
		SportsCar sportsCar = new SportsCar(4252,"Z2", "McLaren" , 56000000, "Sports", 12);
		sportsCar.display();
		FlyingCar flyingCar = new FlyingCar(5690,"T6", "BMW" , 965000000, "Flying", 1200);
		flyingCar.display();
		Bus bus = new Bus(3680,"man67", "Marcopolo" , 5200000, 32);
		bus.display();
	}
}