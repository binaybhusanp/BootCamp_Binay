class Automobile {                                                  // Ultimate Base class
	int passengers;
	int price;
	String vin;
	final static int wheels = 4;

	Automobile() {
	}

	Automobile(int passengers, int price, String vin) {        // constructor of base class
		this.passengers = passengers;
		this.price = price;
		this. vin = vin;
	}

	void display() {                                           //display of base class
		System.out.println("Passengers : " + this.passengers);
		System.out.println("Price : " + this.price);
		System.out.println("vin : " + this.vin);
	}
}

class Car extends Automobile {                                    //middle level class
	String company;
	String model;
	int speed;

	Car(){
	}

	Car(String company, String model, int speed) {
		this.company = company;
		this.model = model;
		this.speed = speed;
	}

	Car(int passengers, int price, String vin, String company, String model, int speed) {    //display of car
		super(passengers, price, vin);
		this.company = company;
		this. model = model;
		this.speed = speed;
	}

	void display() {                                             //display of car
		super.display();
		System.out.println("Company : " + this.company);
		System.out.println("Model : " + this.price);
		System.out.println("Speed : " + this.speed);		
	}

	void start() {
		System.out.println("Start the car");
	}

	void stop() {
		System.out.println("Stopp!!!");
	}
}

class Bus extends Automobile {
	int speed;
	String tour;

	Bus(int passengers, int price, String vin,int speed, String tour) {           //constructor of bus
		super(passengers, price, vin);
		this.speed = speed;
		this.tour = tour;
	}

	void display() {                                                             //display of bus
		super.display();
		System.out.println("Speed : " + this.speed);
		System.out.println("Tour : " + this.tour);		
	}
}

class SportsCar extends Car {                                                    //sports car extends car
	private int rank;
	String driver;  

	SportsCar(String company, String model, int speed, int rank, String driver) {                                   //sports car constructor
		super(company, model, speed);
		this.rank = rank;
		this.driver = driver;
	}

	void sart() {                                                          //overrides start() of car
		System.out.println("Start the sports car!! bhrummmm !!");
	}

	void stop() {                                                          //overrides stop() of car
		System.out.println(driver + "Stop sports car... baa dumm tsshh!!");
	}

	int getRank() {
		return rank;
	}
}

class FlyingCar extends Car {
	private String driver;

	FlyingCar(String driver) {
		this. driver = driver;
	}

	void Start() {
		System.out.println(driver+ "Ready for take off!!");
	}

	void stop() {
		System.out.println("Fasten your seat belt, we are about to land!!");
	}
}
class Buyer {
	public static void main(String[] args) {

		Bus b1 = new Bus(20, 2000000, "MP04", 30, "Mumbai-Pune");
		b1.display();

		Car c1 = new Car(5,200000, "MH067","BMW", "PHQ", 80);
		c1.display();
		c1.start();
		c1.stop();

		SportsCar sc = new SportsCar("Bolt", "BTZ67", 150, 1, "BoltDiver");
		sc.start();
		sc.stop();
		System.out.println("Rank: " + sc.getRank());

		FlyingCar fc = new FlyingCar("Alladin");
		fc.start();
		fc.stop();
	}
}