package hw7.meals.diet_plan;

import hw7.meals.Carb;
import hw7.meals.Fat;
import hw7.meals.Protein;
import hw7.meals.factories.*;

public class NutAllergyPlan extends DietPlanner {
    private static NutAllergyPlan instance;

    private NutAllergyPlan() {}

    public static NutAllergyPlan getInstance() {
        if (instance == null) {
            instance = new NutAllergyPlan();
        }
        return instance;
    }

    @Override
    public Carb createCarb() {
        CarbFactory[] factories = new CarbFactory[] {
            BreadFactory.getInstance(),
            CheeseFactory.getInstance(),
            LentilsFactory.getInstance()
        };

        return this.getRandomCarb(factories).createCarb();
    }

    @Override
    public Protein createProtein() {
        ProteinFactory[] factories = new ProteinFactory[] {
            FishFactory.getInstance(),
            ChickenFactory.getInstance(),
            BeefFactory.getInstance(),
            TofuFactory.getInstance()
        };

        return this.getRandomProtein(factories).createProtein();
    }

    @Override
    public Fat createFat() {
        FatFactory[] factories = new FatFactory[] {
            AvocadoFactory.getInstance(),
            SourcreamFactory.getInstance(),
            TunaFactory.getInstance()
        };

        return this.getRandomFat(factories).createFat();
    }
}
