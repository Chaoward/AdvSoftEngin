package hw7.meals.factories;

import hw7.meals.Carb;
import hw7.meals.products.Lentils;

public class LentilsFactory extends CarbFactory {
    private static LentilsFactory instance;

    private LentilsFactory() {
        instance = new LentilsFactory();
    }

    public static LentilsFactory getInstance() {
        if (instance == null) {
            instance = new LentilsFactory();
        }
        return instance;
    }

    @Override
    public Carb createCarb() {
        return new Lentils();
    }

}
