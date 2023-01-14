/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment7q1q2;


//import java.time.format.DateTimeFormatter;
/**
Arvind Dhaliwal, March 12,2022, Assignment 7 Q2
This code interacts with the class TicketBus/TicketTrain and calls it's methods
 */
public class Assignment7Test {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        //type Person class is needed for register method (National code 1 for Canada)
        Person P1 = new Person("Arvind", "Dhaliwal", 1);
        Person P2 = new Person("Sukhpal", "Garcha", 1);
        Person P3 = new Person("Sanraj", "Dewar", 1);
        Person P4 = new Person("Bob", "Marley", 1);
 //create Tikcet object, but from each specific ticket class (polymorphism)
        Ticket TT1 = new TicketTrain("toronto", "ottawa"); //ticket one
        TT1.register(P1);
        TT1.print();
        System.out.println(" ");

        Ticket TB1 = new TicketBus("Brampton", "Ottawa");//ticket two
        TB1.register(P2);
        TB1.print();
        System.out.println(" ");

        Ticket TT2 = new TicketTrain("Hamilton", "Toronto"); //ticket three
        TT2.register(P4);
        TT2.print();
        System.out.println(" ");

        Ticket TB2 = new TicketBus("Guelph", "Brampton"); //ticket four
        TB2.register(P3);
        TB2.print();  
      
    }
    
}
