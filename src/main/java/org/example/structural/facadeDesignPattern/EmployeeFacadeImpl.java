package org.example.structural.facadeDesignPattern;

public class EmployeeFacadeImpl {

    private EmployeeDao employeeDao;

    EmployeeFacadeImpl(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }



    void find(String column, String value){

        employeeDao.find(column, value);

    }
}
