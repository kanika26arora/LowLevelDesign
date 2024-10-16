package org.example.structural.facadeDesignPattern;

import java.util.ArrayList;

public class Client {

    public static void main(String... s){

        DatabaseFacade databaseFacade = new DatabaseFacade(new DatabaseConnectionService(),
                new DatabaseQueryCeationService(), new DatabaseQueryExecutionService());

        databaseFacade.execute(new ArrayList<>());
    }
}
