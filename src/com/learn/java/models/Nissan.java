package com.learn.java.models;

public class Nissan extends Cars {

    String make;
    String model;
    int year;
    int noOfSeats;
    String trim;
    int noOfCylinder;

    public Nissan(){

    }

    public Nissan(String make, String model, int year, int noOfSeats, String trim, int noOfCylinder){
        super(make, model, year, noOfSeats);

        this.make = make;
        this.model = model;
        this.year = year;
        this.noOfSeats = noOfSeats;
        this.trim = trim;
        this.noOfCylinder = noOfCylinder;
    }

    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getNoOfSeats(){
        return noOfSeats;
    }
    public void setNoOfSeats( int noOfSeats){
        this.noOfSeats = noOfSeats;
    }



    public String getTrim(){
        return trim;
    }
    public void setTrim(String trim){
        this.trim = trim;
    }
    public int getNoOfCylinder(){
        return noOfCylinder;
    }
    public void setNoOfCylinder(int noOfCylinder){
        this.noOfCylinder = noOfCylinder;
    }
    public double getMileage(){
        double result =Math.pow (this.year,2)/Math.pow(this.noOfCylinder, 6);
                return result;
    }

}
