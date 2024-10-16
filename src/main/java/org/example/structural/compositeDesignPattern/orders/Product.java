package org.example.structural.compositeDesignPattern.orders;

public class Product implements OrderItem{
    @Override
    public int calculatePrice() {
        return 15;
    }
}
