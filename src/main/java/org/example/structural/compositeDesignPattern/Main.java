package org.example.structural.compositeDesignPattern;

public class Main {

    public static void main(String... s){


        Directory directory = new Directory();

        Directory directory1 = new Directory();
        directory1.add(new File("inside directory 1"));

        directory.add(directory1);
        directory.add(new File("inside main directory"));

        directory.ls();
        System.out.println();
        directory1.ls();
    }
}
