/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment7q1q2;

//import java.util.Date;

/**
Arvind Dhaliwal, March 12,2022, Assignment 7 Q1
This code is a class called Person to be called by the main method
 */
public class Person {
 //intilize String variables for Person class
    private String name;
    private String lastname;
    private String birthDate;
    private int Ncode; //national code, Canada would be 1 for instance 

    public Person(String name, String lastname, int Ncode) { //constructor
        setName(name);
        setLastname(lastname);
        setNcode(Ncode);
    }

    public Person() { 
    }

    public void printname() { //printname and birthyear
        System.out.println("name: " + name);
        System.out.println("lastname: " + lastname);
        System.out.println("birthday:(yyyy:mm:dd) " + birthDate);
    }

    public void setName(String name) { //setname
        this.name = name;
    }

    public String getName() { //getname
        return name;
    }

    public void setLastname(String lastname) { //setlastname
        this.lastname = lastname;
    }

    public String getLastname() { //getlastname
        return lastname;
    }

    public void setBirthDate(String birthDate) { //set birthday
        this.birthDate = birthDate;
    }

    public String getBirthDate() { //get birthday
        return this.birthDate;
    } 
    public void setNcode(int Ncode) { //set national code(Canada would be 1 for instance
        this.Ncode = Ncode;
    }

    public int getNcode() { //get national code
        return this.Ncode;
    }
}
