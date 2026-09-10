package hw4.inheritance;

public class SalariedEmployee extends Employee {
    private float weeklySalary;

    public SalariedEmployee(String f, String l, String ssn) {
        super(f, l, ssn);
        weeklySalary = 0f;
    }

    public SalariedEmployee(String f, String l, String ssn, float sal) {
        super(f, l, ssn);
        weeklySalary = sal;
    }

    public @Override String prettyInfo() {
        return super.prettyInfo() + "\n"
            + "Weekly Salary : " + weeklySalary;
    }



    public float getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(float weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}