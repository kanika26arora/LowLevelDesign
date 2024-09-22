package org.example.creational.builderDesignPattern;

public class Main {

    public static void main(String... s){

        MyHomeBuilder myCondo = new MyCondoBuilder();
        MyHomeBuilder myTownhouse = new MyTownhouseBuilder();

        Director director = new Director(myCondo);
        director.createHouse();

        Director director2 = new Director(myTownhouse);
        director2.createHouse();


    }
}
