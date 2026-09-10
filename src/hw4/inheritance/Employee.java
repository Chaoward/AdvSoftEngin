package hw4.inheritance;

public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String socialSecurity;

    public Employee(String f, String l, String ssn) {
        firstName = f;
        lastName = l;
        socialSecurity = ssn;
    }

    public String prettyInfo() {
        return "Name : " + firstName + " " + lastName + "\n"
            + "SSN : " + socialSecurity;
    }



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

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }
}