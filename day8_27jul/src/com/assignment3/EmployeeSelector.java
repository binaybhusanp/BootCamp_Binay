package com.assignment3;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by pradhanb on 7/28/2017.
 */
public class EmployeeSelector {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        createEmployee(list);
        TreeSet<Employee> sortedEmployees = new TreeSet<>();

        for (Employee emp : list) {
            if (emp.getSalary() > 40000)
                sortedEmployees.add(emp);
        }

        System.out.println(sortedEmployees.size());
        int count = 0;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("C:\\Users\\pradhanb\\day8_27jul\\src\\com\\assignment3\\SortedEmployees.txt");
            oos = new ObjectOutputStream(fos);
            Iterator<Employee> iterator = sortedEmployees.iterator();
            while (iterator.hasNext()) {
                Employee emp = iterator.next();
                oos.writeObject(emp);
                count++;
            }
            if (count == sortedEmployees.size())
                System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            FileInputStream fis = null;
            ObjectInputStream ois = null;

            try {
                fis = new FileInputStream("C:\\Users\\pradhanb\\day8_27jul\\src\\com\\assignment3\\SortedEmployees.txt");
                ois = new ObjectInputStream(fis);
                Iterator<Employee> iterator = sortedEmployees.iterator();
                Employee e = (Employee) ois.readObject();
                while (e != null) {
                    System.out.println(e);
                    e = (Employee) ois.readObject();
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (ois != null)
                        ois.close();
                    if (fis != null)
                        fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void createEmployee(List<Employee> list) {

        list.add(new Employee(1, "Harshita", 42000, 21));
        list.add(new Employee(2, "Manda", 58000, 22));
        list.add(new Employee(3, "Pratishruti", 64000, 18));
        list.add(new Employee(4, "Mohanty", 34000, 28));
        list.add(new Employee(5, "Sushree", 14000, 26));
        list.add(new Employee(6, "Ana", 18000, 23));
        list.add(new Employee(7, "Snigdha", 39000, 28));
        list.add(new Employee(8, "Snigdha", 62000, 29));
        list.add(new Employee(9, "Siddharth", 522000, 27));
        list.add(new Employee(10, "Aditya", 10000, 24));
    }
}
