package hw7.meals;

public class Customer {
    public String name;
    public DietPlan dietPlan;
    public Carb carb;
    public Protein protein;
    public Fat fat;

    public enum DietPlan {
        NO_RESTRICTION,
        PALEO,
        VEGAN,
        NUT_ALLERGY
    }
}
