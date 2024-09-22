package org.example.creational.FactoryDesignPattern;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("started car");
    }
}
