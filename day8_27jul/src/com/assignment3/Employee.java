package com.assignment3;

import java.io.Serializable;

/**
 * Created by pradhanb on 7/28/2017.
 */
public class Employee implements Serializable,Comparable {
    private int eId;
    private String name;
    transient private double salary;
    private int age;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(int eId, String name, double salary, int age) {
        this.eId = eId;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return this.geteId()-((Employee)o).geteId();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
