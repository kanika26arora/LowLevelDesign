package org.example.structural.decoratorDesignPattern;

import org.example.structural.decoratorDesignPattern.pizza.BasePizza;
import org.example.structural.decoratorDesignPattern.pizza.MargeritaPizza;
import org.example.structural.decoratorDesignPattern.pizza.VeggiePizza;
import org.example.structural.decoratorDesignPattern.topping.CheeseTopping;
import org.example.structural.decoratorDesignPattern.topping.ChickenTopping;
import org.example.structural.decoratorDesignPattern.topping.CornTopping;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CustomPizza {

    public static void main(String... s){

        Map<String, BasePizza> typeOfPizzaList = new HashMap<>();
        typeOfPizzaList.put("Margerita", new MargeritaPizza());
        typeOfPizzaList.put("Veggie", new VeggiePizza());


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What kinda pizza do you want? Margerita or Veggie");
        String typeOfPizza = myObj.nextLine();

        BasePizza basePizza = typeOfPizzaList.get(typeOfPizza);

        System.out.println("Any topping? Say yes or no");
        String wantTopping = myObj.nextLine();

        BasePizza customPizza = basePizza;

        while(wantTopping.equalsIgnoreCase("yes")){

            System.out.println("What topping would you like?");
            String topping = myObj.nextLine();

            if (topping.equalsIgnoreCase("cheese")){
                customPizza = new CheeseTopping(basePizza);
                basePizza = customPizza;
            }

            if (topping.equalsIgnoreCase("chicken")){
                customPizza = new ChickenTopping(basePizza);
                basePizza = customPizza;
            }

            if (topping.equalsIgnoreCase("corn")){
                customPizza = new CornTopping(basePizza);
                basePizza = customPizza;
            }

            System.out.println("Any other topping? Say yes or no");
            wantTopping = myObj.nextLine();
        }

        //BasePizza customPizza1 = new CornTopping(new ChickenTopping(new MargeritaPizza()));
        System.out.println("The cost of your pizza is "+ customPizza.cost());
    }


}
