package hw8.decorator;

public abstract class FoodTopping implements FoodItem {
    private FoodItem foodItem;
    protected int toppingCost;
    protected String toppingName;

    @Override 
    public String getName() {
        return toppingName;
    }

    @Override 
    public int getCost() {
        return toppingCost + foodItem.getCost();
    }

    public int getToppingCost() {
        return toppingCost;
    }
}
