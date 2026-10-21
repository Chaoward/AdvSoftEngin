package hw7.meals.factories;

import hw7.meals.Carb;
import hw7.meals.products.Pistachio;

public class PistachioFactory extends CarbFactory {
    private static PistachioFactory instance;

    private PistachioFactory() {}

    public static PistachioFactory getInstance() {
        if (instance == null) {
            instance = new PistachioFactory();
        }
        return instance;
    }

    @Override
    public Carb createCarb() {
        return new Pistachio();
    }
}
