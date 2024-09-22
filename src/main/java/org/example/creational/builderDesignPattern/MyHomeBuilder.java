package org.example.creational.builderDesignPattern;

public abstract class MyHomeBuilder {

     int doors;
     int floors;
     String color;

    public MyHomeBuilder createDoors(int doors){
        this.doors = doors;
        return this;
    }

    public abstract MyHomeBuilder createFloors(int floors);

    public MyHomeBuilder createColor(String color){
        this.color = color;
        return this;
    }


    public MyHome build(){
        return new MyHome(this);
    }


}
