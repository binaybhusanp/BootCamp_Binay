abstract class Vehicle{
	String vin;
	int speed;
	String name;

	Vehicle(){
	}

	Vehicle(String vin, int wheels){
	this.vin = vin;
	this.speed = speed;
	this.name = name;
	}

	void details(){
	System.out.println("Vin : " + vin);
	System.out.println("speed : " + speed);
	System.out.println("name : " + name);
	}

	abstract void drive();

	abstract void inspect(); 	
}

class Bike extends Vehicle{
	void drive(){
		System.out.println("lets start the bike!!");
	}

	void inspect(){
		System.out.println("check for broken parts!!");
	}
}

class Car extends Vehicle{
	void drive(){
		System.out.println("Drive the car!!");
	}

	void inspect(){
		System.out.println("Srvice the car!!");
	}
}

public class Mechanic{
	public static void main(String[] args){
		Bike bike = new Bike();
		bike.details();
		bike.drive();
		bike.inspect();

		Car car = new Car();
		car.drive();
		car.inspect();
	}
}