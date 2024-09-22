package org.example.creational.AbstractFactoryDesignPattern;

public class LuxuryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String vehicle) {

        if(vehicle.equalsIgnoreCase("BMW")){
            return new LuxuryBMW();
        } else if (vehicle.equalsIgnoreCase("Audi")) {
            return new LuxuryAudi();
        } else
            return null;
    }
}
