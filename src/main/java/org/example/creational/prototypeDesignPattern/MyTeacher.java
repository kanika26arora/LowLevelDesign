package org.example.creational.prototypeDesignPattern;

public class MyTeacher implements MyCloneable{

    private int id;
    private String name;
    private int age;

    MyTeacher(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;

    }

    @Override
    public MyTeacher myClone() {
        return new MyTeacher(this.id, this.name, this.age);
    }
}
