package hw7.meals.factories;

import hw7.meals.Protein;
import hw7.meals.products.Beef;

public class BeefFactory extends ProteinFactory {
    private static BeefFactory instance;

    private BeefFactory() {
        instance = new BeefFactory();
    }

    public static BeefFactory getInstance() {
        if (instance == null) {
            instance = new BeefFactory();
        }
        return instance;
    }

    @Override
    public Protein createProtein() {
        return new Beef();
    }

}
