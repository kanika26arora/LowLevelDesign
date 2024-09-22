package org.example.behavioral.templateDesignPattern;

import org.example.behavioral.templateDesignPattern.Provisioning;
import org.example.behavioral.templateDesignPattern.ProvisioningType;
import org.example.behavioral.templateDesignPattern.AbstractProvisioningService;

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

        List<AbstractProvisioningService> provisioningStrategies = provisioning.map.get(this.provisioningType);

        for(AbstractProvisioningService strategy: provisioningStrategies){
            strategy.provision();
        }
    }


}
