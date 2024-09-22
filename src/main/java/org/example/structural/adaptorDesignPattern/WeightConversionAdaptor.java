package org.example.structural.adaptorDesignPattern;

public class WeightConversionAdaptor {

    weightInPounds weightInPounds;

    WeightConversionAdaptor(weightInPounds weightInPounds){
        this.weightInPounds = weightInPounds;
    }

    int getWeightInKgs(){
        return (weightInPounds.getWeightInPounds() * 2);
    }
}
