package hw8.decorator.toppings;

import hw8.decorator.FoodItem;
import hw8.decorator.FoodTopping;

public class CheeseTopping extends FoodTopping {

    public CheeseTopping(String name, int cost, FoodItem food) {
        super(food);
        this.toppingName = name;
        this.toppingCost = cost;
    }

}
