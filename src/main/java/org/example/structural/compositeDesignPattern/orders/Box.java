package org.example.structural.compositeDesignPattern.orders;

import java.util.List;

public class Box implements OrderItem{

    List<OrderItem> orderItemList;

    Box(List<OrderItem> orderItemList){
        this.orderItemList = orderItemList;
    }
    @Override
    public int calculatePrice() {

        int sum = 0;

        for(OrderItem orderItem: orderItemList){
            sum += orderItem.calculatePrice();
        }

        return sum;
    }

    public void add(OrderItem orderItem){
        this.orderItemList.add(orderItem);
    }
}
