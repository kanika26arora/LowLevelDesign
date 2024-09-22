package org.example.creational.AbstractFactoryDesignPattern;

import org.example.creational.AbstractFactoryDesignPattern.Vehicle;

public class Factory {

    public static Vehicle getVehicleFactory(String type){

        if(type.equalsIgnoreCase("aUDI") || type.equalsIgnoreCase("bmw")){
            return new LuxuryVehicleFactory().getVehicle(type);
        } else if (type.equalsIgnoreCase("H") || type.equalsIgnoreCase("m")) {
            return new OrdinaryVehicleFactory().getVehicle(type);
        } else
            return null;
    }
}
