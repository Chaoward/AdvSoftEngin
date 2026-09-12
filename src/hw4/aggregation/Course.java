package hw4.aggregation;

public class Course {
    public Instructor instructor;
    public Textbook textbook;

    private String name;

    public Course(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(
            "Course : " + name + "\n"
            + "Instructor : " + instructor.getFirstName() + " " + instructor.getLastName() + "\n"
            + "Textbook : " + textbook.getTitle() + ", by " + textbook.getAuthor()
        );
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
