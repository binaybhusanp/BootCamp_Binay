package com.example.dao;

import com.example.model.Car;
import org.springframework.stereotype.Repository;

@Repository
public class CarDAO {

    public Car selectByVin(int vin) {
        //JDBC logic
        return new Car(1000,"Q7","Audi",6598000.00,5);
    }
}
