package hw4.inheritance;

public class HourlyEmployee extends Employee {
    private float wage;
    private float hoursWorked;

    public HourlyEmployee(String f, String l, String ssn) {
        super(f, l, ssn);
        wage = 0f;
        hoursWorked = 0f;
    }

    public HourlyEmployee(String f, String l, String ssn, float w, float hrs) {
        super(f, l, ssn);
        wage = w;
        hoursWorked = hrs;
    }

    @Override
    public String prettyInfo() {
        return super.prettyInfo() + "\n"
            + "Wage : " + wage + "\n"
            + "Hours Worked : " + hoursWorked;
    }



    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
