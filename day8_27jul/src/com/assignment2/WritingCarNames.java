package com.assignment2;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by pradhanb on 7/27/2017.
 */
public class WritingCarNames {
    public static void main(String[] args) {
        Set cars = new HashSet<String>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Maruti Suzuki");
        cars.add("Mazda");
        cars.add("Renault");
        cars.add("Toyota");
        cars.add("Hero");
        cars.add("Mahindra");
        cars.add("Skoda");
        cars.add("Honda");
        cars.add("Aston Martin");
        cars.add("General Motors");
        cars.add("Tesla");
        cars.add("Tata");
        cars.add("Datsun");

        File file = null;
        BufferedWriter bw = null;
        try {
            file = new File("C:\\Users\\pradhanb\\day8_27jul\\src\\com\\assignment2\\Cars.txt");
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));

            Iterator<String> itr = cars.iterator();
                while (itr.hasNext()) {
                    String car = itr.next();
                    bw.write(car);
                    bw.write("\n");
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bw != null)
                        bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

    }
}

