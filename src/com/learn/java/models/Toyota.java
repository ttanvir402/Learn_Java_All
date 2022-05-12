package com.learn.java.models;

public class Toyota extends Cars{

    //Common params with Cars
    String make;
    String model;
    int year;
    int noOfSeats;

    //Additional params
    String trim;
    int noOfCylinder;

    //Default Constructor
    public Toyota(){

    }

    //Ctr with args
    public Toyota(String make, String model, int year, int noOfSeats, String trim, int noOfCylinder) {
        //Creates an instance of a car with same params
        super(make, model, year, noOfSeats);

        //Assigns params to the member variables of this car
        this.make = make;
        this.model = model;
        this.year = year;
        this.noOfSeats = noOfSeats;
        this.trim = trim;
        this.noOfCylinder = noOfCylinder;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int getNoOfSeats() {
        return noOfSeats;
    }

    @Override
    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public int getNoOfCylinder() {
        return noOfCylinder;
    }

    public void setNoOfCylinder(int noOfCylinder) {
        this.noOfCylinder = noOfCylinder;
    }

    // Abstract method implementation
    // Per say, Formula for toyota = (year)^2/(noOfCylinder)^7
    public double getMileage(){
        double result = Math.pow(this.year, 2) / Math.pow(this.noOfCylinder, 7);
        return result;
    }
}
