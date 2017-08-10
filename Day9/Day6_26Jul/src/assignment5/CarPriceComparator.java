package assignment5;

import java.util.Comparator;

/**
 * Created by pradhanb on 7/26/2017.
 */
public class CarPriceComparator implements Comparator<Car> {
    @Override
    public int compare (Car c1, Car c2) {
        if(c1.getPrice()>c2.getPrice())
            return 1;
        else if (c1.getPrice()== c2.getPrice())
            return 0;
        else
            return -1;
    }
}
