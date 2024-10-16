package org.example.structural.compositeDesignPattern.filesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    List<FileSystem> fileSystems = new ArrayList<>();

    @Override
    public void ls() {
        for(FileSystem fileSystem : fileSystems){
            fileSystem.ls();
        }
    }

    public void add(FileSystem file){
        fileSystems.add(file);
    }
}
