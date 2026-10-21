package hw7.meals;

import hw7.meals.diet_plan.DietPlanner;

public class Customer {
    public String name;
    public DietPlanner dietPlan;

    public Customer(String name, DietPlanner planner) {
        this.name = name;
        this.dietPlan = planner;
    }

    public void printPlan() {
        System.out.println("===== " + name + " =====");
        System.out.println("Carb: " + dietPlan.createCarb().name());
        System.out.println("Protein: " + dietPlan.createProtein().name());
        System.out.println("Fat: " + dietPlan.createFat().name());
    }
}
