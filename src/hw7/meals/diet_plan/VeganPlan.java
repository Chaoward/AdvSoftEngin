package hw7.meals.diet_plan;

import hw7.meals.Carb;
import hw7.meals.Fat;
import hw7.meals.Protein;
import hw7.meals.factories.*;

public class VeganPlan extends DietPlanner {
    private static VeganPlan instance;

    private VeganPlan() {}

    public static VeganPlan getInstance() {
        if (instance == null) {
            instance = new VeganPlan();
        }
        return instance;
    }

    @Override
    public Carb createCarb() {
        CarbFactory[] factories = new CarbFactory[] {
            BreadFactory.getInstance(),
            LentilsFactory.getInstance(),
            PistachioFactory.getInstance()
        };

        return this.getRandomCarb(factories).createCarb();
    }

    @Override
    public Protein createProtein() {
        return TofuFactory.getInstance().createProtein();
    }

    @Override
    public Fat createFat() {
        FatFactory[] factories = new FatFactory[] {
            AvocadoFactory.getInstance(),
            PeanutFactory.getInstance()
        };

        return this.getRandomFat(factories).createFat();
    }

}
