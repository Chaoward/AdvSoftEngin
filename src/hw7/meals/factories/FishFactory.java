package hw7.meals.factories;

import hw7.meals.Protein;
import hw7.meals.products.Fish;

public class FishFactory extends ProteinFactory {
    private static FishFactory instance;

    private FishFactory() {
        instance = new FishFactory();
    }

    public static FishFactory getInstance() {
        if (instance == null) {
            instance = new FishFactory();
        }
        return instance;
    }

    @Override
    public Protein createProtein() {
        return new Fish();
    }

}
