package hw7.meals.factories;

import hw7.meals.Protein;
import hw7.meals.products.Tofu;

public class TofuFactory extends ProteinFactory {
    private static TofuFactory instance;

    private TofuFactory() {
        instance = new TofuFactory();
    }

    public static TofuFactory getInstance() {
        if (instance == null) {
            instance = new TofuFactory();
        }
        return instance;
    }

    @Override
    public Protein createProtein() {
        return new Tofu();
    }

}
