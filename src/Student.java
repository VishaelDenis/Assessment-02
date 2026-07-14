package src;

import java.time.LocalDate;

public class Student {
    private String id;
    private String name;
    private String email;
    private String course;
    private boolean present;
    private String date;

    public Student(String id, String name, String email, String course) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        present = false;
        date = LocalDate.now().toString();
    }

    public String getId() {return id;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getCourse() {return course;}

    public boolean isPresent() {
        return present;
    }
    public String getDate() {
        return date;
    }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setCourse(String course) { this.course = course; }
    public void setPresent(boolean present) { this.present = present; }

    @Override
    public String toString(){
        String status;
        if (present) {
            status = "PRESENT";
        } else {
            status = "ABSENT";
        }

        return "ID: " + id + " , Name: " + name + " , Status: " + status + " , Date: " + date;
    }
}