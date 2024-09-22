package org.example.creational.builderDesignPattern;

public class Director{

    MyHomeBuilder myHomeBuilder;

    Director(MyHomeBuilder myHomeBuilder){
        this.myHomeBuilder = myHomeBuilder;
    }

    public void createHouse(){

        if(myHomeBuilder instanceof MyCondoBuilder){
             System.out.println(createCondo());
        } else{
            System.out.println(createTownhouse());
        }
    }

    private MyHome createCondo(){
        return myHomeBuilder.createFloors(1).createColor("Beige").createDoors(4).build();
    }

    private MyHome createTownhouse(){
        return myHomeBuilder.createFloors(2).createColor("Beige").createDoors(4).build();
    }
}
