package org.example.creational.FactoryDesignPattern;

public class VehicleFactory {

    public static Vehicle getVehicleInstance(int numberOfWheels){

        if(numberOfWheels == (4)){
            return new Car();
        } else if (numberOfWheels == (2)) {
            return new Bike();
        } else {
            System.out.println("We dont have that vehicle");
            return null;
        }
    }
}
