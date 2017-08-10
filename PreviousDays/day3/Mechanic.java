public class Mechanic {
	public static void main(String[] args) {
		Bike bike = new Bike(3467, "Duke", "KTM", 150000);
		bike.drive();
		bike.inspect();
		Car car = new Car(5687, "SX4", "Maruti Suzuki", 800000);
		car.drive();
		car.inspect();
	}
}