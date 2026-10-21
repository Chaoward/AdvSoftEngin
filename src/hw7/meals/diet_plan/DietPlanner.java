package hw7.meals.diet_plan;

import java.util.Random;

import hw7.meals.Carb;
import hw7.meals.Fat;
import hw7.meals.Protein;
import hw7.meals.factories.CarbFactory;
import hw7.meals.factories.FatFactory;
import hw7.meals.factories.ProteinFactory;

public abstract class DietPlanner {
    private Random rand;

    protected DietPlanner() {
        rand = new Random();
    }

    public abstract Carb createCarb();
    public abstract Protein createProtein();
    public abstract Fat createFat();

    protected FatFactory getRandomFat(FatFactory[] factories) {
        return factories[rand.nextInt(0, factories.length-1)];
    }

    protected CarbFactory getRandomCarb(CarbFactory[] factories) {
        return factories[rand.nextInt(0, factories.length-1)];
    }

    protected ProteinFactory getRandomProtein(ProteinFactory[] factories) {
        return factories[rand.nextInt(0, factories.length-1)];
    }
}
