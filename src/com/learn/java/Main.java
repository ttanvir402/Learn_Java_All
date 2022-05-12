package com.learn.java;

import com.learn.java.models.*;

public class Main {
    public static void main(String[] args){

        Toyota t = new Toyota("Toyota", "HighLander", 2022, 8, "Limited", 6);

        System.out.println("Your car will go " + t.getMileage() + " miles per gallon");
    }
}
