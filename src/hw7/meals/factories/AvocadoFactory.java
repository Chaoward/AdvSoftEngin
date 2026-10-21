package hw7.meals.factories;

import hw7.meals.Fat;
import hw7.meals.products.Avocado;

public class AvocadoFactory extends FatFactory {
    private static AvocadoFactory instance;

    private AvocadoFactory() {}

    public static AvocadoFactory getInstance() {
        if (instance == null) {
            instance = new AvocadoFactory();
        }
        return instance;
    }

    @Override
    public Fat createFat() {
        return new Avocado();
    }

}
