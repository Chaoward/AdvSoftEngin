package hw7.meals.factories;

import hw7.meals.Carb;
import hw7.meals.products.Cheese;

public final class CheeseFactory extends CarbFactory {
    private static CheeseFactory instance;

    private CheeseFactory() {
        instance = new CheeseFactory();
    }

    public static CheeseFactory getInstance() {
        if (instance == null) {
            instance = new CheeseFactory();
        }
        return instance;
    }


    @Override
    public Carb createCarb() {
        return new Cheese();
    }

}
