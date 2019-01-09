package com.jalvarez.spring.reservation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

    private int id;

    private String reserveTo;

    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReserveTo() {
        return reserveTo;
    }

    public void setReserveTo(String reserveTo) {
        this.reserveTo = reserveTo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @PostConstruct
    public void initialize() {
        System.out.println("The reserves system is ready");
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("The reservation with ID = " + id + " is terminated");
    }

    @Override
    public String toString() {
        return "\n" + "ID : " + id + "\n" + "reserve to : " + reserveTo + "\n" + "Hour : " + time + "\n";
    }
}
