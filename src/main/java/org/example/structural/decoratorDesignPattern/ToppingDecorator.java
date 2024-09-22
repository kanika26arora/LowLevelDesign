package org.example.structural.decoratorDesignPattern;

import org.example.structural.decoratorDesignPattern.pizza.BasePizza;

public abstract class ToppingDecorator extends BasePizza {
    @Override
    public abstract int cost();
}
