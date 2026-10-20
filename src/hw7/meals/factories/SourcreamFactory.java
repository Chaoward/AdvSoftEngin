package hw7.meals.factories;

import hw7.meals.Fat;
import hw7.meals.products.Sourcream;

public class SourcreamFactory extends FatFactory {
    private static SourcreamFactory instance;

    private SourcreamFactory() {
        instance = new SourcreamFactory();
    }

    public static SourcreamFactory getInstance() {
        if (instance == null) {
            instance = new SourcreamFactory();
        }
        return instance;
    }

    @Override
    public Fat createFat() {
        return new Sourcream();
    }

}
