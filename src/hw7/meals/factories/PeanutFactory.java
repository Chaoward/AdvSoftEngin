package hw7.meals.factories;

import hw7.meals.Fat;
import hw7.meals.products.Peanuts;

public class PeanutFactory extends FatFactory {
    private static PeanutFactory instance;

    private PeanutFactory() {}

    public static PeanutFactory getInstance() {
        if (instance == null) {
            instance = new PeanutFactory();
        }
        return instance;
    }

    @Override
    public Fat createFat() {
        return new Peanuts();
    }

}
