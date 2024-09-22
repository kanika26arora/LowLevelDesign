package org.example.structural.decoratorDesignPattern.topping;

import org.example.structural.decoratorDesignPattern.ToppingDecorator;
import org.example.structural.decoratorDesignPattern.pizza.BasePizza;

public class CornTopping extends ToppingDecorator {

    BasePizza basePizza;

    public CornTopping(BasePizza basePizza){
        this.basePizza = basePizza;
    }


    @Override
    public int cost() {
        return basePizza.cost() + 2;
    }
}
