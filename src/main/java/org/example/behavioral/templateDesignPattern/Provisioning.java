package org.example.behavioral.templateDesignPattern;

import org.example.behavioral.templateDesignPattern.Package;
import org.example.behavioral.templateDesignPattern.ProvisioningType;
import org.example.behavioral.templateDesignPattern.ChannelProvisioningStrategy;
import org.example.behavioral.templateDesignPattern.NumberProvisioningStrategy;
import org.example.behavioral.templateDesignPattern.AbstractProvisioningService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Provisioning {
    public  Map<ProvisioningType, List<AbstractProvisioningService>> map = new HashMap<>();

    Provisioning(){

        map.put(ProvisioningType.CONNECT, List.of(new ChannelProvisioningStrategy()));
        map.put(ProvisioningType.TRANSACT, List.of(new ChannelProvisioningStrategy(), new NumberProvisioningStrategy()));

    }

    void begin(Package p){
        p.startProvisioning(this);
    }
}
