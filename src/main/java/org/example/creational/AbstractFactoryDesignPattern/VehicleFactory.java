package org.example.creational.AbstractFactoryDesignPattern;

import org.example.creational.AbstractFactoryDesignPattern.Vehicle;

public interface VehicleFactory {

   Vehicle getVehicle(String vehicle);
}
