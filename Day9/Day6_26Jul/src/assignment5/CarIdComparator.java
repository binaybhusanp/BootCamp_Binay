package assignment5;

import java.util.Comparator;

/**
 * Created by pradhanb on 7/26/2017.
 */
public class CarIdComparator implements Comparator<Car> {
    @Override
    public int compare (Car c1, Car c2) {
        return c1.getId()-c2.getId();
    }
}
