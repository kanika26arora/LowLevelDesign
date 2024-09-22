package org.example.behavioral.strategyDesignPattern.strategies;

public class ChannelProvisioning implements provisioningStrategy{
    @Override
    public void getDetails() {
        System.out.println("Fetching Channels");
    }

    @Override
    public void provision() {
        System.out.println("Provisioning Channels");
    }
}
