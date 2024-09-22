package org.example.creational.AbstractFactoryDesignPattern;

public class OrdinaryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String vehicle) {

        if(vehicle.equalsIgnoreCase("H")){
            return new OrdinaryHyndai();
        } else if (vehicle.equalsIgnoreCase("M")) {
            return new OrdinaryMaruti();
        } else
            return null;

    }
}
