package hw7.meals.diet_plan;

import hw7.meals.Carb;
import hw7.meals.Fat;
import hw7.meals.Protein;
import hw7.meals.factories.*;

public class PaleoPlan extends DietPlanner {
    private static PaleoPlan instance;

    private PaleoPlan() {}

    public static PaleoPlan getInstance() {
        if (instance == null) {
            instance = new PaleoPlan();
        }
        return instance;
    }

    @Override
    public Carb createCarb() {
        return PistachioFactory.getInstance().createCarb();
    }

    @Override
    public Protein createProtein() {
        ProteinFactory[] factories = new ProteinFactory[] {
            FishFactory.getInstance(),
            ChickenFactory.getInstance(),
            BeefFactory.getInstance()
        };

        return this.getRandomProtein(factories).createProtein();
    }

    @Override
    public Fat createFat() {
        FatFactory[] factories = new FatFactory[] {
            AvocadoFactory.getInstance(),
            TunaFactory.getInstance(),
            PeanutFactory.getInstance()
        };

        return this.getRandomFat(factories).createFat();
    }

}
