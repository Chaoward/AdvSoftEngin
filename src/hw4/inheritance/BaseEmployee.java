package hw4.inheritance;

public class BaseEmployee extends Employee {
    private float baseSalary;

    public BaseEmployee(String f, String l, String ssn) {
        super(f, l, ssn);
        baseSalary = 0f;
    }

    public BaseEmployee(String f, String l, String ssn, float sal) {
        super(f, l, "");
        baseSalary = sal;
    }

    @Override
    public String prettyInfo() {
        return super.prettyInfo() + "\n"
            + "Base Salary : " + baseSalary;
    }



    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }
}