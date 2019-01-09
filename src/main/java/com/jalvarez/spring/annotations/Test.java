package com.jalvarez.spring.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config_annotations.xml");
        Patient patient = (Patient) context.getBean("patient");
        System.out.println(patient);
        context.registerShutdownHook();
    }
}
