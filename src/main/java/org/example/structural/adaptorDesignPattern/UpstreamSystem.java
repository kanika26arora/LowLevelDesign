package org.example.structural.adaptorDesignPattern;

public class UpstreamSystem {


    public static void main(String... s){

        WeightConversionAdaptor weightConversionAdaptor = new WeightConversionAdaptor(new WeightInPoundsInpl());

        int weight = weightConversionAdaptor.getWeightInKgs();

        System.out.println("Weight in kgs is " + weight);
    }
}
