package org.example.structural.facadeDesignPattern;

public class DatabaseConnectionService {

    void createConnection(){
        System.out.println("connection made");
    }

    void closeConnection(){
        System.out.println("connection closed");
    }
}
