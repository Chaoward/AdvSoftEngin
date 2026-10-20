package hw7;

import java.util.ArrayList;
import java.util.Random;

import hw7.pizza.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("//// PIZZA BUILDER \\\\\\\\");
        pizza();
    }

    public static void pizza() {
        PizzaBuilder builder = new PizzaBuilder()
            .withChain("Pizza Hut");
        Pizza top3 = builder
            .withSize(Pizza.Size.SMALL)
            .withTopping(Pizza.Topping.PEPPERONI)
            .withTopping(Pizza.Topping.EXTRA_CHEESE)
            .withTopping(Pizza.Topping.TOMATO_BASIL)
            .build();
        Pizza top6 = builder
            .withSize(Pizza.Size.MEDIUM)
            .withTopping(Pizza.Topping.PEPPERONI)
            .withTopping(Pizza.Topping.EXTRA_CHEESE)
            .withTopping(Pizza.Topping.TOMATO_BASIL)
            .withTopping(Pizza.Topping.SAUSAGE)
            .withTopping(Pizza.Topping.SPINACH)
            .withTopping(Pizza.Topping.BACON)
            .build();
        Pizza top9 = builder
            .withSize(Pizza.Size.LARGE)
            .withTopping(Pizza.Topping.PEPPERONI)
            .withTopping(Pizza.Topping.EXTRA_CHEESE)
            .withTopping(Pizza.Topping.TOMATO_BASIL)
            .withTopping(Pizza.Topping.SAUSAGE)
            .withTopping(Pizza.Topping.SPINACH)
            .withTopping(Pizza.Topping.BACON)
            .withTopping(Pizza.Topping.BEEF)
            .withTopping(Pizza.Topping.HAM_PINEAPPLE)
            .withTopping(Pizza.Topping.CHICKEN)
            .build();
        
        top3.eat();
        top6.eat();
        top9.eat();

        System.out.println("\n/////////////////////////\n");
         
        Pizza largeHut3Tops = builder
            .withSize(Pizza.Size.LARGE)
            .withTopping(Pizza.Topping.PEPPERONI)
            .withTopping(Pizza.Topping.EXTRA_CHEESE)
            .withTopping(Pizza.Topping.TOMATO_BASIL)
            .build();
        Pizza smallHut2Tops = builder
            .withSize(Pizza.Size.SMALL)
            .withTopping(Pizza.Topping.HAM_PINEAPPLE)
            .withTopping(Pizza.Topping.HAM)
            .build();
        
        builder = builder.withChain("Little Caesars");
        Pizza medCaesar8Tops = builder
            .withSize(Pizza.Size.MEDIUM)
            .withTopping(Pizza.Topping.PEPPERONI)
            .withTopping(Pizza.Topping.EXTRA_CHEESE)
            .withTopping(Pizza.Topping.TOMATO_BASIL)
            .withTopping(Pizza.Topping.CHICKEN)
            .withTopping(Pizza.Topping.SAUSAGE)
            .withTopping(Pizza.Topping.SPINACH)
            .withTopping(Pizza.Topping.PEPPERS)
            .withTopping(Pizza.Topping.MUSHROOMS)
            .build();
        Pizza smallCaesar6Tops = builder
            .withSize(Pizza.Size.SMALL)
            .withTopping(Pizza.Topping.TOMATO_BASIL)
            .withTopping(Pizza.Topping.CHICKEN)
            .withTopping(Pizza.Topping.SAUSAGE)
            .withTopping(Pizza.Topping.SPINACH)
            .withTopping(Pizza.Topping.PEPPERS)
            .withTopping(Pizza.Topping.MUSHROOMS)
            .build();
            
        builder = builder.withChain("Dominos");
        Pizza smallDom1Top = builder
            .withSize(Pizza.Size.SMALL)
            .withTopping(Pizza.Topping.PEPPERONI)
            .build();
        Pizza largeDom3Tops = builder
            .withSize(Pizza.Size.LARGE)
            .withTopping(Pizza.Topping.PEPPERS)
            .withTopping(Pizza.Topping.OLIVES)
            .withTopping(Pizza.Topping.ONIONS)
            .build();
        
        largeHut3Tops.eat();
        smallHut2Tops.eat();
        medCaesar8Tops.eat();
        smallCaesar6Tops.eat();
        smallDom1Top.eat();
        largeDom3Tops.eat();
    }


    public static void meals() {
        
    }
}