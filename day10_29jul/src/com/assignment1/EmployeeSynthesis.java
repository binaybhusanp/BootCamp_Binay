package com.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by pradhanb on 7/29/2017.
 */
public class EmployeeSynthesis {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        createEmployeeList(list);


        System.out.println(list.stream()
                .filter((employee)-> {if(employee.getSalary()>50000) return true; else return false;}) //returns employee type
                .map((employee)-> employee.getSalary()*0.1) // returns double after calculating TDS
                .reduce((tds,emp_tds)->tds+emp_tds).get()); // adding double type, returns double value

        System.out.println(list.size());

        System.out.println(list.stream()
                .map(employee -> employee.getSalary())
                .reduce((total, salary) ->total+salary).get());

        double average = (list.stream()
                .map(employee -> employee.getSalary())
                .reduce((total, salary) ->total+salary).get())/list.size();
        System.out.println(average);

        System.out.println(list.stream()
                .min((emp1,emp2) -> {if(emp1.getSalary() > emp2.getSalary())
                                        return 1;
                                    else if (emp1.getSalary() == emp2.getSalary())
                                        return 0;
                                    else
                                        return -1;}));

        System.out.println(list.stream()
                .max((emp1,emp2) -> {if(emp1.getSalary() > emp2.getSalary())
                    return 1;
                else if (emp1.getSalary() == emp2.getSalary())
                    return 0;
                else
                    return -1;}));


    }
    static void createEmployeeList(List<Employee> list){
        list.add(new Employee(1,"Sushant",58000));
        list.add(new Employee(2,"Harshita",59000));
        list.add(new Employee(3,"Snigdha",60000));
        list.add(new Employee(4,"Kamaljeet",61000));
        list.add(new Employee(5,"Kamaljeet",61000));
        list.add(new Employee(6,"Mukta",13000));
        list.add(new Employee(7,"Priyal",14000));
        list.add(new Employee(7,"Sneh",25000));
        list.add(new Employee(8,"Rajan",26000));
        list.add(new Employee(9,"Sameer",68000));
        list.add(new Employee(10,"Mahesh",38000));
        list.add(new Employee(11,"Arshi",54000));


    }
}
