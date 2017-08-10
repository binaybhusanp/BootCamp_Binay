package assignment5;

/**
 * Created by pradhanb on 7/26/2017.
 */
public class Car implements Comparable<Car> {
    private double price;
    private int id;
    private String brand;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Car(double price, int id, String brand) {
        this.price = price;
        this.id = id;
        this.brand = brand;
    }

    public int compareTo(Car car) {
        if (this.price == car.price)
            return 0;
        else if (this.price > car.price) {
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
