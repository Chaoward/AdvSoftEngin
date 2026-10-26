package hw8.decorator;

public abstract class FoodTopping implements FoodItem {
    private FoodItem foodItem;
    protected int toppingCost;
    protected String toppingName;

    public FoodTopping(FoodItem food) {
        this.foodItem = food;
    }



    @Override 
    public String getName() {
        return toppingName + " " + foodItem.getName();
    }

    @Override 
    public int getCost() {
        return toppingCost + foodItem.getCost();
    }

    public int getToppingCost() {
        return toppingCost;
    }

    public String getToppingName() {
        return toppingName;
    }

    public int getFoodCost() {
        return foodItem.getCost();
    }
}
