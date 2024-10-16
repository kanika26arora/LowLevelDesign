package org.example.structural.compositeDesignPattern.orders;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public static void main(String... s){

        Box mainBox = new Box(new ArrayList<>());

        Product p = new Product();
        mainBox.add(p);

        Product smallerBoxProduct = new Product();
        Box smallerBox = new Box(List.of(smallerBoxProduct));
        mainBox.add(smallerBox);

        System.out.println(mainBox.calculatePrice());
    }
}
