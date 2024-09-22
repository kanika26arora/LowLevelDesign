package org.example.behavioral.ObservableDesignPattern.observers;

import org.example.behavioral.ObservableDesignPattern.Product;
import org.example.behavioral.ObservableDesignPattern.observables.BackInStockObservable;
import org.example.behavioral.ObservableDesignPattern.observables.OutOfStockObservable;
import org.example.behavioral.ObservableDesignPattern.observables.ProductObservable;

public class TextObserver implements GenericObserver{
    @Override
    public void update(Product p, ProductObservable observable) {

        if(observable instanceof BackInStockObservable){
            System.out.println("Telling users via Text that item " + p.getName() + " is back in stock"
                    + "with only " + p.getNumberOfItems() + " units available");

        } else if (observable instanceof  OutOfStockObservable) {
            System.out.println("Telling users via Text that item " + p.getName() + " is out of stock");

        }


    }
}
