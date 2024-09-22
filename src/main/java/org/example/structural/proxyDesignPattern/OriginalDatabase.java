package org.example.structural.proxyDesignPattern;

public class OriginalDatabase implements Database{
    @Override
    public void query(String query) {

        System.out.println(query);

    }
}
