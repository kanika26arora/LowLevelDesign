package org.example.creational.builderDesignPattern;

public class MyTownhouseBuilder extends MyHomeBuilder{
    @Override
    public MyHomeBuilder createFloors(int floors) {
        super.floors = floors;
        return this;
    }
}
