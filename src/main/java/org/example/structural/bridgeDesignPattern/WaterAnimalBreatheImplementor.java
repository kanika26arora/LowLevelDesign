package org.example.structural.bridgeDesignPattern;

public class WaterAnimalBreatheImplementor implements BreatheImplementor{

    @Override
    public void breatheProcess() {
        System.out.println("Breathe through gills");
    }
}
