package org.example.structural.bridgeDesignPattern;

public abstract class LivingThings {

    BreatheImplementor breatheImplementor;

    LivingThings(BreatheImplementor breatheImplementor){
        this.breatheImplementor = breatheImplementor;
    }

    void breathe(){
        breatheImplementor.breatheProcess();
    }
}
