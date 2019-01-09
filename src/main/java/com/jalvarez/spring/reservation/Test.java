package com.jalvarez.spring.reservation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config_assignment.xml");
        TicketReservation ticketReservation = (TicketReservation) context.getBean("reservation");
        System.out.println(ticketReservation);
        context.registerShutdownHook();
    }
}
