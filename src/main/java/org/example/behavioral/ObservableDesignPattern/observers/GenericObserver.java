package org.example.behavioral.ObservableDesignPattern.observers;

import org.example.behavioral.ObservableDesignPattern.Product;
import org.example.behavioral.ObservableDesignPattern.observables.ProductObservable;

public interface GenericObserver {
    void update(Product p, ProductObservable observable);
}
