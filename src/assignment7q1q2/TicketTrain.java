/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment7q1q2;

/**
Arvind Dhaliwal, March 12,2022, Assignment 7 Q1
This code is a class called TicketTrain to be called by the main method
 */
public class TicketTrain extends Ticket { //extend to Ticket superclass
    //extend to Ticket superclass

    private final String mark = "train";
    private final int Price = 4;

    public TicketTrain(String Source, String destination) { //price is a final variable and system time is already obtained in Ticket class 
        setDestination(destination);
        setCurrentTime();
        setSource(Source);
        setprice(Price);
    }

    public String getmark() { //not needed
        return this.mark;
    }

      public int getPrice() { //not needed
        return this.Price;
    }

    @Override
    public void marker() { //ovveride marker to set both mark and price for specific ticket
        setCurrentDate();
        setCurrentTime();
        setname(this.mark);
        setprice(this.Price);
    }

}
