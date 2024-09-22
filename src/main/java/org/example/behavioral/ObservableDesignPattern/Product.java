package org.example.behavioral.ObservableDesignPattern;

public class Product {

    private int items;
    private  String name;

    public Product(int items, String name){
        this.items = items;
        this.name = name;
    }

    public int getNumberOfItems(){
        return this.items;
    }

    public String getName(){
        return this.name;
    }

    public  void setNumberOfItems(int qty){

            this.items = qty;
        }
}
