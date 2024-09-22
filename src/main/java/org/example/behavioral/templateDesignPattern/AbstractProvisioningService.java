package org.example.behavioral.templateDesignPattern;

public abstract class AbstractProvisioningService {

    abstract void validateAccountIsPackaged();
    abstract void createSolution();
    abstract void createRoles();
    abstract void provisionThirdParty();

    public final void provision(){

        validateAccountIsPackaged();
        createSolution();
        createRoles();
        provisionThirdParty();
    }

    abstract void getDetails();
}


