package org.cdk.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //FileSystemXmlApplicationContext -> if we use this class, then we have to give full file location
        ApplicationContext context = new ClassPathXmlApplicationContext("org/cdk/annotations/appCxt.xml");
        Employee employee= (Employee)context.getBean("employee");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getPhone());
        System.out.println(employee.getAddress());

    }
}
