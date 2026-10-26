package hw8.decorator.order;

import hw8.decorator.FoodItem;

public class FoodOrder implements CustomerOrder {
    public String name;
    public FoodItem[] foodItems;

    public FoodOrder(String name, FoodItem[] foodItems) {
        this.name = name;
        this.foodItems = foodItems;
    }

    public int getTotalCost() {
        int total = 0;

        for (FoodItem food : foodItems) {
            total += food.getCost();
        }

        return total;
    }

    public void printOrder() {
        System.out.println("==== " + name + " ====");
        for (FoodItem food : foodItems) {
            System.out.println("| " + food.getName() + " : $" + food.getCost());
        }
        System.out.println("TOTAL COST : $" + getTotalCost());
    }

}
