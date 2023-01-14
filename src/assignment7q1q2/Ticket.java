/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment7q1q2;
import java.text.SimpleDateFormat;//date and time format
import java.util.Date; //to get current systme time
/**
Arvind Dhaliwal, March 12,2022, Assignment 7 Q1
This code is a class called Ticket to be called by the main method
 */
public class Ticket extends Person { //extend to Person superclass
    
//initlize variables for Ticket class
    private static int count;
    private String Destination;
    private String Source;
    private Date Current;
    private String Currentformated;
    private String Dateformated;
    private String name;
    private int price = 0;
    SimpleDateFormat timeformat = new SimpleDateFormat("h:mm a");     //used to fromat time in am/pm format
    SimpleDateFormat dateformat = new SimpleDateFormat("yyyy.MM.dd"); //used to format date

    public Ticket() {
        count++;
    }

    public void setCurrentTime() {
        this.Current = new Date(); //get current time and date
        this.Currentformated = timeformat.format(this.Current);  //formate only for time        
    }

    public String getCurrentTime() {
        return Currentformated;
    }

    public String getCurrentDate() {
        return Dateformated;

    }

    public void setCurrentDate() {
        this.Current = new Date(); //get current time and date
        this.Dateformated = dateformat.format(this.Current); //format for only date

    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getDestination() {
        return this.Destination;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public int getprice() {
        return this.price;
    }

    public void setSource(String Source) {
        this.Source = Source;
    }

    public String getSource() {
        return this.Source;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return this.name;
    }

    public void register(Person P) { //register type person into ticket and call marker method
        this.setName(P.getName());
        this.setLastname(P.getLastname());
        this.setNcode(P.getNcode());
        this.marker();

    }

    public void marker() { //set current *date* (and time) and marker. Later to be ovveridden for different ticket types
        setCurrentDate();
        setCurrentTime();
    }

    public void print() { //print out all info
        System.out.println("ticket #:" + count + " Name:" + this.getName() + " " + this.getLastname() + " National Code:" + this.getNcode());
        System.out.println(this.getSource() + " to " + this.getDestination() + " at " + this.getCurrentTime() + " for $" + getprice());
        System.out.println(+count + getname() + getCurrentDate());

    }

}
