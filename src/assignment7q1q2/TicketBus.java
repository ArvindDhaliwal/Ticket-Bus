/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment7q1q2;

/**
 Arvind Dhaliwal, March 12,2022, Assignment 7 Q1
This code is a class called TicketBus to be called by the main method
 */
public class TicketBus extends Ticket { //extend to Ticket superclass
   //extend to Ticket superclass

    public final String mark = "Bus";
    public final int Price = 3;

    public TicketBus(String Source, String destination) {
        setDestination(destination);
        setCurrentTime();
        setSource(Source);
        setprice(Price);
        
    }

    public String getmark() {
        return this.mark;
    }

    @Override
    public void marker() { //ovveride marker to set both mark and price for specific ticket
        setCurrentDate();
        setCurrentTime();
        setname(this.mark);
        setprice(this.Price);
    }
}
