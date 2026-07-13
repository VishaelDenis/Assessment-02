package src;

public class StudentAI {

    private int id;
    private String name;
    private String email;
    private String course;
    private boolean present;
    private String date;

    // Constructor
    public StudentAI(int id, String name, String email, String course, String date) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.date = date;
        this.present = false; // default absent
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public boolean isPresent() {
        return present;
    }

    public String getDate() {
        return date;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Display student details
    public void displayStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);
        System.out.println("Status: " + (present ? "Present" : "Absent"));
        System.out.println("Date: " + date);
        System.out.println("---------------------------");
    }
}