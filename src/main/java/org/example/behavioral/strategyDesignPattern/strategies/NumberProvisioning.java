package org.example.behavioral.strategyDesignPattern.strategies;

public class NumberProvisioning implements provisioningStrategy{
    @Override
    public void getDetails() {
        System.out.println("Fetching Numbers");
    }

    @Override
    public void provision() {
        System.out.println("Provisioning Numbers");
    }
}
