package com.jalvarez.spring;

import com.jalvarez.spring.list.Hospital;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathContext = new ClassPathXmlApplicationContext("config.xml");
        Employee employee = (Employee) classPathContext.getBean("employee");
        System.out.println("Employee ID " + employee.getId());
        System.out.println("Employee Name " + employee.getName());

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("listconfig.xml");

        Hospital hospital = (Hospital) applicationContext.getBean("hospital");
        System.out.println("Hospital Name " + hospital.getName());
        System.out.println("Hospital Departments " + hospital.getDepartments());
    }
}
