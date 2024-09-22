package org.example.structural.bridgeDesignPattern;

public class PlantBreatheImplementor implements BreatheImplementor{

    @Override
    public void breatheProcess() {
        System.out.println("Breathe through leaves");
    }
}
