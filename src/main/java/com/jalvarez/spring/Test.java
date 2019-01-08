package com.jalvarez.spring;

import com.jalvarez.spring.lifecycle.Patient;
import com.jalvarez.spring.list.Hospital;
import com.jalvarez.spring.map.Customer;
import com.jalvarez.spring.properties.CountriesAndLanguages;
import com.jalvarez.spring.reftypes.Student;
import com.jalvarez.spring.set.CarDealer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathContext = new ClassPathXmlApplicationContext("config.xml");
        Employee employee = (Employee) classPathContext.getBean("employee");
        System.out.println("Employee ID " + employee.getId());
        System.out.println("Employee Name " + employee.getName());

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("listconfig.xml");
        context.registerShutdownHook();

        Hospital hospital = (Hospital) context.getBean("hospital");
        System.out.println("Hospital Name " + hospital.getName());
        System.out.println("Hospital Departments " + hospital.getDepartments());


        CarDealer carDealer = (CarDealer) context.getBean("cardealer");
        System.out.println("CardDealer Name " + carDealer.getName());
        System.out.println("CardDealer Models " + carDealer.getModels());

        Customer customer = (Customer) context.getBean("customer");
        System.out.println("Customer info \n" + customer);

        CountriesAndLanguages countriesAndLangs = (CountriesAndLanguages) context.getBean("countriesAndLangs");
        System.out.println(countriesAndLangs);

        Student student = (Student) context.getBean("student");
        System.out.println(student);

        Patient patient = (Patient) context.getBean("patient");
        System.out.println(patient);
    }
}
