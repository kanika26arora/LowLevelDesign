package org.example.behavioral.strategyDesignPattern;

import org.example.behavioral.strategyDesignPattern.data.ProvisioningType;
import org.example.behavioral.strategyDesignPattern.strategies.provisioningStrategy;

import java.util.List;

public class Package {


    int id;
    String name;
    ProvisioningType provisioningType;

    Package(int id, String name, ProvisioningType provisioningType){
        this.id = id;
        this.name = name;
        this.provisioningType = provisioningType;
    }

    void startProvisioning(Provisioning provisioning){
        List<provisioningStrategy> provisioningStrategies = provisioning.map.get(this.provisioningType);

        for(provisioningStrategy strategy: provisioningStrategies){
            strategy.provision();
        }
    }


}
