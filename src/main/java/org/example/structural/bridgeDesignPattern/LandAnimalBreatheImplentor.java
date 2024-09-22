package org.example.structural.bridgeDesignPattern;

public class LandAnimalBreatheImplentor implements BreatheImplementor{
    @Override
    public void breatheProcess() {
        System.out.println("Breathe through nose");
    }
}
