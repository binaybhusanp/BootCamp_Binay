package assignment5;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by pradhanb on 7/26/2017.
 */
public class CarTest {
    public static void main(String[] args) {
        Set<Car> carSet = new TreeSet<>();
        carSet.add(new Car(2110, 300000, "Maruti"));
        carSet.add(new Car(2114, 560000, "Porsche"));
        carSet.add(new Car(2103, 400000, "BMW"));
        carSet.add(new Car(2101, 200000, "Renault"));
        carSet.add(new Car(2102, 250000, "Maruti"));
        carSet.add(new Car(2104, 350000, "Mercedes"));
        carSet.add(new Car(2109, 500000, "Rolls Royce"));
        carSet.add(new Car(2108, 340000, "Ford"));
        carSet.add(new Car(2113, 430000, "Aston Martin"));
        carSet.add(new Car(2105, 450000, "Honda"));
        carSet.add(new Car(2107, 400000, "Toyota"));
        carSet.add(new Car(2116, 600000, "Jaguar"));
        carSet.add(new Car(2106, 420000, "Audi"));
        carSet.add(new Car(2120, 550000, "Ferrari"));
        carSet.add(new Car(2115, 390000, "Bentley"));
        carSet.add(new Car(2119, 370000, "Chevrolet"));
        carSet.add(new Car(2112, 230000, "Volvo"));
        carSet.add(new Car(2117, 650000, "Volkswagen"));
        carSet.add(new Car(2118, 730000, "Dodge"));
        carSet.add(new Car(2111, 680000, "Fiat"));

        //CarIdComparator carIdComparator = new CarIdComparator();
        //CarPriceComparator carPriceComparator= new CarPriceComparator();
        //CarBrandComparator carBrandComparator = new CarBrandComparator();

        for (Car car:carSet) {
            System.out.println(car);
        }

    }
}
