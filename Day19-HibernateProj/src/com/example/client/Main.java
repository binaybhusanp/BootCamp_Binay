package com.example.client;

import com.example.dao.CourseDAO;
import com.example.entity.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        //Course course= new Course(100,"Public Economics",22,12000.00);


        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("mysql");
        CourseDAO courseDAO = new CourseDAO();
        courseDAO.save(managerFactory);
        courseDAO.read(managerFactory);
        courseDAO.update(managerFactory);
        courseDAO.delete(managerFactory);
        managerFactory.close();

    }
}
