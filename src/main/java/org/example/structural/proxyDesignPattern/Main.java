package org.example.structural.proxyDesignPattern;

public class Main {

    public static void main(String... s){

        DatabaseProxy databaseProxy = new DatabaseProxy("Admin");

        DatabaseProxy databaseProxy1 = new DatabaseProxy("user");

        databaseProxy.query("Select * from table");

        databaseProxy1.query("Select * from table");
    }
}
