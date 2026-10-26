package hw8.decorator.food;

import hw8.decorator.FoodItem;

public class BurgerItem implements FoodItem {
    private String name;
    private int cost;

    public BurgerItem(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }
    
}
