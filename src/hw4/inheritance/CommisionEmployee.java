package hw4.inheritance;

public class CommisionEmployee extends Employee
{
    private float commisionRate;
    private float grossSales;

    public CommisionEmployee(String f, String l, String ssn) {
        super(f, l, ssn);
        commisionRate = 0f;
        grossSales = 0f;
    }

    public CommisionEmployee(String f, String l, String ssn, float rate, float sales) {
        super(f, l, ssn);
        commisionRate = rate;
        grossSales = sales;
    }

    public @Override String prettyInfo() {
        return super.prettyInfo() + "\n"
            + "Commision Rate : " + commisionRate + "\n"
            + "Gross Sales : " + grossSales;
    }



    public float getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(float commisionRate) {
        this.commisionRate = commisionRate;
    }

    public float getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(float grossSales) {
        this.grossSales = grossSales;
    }
}