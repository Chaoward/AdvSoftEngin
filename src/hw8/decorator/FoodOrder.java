package hw8.decorator;

public class FoodOrder {
    public FoodItem[] foodItems;

    public FoodOrder(FoodItem[] foodItems) {
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
        System.out.println("==== Order ====");
        for (FoodItem food : foodItems) {
            System.out.println("| " + food.getName() + " : $" + food.getCost());
        }
        System.out.println("TOTAL COST : $" + getTotalCost());
    }
}
