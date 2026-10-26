package hw8.decorator.food;

import hw8.decorator.FoodItem;

public class FriesItem implements FoodItem {
    private String name;
    private int cost;

    public FriesItem(String name, int cost) {
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
