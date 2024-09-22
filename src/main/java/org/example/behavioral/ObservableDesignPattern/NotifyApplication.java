package org.example.behavioral.ObservableDesignPattern;

import org.example.behavioral.ObservableDesignPattern.observables.BackInStockObservable;
import org.example.behavioral.ObservableDesignPattern.observables.OutOfStockObservable;
import org.example.behavioral.ObservableDesignPattern.observers.MailObserver;
import org.example.behavioral.ObservableDesignPattern.observers.TextObserver;

public class NotifyApplication {


    public static void main(String... s){

        TextObserver textObserver = new TextObserver();
        MailObserver mailObserver = new MailObserver();

        BackInStockObservable backInStockObservable = new BackInStockObservable();
        backInStockObservable.add(textObserver);
        backInStockObservable.add(mailObserver);

        Product bodyLotion = new Product(1, "Nivea Body Lotion");
        Product bodyButter = new Product(1, "Bath and Body Body Butter");

        bodyLotion.setNumberOfItems(2);
        backInStockObservable.notifyCustomer(bodyLotion);

        OutOfStockObservable outOfStockObservable = new OutOfStockObservable();
        outOfStockObservable.add(textObserver);
        bodyButter.setNumberOfItems(0);
        outOfStockObservable.notifyCustomer(bodyButter);

    }



}
