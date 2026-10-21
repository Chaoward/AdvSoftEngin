package hw7.meals.factories;

import hw7.meals.Fat;
import hw7.meals.products.Tuna;

public class TunaFactory extends FatFactory {
    private static TunaFactory instance;

    private TunaFactory() {}

    public static TunaFactory getInstance() {
        if (instance == null) {
            instance = new TunaFactory();
        }
        return instance;
    }

    @Override
    public Fat createFat() {
        return new Tuna();
    }

}
