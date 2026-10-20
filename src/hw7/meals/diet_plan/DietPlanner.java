package hw7.meals.diet_plan;

import hw7.meals.Carb;
import hw7.meals.Fat;
import hw7.meals.Protein;

public abstract class DietPlanner {
    public abstract Carb createCarb();
    public abstract Protein createProtein();
    public abstract Fat createFat();
}
