package hw7.meals.diet_plan;

import java.util.Random;

import hw7.meals.Carb;
import hw7.meals.Fat;
import hw7.meals.Protein;
import hw7.meals.factories.*;

public class StandardDietPlan extends DietPlanner {

    private static StandardDietPlan instance;

    private StandardDietPlan() {}

    public static StandardDietPlan getInstance() {
        if (instance == null) {
            instance = new StandardDietPlan();
        }
        return instance;
    }

    @Override
    public Carb createCarb() {
        CarbFactory[] factories = new CarbFactory[] {
            BreadFactory.getInstance(),
            CheeseFactory.getInstance(),
            LentilsFactory.getInstance(),
            PistachioFactory.getInstance()
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
            TunaFactory.getInstance(),
            PeanutFactory.getInstance()
        };

        return this.getRandomFat(factories).createFat();
    }
    
}
