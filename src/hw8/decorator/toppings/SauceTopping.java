package hw8.decorator.toppings;

import hw8.decorator.FoodItem;
import hw8.decorator.FoodTopping;

public class SauceTopping extends FoodTopping {

    public SauceTopping(String name, int cost, FoodItem food) {
        super(food);
        this.toppingName = name;
        this.toppingCost = cost;
    }

}
