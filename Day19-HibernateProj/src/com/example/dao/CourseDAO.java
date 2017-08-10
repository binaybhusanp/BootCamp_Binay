package com.example.dao;

import com.example.entity.Course;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.swing.text.html.parser.Entity;

public class CourseDAO {
    public void save(EntityManagerFactory entityManagerFactory){

        Course course1= new Course("Health Psychology",20,8000.00);
        Course course2= new Course("maths",10,9000.00);
        Course course3= new Course("Operating Systems",15,11000.00);
        Course course4 = new Course("English",17,4500.00);

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        entityManager.persist(course1);
        entityManager.persist(course2);
        entityManager.persist(course3);
        entityManager.persist(course4);
        transaction.commit();

        entityManager.close();

    }
    public void update(EntityManagerFactory entityManagerFactory) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        Course course=entityManager.find(Course.class,3);
        course.setTitle("Dojo");
        transaction.commit();

        entityManager.close();

    }

    public void read(EntityManagerFactory entityManagerFactory){
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        Course course=entityManager.find(Course.class,3);

        System.out.println(course);
        entityManager.close();
        }
    public void delete(EntityManagerFactory entityManagerFactory){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        Course course=entityManager.find(Course.class,2);
        transaction.begin();
        entityManager.remove(course);
        transaction.commit();
    }

}

