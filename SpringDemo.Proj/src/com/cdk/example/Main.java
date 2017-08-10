package com.cdk.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //FileSystemXmlApplicationContext -> we have to give full file location then
        ApplicationContext context = new ClassPathXmlApplicationContext("com/cdk/example/spring-config.xml");
        Employee employee= (Employee)context.getBean("employee");
        System.out.println(employee.getId());
        System.out.println(employee.getName());

    }
}
