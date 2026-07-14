package src;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> students = new ArrayList<>();


    public void addStudent(Student student) {
        for (Student s : students) {
            if (s.getId().equals(student.getId())) {
                System.out.println("That ID is already taken, try a different one.");
                return;
            }
        }
        students.add(student);
        System.out.println("Student added.");
    }


    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students yet.");
            return;
        }

        System.out.println("\nHere are all the students:");
        System.out.println("You have " + students.size() + " student(s) total.");
        System.out.println("---------------------");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("---------------------");
    }


    public Student searchStudent(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }


    public void updateStudent(String id, String name, String email, String course) {
        Student student = searchStudent(id);
        if (student != null) {
            student.setName(name);
            student.setEmail(email);
            student.setCourse(course);
            System.out.println("Updated that student's info.");
        } else {
            System.out.println("Couldn't find a student with that ID.");
        }
    }


    public boolean deleteStudent(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                students.remove(s);
                System.out.println("Student removed.");
                return true;
            }
        }
        System.out.println("Couldn't find a student with that ID.");
        return false;
    }


    public void markPresent(String id) {
        Student student = searchStudent(id);
        if (student != null) {
            student.setPresent(true);
            System.out.println(student.getName() + " is marked present for " + student.getDate());
        } else {
            System.out.println("Student not found.");
        }
    }


    public void markAbsent(String id) {
        Student student = searchStudent(id);
        if (student != null) {
            student.setPresent(false);
            System.out.println(student.getName() + " is marked absent for " + student.getDate());
        } else {
            System.out.println("Student not found.");
        }
    }


    public void viewAttendance() {
        if (students.isEmpty()) {
            System.out.println("No students in the system yet.");
            return;
        }

        System.out.println("\nAttendance for today:");
        System.out.println("Date: " + java.time.LocalDate.now());
        System.out.println("------------------------------");

        for (Student s : students) {
            String status;
            if (s.isPresent()) {
                status = "Present";
            } else {
                status = "Absent";
            }
            System.out.println(s.getId() + " - " + s.getName() + " - " + status);
        }

        System.out.println("------------------------------");
        System.out.println("Total students: " + students.size());
    }
}