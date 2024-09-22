package org.example.structural.proxyDesignPattern;

public class DatabaseProxy implements Database{

    OriginalDatabase originalDatabase;
    String role;

    DatabaseProxy(String role){
        this.originalDatabase = new OriginalDatabase();
        this.role = role;
    }

    @Override
    public void query(String query) {
        if(this.role.equalsIgnoreCase("Admin")){
            originalDatabase.query(query);
        } else{
            System.out.println("Not allowed");
        }
    }
}
