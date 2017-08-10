package assignment4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by pradhanb on 7/25/2017.
 */
public class EmployeeSalary2 {
    public static void main(String[] args) {
        List<Double> salary = new ArrayList<>(10);
        salary.add(10000.00);
        salary.add(12000.00);
        salary.add(13000.00);
        salary.add(14000.00);
        salary.add(15000.00);
        salary.add(16000.00);
        salary.add(17000.00);
        salary.add(23000.00);
        salary.add(24000.00);
        salary.add(25000.00);
        Iterator<Double> it = salary.iterator();
        while (it.hasNext()) {
            Double curr = it.next();
            if (curr < 20000.00) {
                System.out.println(curr * 1.2);
            } else
                System.out.println(curr);
        }
            }
}
