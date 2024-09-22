package org.example.structural.facadeDesignPattern;

public class Main {

    public static void main(String... s){

        EmployeeFacadeImpl employeeFacade = new EmployeeFacadeImpl(new EmployeeDao());

        employeeFacade.find("account_id", "123");
    }
}
