package hw4.aggregation;

public class Instructor {
    private String firstName;
    private String lastName;
    private String officeNum;

    public Instructor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNum = "";
    }
    
    public Instructor(String firstName, String lastName, String officeNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNum = officeNum;
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
    public String getOfficeNum() {
        return officeNum;
    }
    public void setOfficeNum(String officeNum) {
        this.officeNum = officeNum;
    }
}
