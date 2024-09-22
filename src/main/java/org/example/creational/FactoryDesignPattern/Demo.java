package org.example.creational.FactoryDesignPattern;

public class Demo {

    public static void main(String... s){

        Vehicle vehicle = VehicleFactory.getVehicleInstance(4);
        vehicle.start();

        Vehicle vehicle1 = VehicleFactory.getVehicleInstance(2);
        vehicle1.start();
    }
}
