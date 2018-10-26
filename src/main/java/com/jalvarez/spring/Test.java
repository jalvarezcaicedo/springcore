package com.jalvarez.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee emp = (Employee) context.getBean("emp");
        System.out.println("Employee ID " + emp.getId());
        System.out.println("Employee Name " + emp.getName());
    }
}
