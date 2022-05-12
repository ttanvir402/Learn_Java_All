package com.learn.java.models;

public abstract class Cars {
    String make;
    String model;
    int year;
    int noOfSeats;

    //Default constructor --> Because when we define one, java takes away the default constructor
    public Cars(){

    }

    //Contructor with args
    public Cars(String make, String model, int year, int noOfSeats){
        this.make = make;
        this.model = model;
        this.year = year;
        this.noOfSeats = noOfSeats;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfCylinder) {
        this.noOfSeats = noOfCylinder;
    }

    //Abstract method with no definition
    //Let's assume that, formula to get mileage is different for different cars
    public abstract double getMileage();
}
