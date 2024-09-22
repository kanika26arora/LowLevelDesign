package org.example.structural.bridgeDesignPattern;

public class Main {

    public static void main(String... s){

        Dog dog = new Dog(new LandAnimalBreatheImplentor());
        dog.breatheImplementor.breatheProcess();

        Fish tuna = new Fish(new WaterAnimalBreatheImplementor());
        tuna.breatheImplementor.breatheProcess();

        Plant neem = new Plant(new PlantBreatheImplementor());
        neem.breatheImplementor.breatheProcess();
    }
}
