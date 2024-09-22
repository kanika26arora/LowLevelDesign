package org.example.behavioral.templateDesignPattern;

public class NumberProvisioningStrategy extends AbstractProvisioningService{

    @Override
    void validateAccountIsPackaged() {

        System.out.println("Validating request for numbers");

    }

    @Override
    void createSolution() {

        System.out.println("Creating solution for numbers");

    }

    @Override
    void createRoles() {

        System.out.println("Creating roles  for numbers");

    }

    @Override
    void provisionThirdParty() {

        System.out.println("Provisioning for numbers");

    }

    @Override
    void getDetails() {

        System.out.println("Getting Details for numbers");

    }
}
