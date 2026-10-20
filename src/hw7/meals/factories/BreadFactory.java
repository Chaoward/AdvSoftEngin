package hw7.meals.factories;

import hw7.meals.Carb;
import hw7.meals.products.Bread;

public class BreadFactory extends CarbFactory {
    private static BreadFactory instance;

    private BreadFactory() {
        instance = new BreadFactory();
    }

    public static BreadFactory getInstance() {
        if (instance == null) {
            instance = new BreadFactory();
        }
        return instance;
    }

    @Override
    public Carb createCarb() {
        return new Bread();
    }

}
