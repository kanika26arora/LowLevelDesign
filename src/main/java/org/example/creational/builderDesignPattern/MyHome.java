package org.example.creational.builderDesignPattern;

public class MyHome {

   private final int doors;
   private final int floors;
   private final String color;

    public MyHome(MyHomeBuilder myHomeBuilder) {
        this.doors = myHomeBuilder.doors;
        this.floors = myHomeBuilder.floors;
        this.color = myHomeBuilder.color;
    }

    @Override
    public String toString(){
        return "My House has " + this.doors + " doors, " + this.floors + " floors and " + this.color + " color";
    }
}
