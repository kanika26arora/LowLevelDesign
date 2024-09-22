package org.example.creational.prototypeDesignPattern;

public class MyStudent implements MyCloneable{

    int rollNumber;
    String name;
    int age;

    MyStudent(int rollNumber, String name, int age){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;

    }

    @Override
    public MyStudent myClone() {
        return new MyStudent(this.rollNumber, this.name, this.age);
    }

    @Override
    public String toString(){

        return "Student name is " + this.name;
    }
}
