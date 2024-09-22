package org.example.behavioral.templateDesignPattern;



public class Main {

    public static void main(String... s){


        Package connect = new Package(1, "Connect", ProvisioningType.CONNECT);
        Package transact = new Package(2, "Transact", ProvisioningType.TRANSACT);

        Provisioning p = new Provisioning();
        p.begin(connect);
        p.begin(transact);

    }





}
