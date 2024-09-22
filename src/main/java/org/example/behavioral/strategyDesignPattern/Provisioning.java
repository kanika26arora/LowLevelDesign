package org.example.behavioral.strategyDesignPattern;

import org.example.behavioral.strategyDesignPattern.data.ProvisioningType;
import org.example.behavioral.strategyDesignPattern.strategies.ChannelProvisioning;
import org.example.behavioral.strategyDesignPattern.strategies.NumberProvisioning;
import org.example.behavioral.strategyDesignPattern.strategies.provisioningStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Provisioning {
    public  Map<ProvisioningType, List<provisioningStrategy>> map = new HashMap<>();

    Provisioning(){

        map.put(ProvisioningType.CONNECT, List.of(new ChannelProvisioning()));
        map.put(ProvisioningType.TRANSACT, List.of(new ChannelProvisioning(), new NumberProvisioning()));

    }

    void begin(Package p){
        p.startProvisioning(this);
    }
}
