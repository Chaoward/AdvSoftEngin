package hw7.meals.factories;

import hw7.meals.Protein;
import hw7.meals.products.Chicken;

public class ChickenFactory extends ProteinFactory {
    private static ChickenFactory instance;

    private ChickenFactory() {
        instance = new ChickenFactory();
    }

    public static ChickenFactory getInstance() {
        if (instance == null) {
            instance = new ChickenFactory();
        }
        return instance;
    }

    @Override
    public Protein createProtein() {
        return new Chicken();
    }

}
