package assignment3;

import sun.swing.BakedArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by pradhanb on 7/25/2017.
 */
public class EmployeeSalary {

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
//        Iterator<Double> it = salary.iterator();
//        while (it.hasNext()) {
//            System.out.println(0.3*it.next());
//        }
        for (Double itr:salary) {
            System.out.println(itr*0.3);
        }

    }
}
