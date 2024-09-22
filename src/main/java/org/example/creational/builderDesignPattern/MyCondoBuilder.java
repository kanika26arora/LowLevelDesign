package org.example.creational.builderDesignPattern;

public class MyCondoBuilder extends MyHomeBuilder{

    @Override
    public MyHomeBuilder createFloors(int floors) {
         super.floors = floors;
        return this;
    }
}
