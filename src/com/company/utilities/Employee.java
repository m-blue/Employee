package com.company.utilities;

public class Employee {

    private String name;
    private String phoneNumber;
    private int shift;

    public Employee(){} //Default Constructor

    public Employee(String name, String number, int shift){ // Constructor with Parameters
        this.name = name;
        this.phoneNumber = number;
        this.shift = shift;
    }

    public String GetName(){return name;}

    public void SetName(String name){
        this.name = name;
    }

    public String GetNumber(){return phoneNumber;}

    public void SetNumber(String number){
        this.phoneNumber = number;
    }

    public Integer GetShift(){return shift;}

    public void SetShift(int shift){
        this.shift = shift;
    }

    public void DisplayInfo(){ // Prints out attributes and add a empty line below
        System.out.println("Name: " + this.name);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("Shift: " + this.shift);
        System.out.println("");
    }


}
