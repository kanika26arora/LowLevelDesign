package org.example.behavioral.ObservableDesignPattern.observables;

import org.example.behavioral.ObservableDesignPattern.observers.GenericObserver;
import org.example.behavioral.ObservableDesignPattern.Product;

import java.util.ArrayList;
import java.util.List;

public class BackInStockObservable implements ProductObservable {

    private final List<GenericObserver> genericObserverList = new ArrayList<>();

    @Override
    public void add(GenericObserver observer) {
        genericObserverList.add(observer);
    }

    @Override
    public void remove(GenericObserver observer) {
        genericObserverList.remove(observer);
    }

    @Override
    public void notifyCustomer(Product p) {

        for(GenericObserver genericObserver: genericObserverList){
            genericObserver.update(p, this);
        }
    }
}
