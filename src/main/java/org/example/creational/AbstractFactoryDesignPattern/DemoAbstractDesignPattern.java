package org.example.creational.AbstractFactoryDesignPattern;

import org.example.creational.AbstractFactoryDesignPattern.Vehicle;

public class DemoAbstractDesignPattern {


    public static void main(String... s){

        Vehicle vehicle = Factory.getVehicleFactory("BMW");
        Vehicle vehicle2 = Factory.getVehicleFactory("aUDI");
        Vehicle vehicle3 = Factory.getVehicleFactory("H");
        Vehicle vehicle4 = Factory.getVehicleFactory("m");

        vehicle.start();
        vehicle2.start();
        vehicle3.start();
        vehicle4.start();
    }
}
