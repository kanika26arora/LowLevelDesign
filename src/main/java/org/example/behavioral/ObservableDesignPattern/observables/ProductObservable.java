package org.example.behavioral.ObservableDesignPattern.observables;

import org.example.behavioral.ObservableDesignPattern.observers.GenericObserver;
import org.example.behavioral.ObservableDesignPattern.Product;

public interface ProductObservable {

    void add(GenericObserver observer);

    void remove(GenericObserver observer);

    void notifyCustomer(Product p);
}
