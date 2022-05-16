package com.learn.java;

import com.learn.java.models.*;

public class Main {
    public static void main(String[] args){

        Toyota t = new Toyota("Toyota", "HighLander", 2022, 8, "Limited", 6);
        System.out.println("Your car will go " + t.getMileage() + " miles per gallon");

        Honda h = new Honda( "Honda", "Pilot", 2022, 8, "Touring", 6);
        System.out.println("car will go"+ h.getMileage()+ "miles per gallon");

        Nissan n = new Nissan("Nissan", "Pathfinder", 2022, 8, "Limited", 6);
        System.out.println("car will go"+String.format("%.2f",n.getMileage()));

        Hyundai hn=new Hyundai("Hyundai", "Santafe", 2022, 8, "Touring", 6);
        System.out.println("car will go"+String.format("%.2f",n.getMileage()));

        }
    }

