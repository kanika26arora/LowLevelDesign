package org.example.structural.facadeDesignPattern;

import java.util.List;

public class DatabaseFacade {

    DatabaseConnectionService databaseConnectionService;
    DatabaseQueryCeationService databaseQueryCeationService;
    DatabaseQueryExecutionService databaseQueryExecutionService;

    public DatabaseFacade(DatabaseConnectionService databaseConnectionService,
                          DatabaseQueryCeationService databaseQueryCeationService,
                          DatabaseQueryExecutionService databaseQueryExecutionService) {
        this.databaseConnectionService = databaseConnectionService;
        this.databaseQueryCeationService = databaseQueryCeationService;
        this.databaseQueryExecutionService = databaseQueryExecutionService;
    }

    void execute(List<String> parameters){

        databaseConnectionService.createConnection();
        String query = databaseQueryCeationService.createQuery(parameters);
        databaseQueryExecutionService.executeQuery(query);
        databaseConnectionService.closeConnection();

    }
}
