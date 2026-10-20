package hw7.pizza;

import java.util.ArrayList;
import java.util.List;


public class PizzaBuilder {
    private ArrayList<Pizza.Topping> toppings;
    private String chain;
    private Pizza.Size size;

    public PizzaBuilder() {
        this.chain = "";
        this.size = Pizza.Size.SMALL;
        this.toppings = new ArrayList<Pizza.Topping>();
    }

    public PizzaBuilder(List<Pizza.Topping> toppings, String chain, Pizza.Size size) {
        this.chain = chain;
        this.size = size;
        this.toppings = new ArrayList<Pizza.Topping>(toppings);
    }


    public PizzaBuilder withChain(String c) {
        return new PizzaBuilder(toppings, c, size);
    }

    public PizzaBuilder withTopping(Pizza.Topping top) {
        toppings.add(top);
        return new PizzaBuilder(toppings, chain, size);
    }

    public PizzaBuilder withSize(Pizza.Size s) {
        size = s;
        return new PizzaBuilder(toppings, chain, size);
    }

    public Pizza build() {
        Pizza.Topping[] topArray = new Pizza.Topping[toppings.size()];
        return new Pizza(chain, size, toppings.toArray(topArray));
    }
}
