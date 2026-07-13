package src;

import java.util.ArrayList;

public class StudentManagerAI {

    private ArrayList<StudentAI> students;

    // Constructor
    public StudentManagerAI() {
        students = new ArrayList<>();
    }

    // Add student
    public void addStudent(StudentAI student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // View all students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (StudentAI student : students) {
            student.displayStudent();
        }
    }

    // Search student by ID
    public void searchStudent(int id) {
        for (StudentAI student : students) {
            if (student.getId() == id) {
                student.displayStudent();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Delete student by ID
    public void deleteStudent(int id) {
        for (StudentAI student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Mark student present
    public void markPresent(int id, String date) {
        for (StudentAI student : students) {
            if (student.getId() == id) {
                student.setPresent(true);
                student.setDate(date);
                System.out.println("Student marked present.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Mark student absent
    public void markAbsent(int id, String date) {
        for (StudentAI student : students) {
            if (student.getId() == id) {
                student.setPresent(false);
                student.setDate(date);
                System.out.println("Student marked absent.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Display attendance status
    public void displayAttendance() {
        for (StudentAI student : students) {
            System.out.println(
                    "ID: " + student.getId() +
                            " | Name: " + student.getName() +
                            " | Status: " + (student.isPresent() ? "Present" : "Absent") +
                            " | Date: " + student.getDate()
            );
        }
    }
}
