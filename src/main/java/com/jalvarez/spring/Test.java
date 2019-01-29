package com.jalvarez.spring;

import com.jalvarez.spring.dependencycheck.Prescription;
import com.jalvarez.spring.innerbean.Employee;
import com.jalvarez.spring.university.University;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Prescription prescription = (Prescription) context.getBean("prescription");
        System.out.println(prescription);

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee.hashCode());

        Employee employee2 = (Employee) applicationContext.getBean("employee");
        System.out.println(employee2.hashCode());

        University university = (University) applicationContext.getBean("university");
        System.out.println("\n" + university.hashCode() + ":\n" + university.toString());
    }

}
