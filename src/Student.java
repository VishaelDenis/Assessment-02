package src;

import java.time.LocalDate;

public class Student {
    private String id;
    private String name;
    private String email;
    private String course;
    private boolean present; //true if present, false if absent
    private String date;

    public Student(String id, String name, String email, String course) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        present = false; //everyone starts as absent until marked
        date = LocalDate.now().toString();
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        String status;
        if (present) {
            status = "PRESENT";
        } else {
            status = "ABSENT";
        }

        return "ID: " + id + " | Name: " + name + " | Status: " + status + " | Date: " + date;
    }
}