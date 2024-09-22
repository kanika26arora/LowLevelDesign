package org.example.structural.decoratorDesignPattern.topping;

import org.example.structural.decoratorDesignPattern.ToppingDecorator;
import org.example.structural.decoratorDesignPattern.pizza.BasePizza;

public class CheeseTopping extends ToppingDecorator {

    BasePizza basePizza;

    public CheeseTopping(BasePizza basePizza){
        this.basePizza = basePizza;
    }


    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }
}
