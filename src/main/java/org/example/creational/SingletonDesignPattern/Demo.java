package org.example.creational.SingletonDesignPattern;

public class Demo {


    public static void main(String... s){

        MySingletonClass mySingletonClass = MySingletonClass.getInstance();
        System.out.println(mySingletonClass);


        MySingletonClass mySingletonClass2 = MySingletonClass.getInstance();
        System.out.println(mySingletonClass2);
    }


}
