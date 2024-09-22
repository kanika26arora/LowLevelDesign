package org.example.structural.facadeDesignPattern;

public class EmployeeDao {

    void find(String column, String value){

        System.out.println("establishing connection..");
        System.out.println("creating query finding by  column " + column );
        System.out.println("closing connection..");

    }
}
