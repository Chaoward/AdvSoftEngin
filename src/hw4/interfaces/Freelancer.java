package hw4.interfaces;

public class Freelancer implements IPayable {
    private static double MAX_WORKING_HOURS = 40d;
    private static double OVERTIME_MULTIPLIER = 1.5d;

    private String firstName;
    private String lastName;
    private double hourlyRate;
    private double hoursWorked;

    public Freelancer(String firstName, String lastName, double hourlyRate, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        return hourlyRate * (
            Math.min(hoursWorked, MAX_WORKING_HOURS)
            + (Math.max( hoursWorked - MAX_WORKING_HOURS, 0d ) * OVERTIME_MULTIPLIER)
        );
    }

    @Override
    public String getPayeeName() {
        return firstName + " " + lastName;
    }

    @Override
    public void print() {
        System.out.print(
            "Name : " + getPayeeName() + "\n"
            + "Payment : $"
        );
        System.out.format("%.2f", calculatePayment());
    }
    

    //===== Getters Setters =====
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
