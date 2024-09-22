package org.example.behavioral.templateDesignPattern;

public class ChannelProvisioningStrategy extends AbstractProvisioningService{
    @Override
    void validateAccountIsPackaged() {

        System.out.println("Validating request for channels");

    }

    @Override
    void createSolution() {

        System.out.println("Creating solution for channels");

    }

    @Override
    void createRoles() {

        System.out.println("Creating roles  for channels");

    }

    @Override
    void provisionThirdParty() {

        System.out.println("Provisioning for channels");

    }

    @Override
    void getDetails() {

        System.out.println("Getting Details for channels");

    }
}
