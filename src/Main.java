package src;

import java.util.Scanner;

public class Main {

    private static StudentManager manager = new StudentManager();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Student Management System");
        System.out.println("(with attendance tracking)");
        System.out.println("Today's date: " + java.time.LocalDate.now());

        int choice;
        do {
            displayMenu();
            choice = getChoice();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    markAttendance();
                    break;
                case 4:
                    viewAttendance();
                    break;
                case 5:
                    searchStudent();
                    break;
                case 6:
                    updateStudent();
                    break;
                case 7:
                    deleteStudent();
                    break;
                case 8:
                    System.out.println("Thank you.");
                    break;
                default:
                    System.out.println("Invalid option, try again.");
            }
        } while (choice != 8);
    }


    private static void displayMenu() {
        System.out.println("\nWhat do you want to do?");
        System.out.println("1. Add a student");
        System.out.println("2. View all students");
        System.out.println("3. Mark attendance");
        System.out.println("4. View attendance");
        System.out.println("5. Search for a student");
        System.out.println("6. Update a student");
        System.out.println("7. Delete a student");
        System.out.println("8. Exit");
        System.out.print("Choice: ");
    }

    private static int getChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void addStudent() {
        System.out.println("\nAdd a new student.");
        System.out.print("Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Course: ");
        String course = scanner.nextLine();

        Student student = new Student(id, name, email, course);
        manager.addStudent(student);
    }

    private static void viewAllStudents() {
        manager.viewAllStudents();
    }

    private static void markAttendance() {
        System.out.println("\nMark attendance for a student.");
        System.out.print("Student ID: ");
        String id = scanner.nextLine();
        System.out.println("1. Present");
        System.out.println("2. Absent");
        System.out.print("Which one? ");
        int choice = Integer.parseInt(scanner.nextLine());

        if (choice == 1) {
            manager.markPresent(id);
        } else if (choice == 2) {
            manager.markAbsent(id);
        } else {
            System.out.println("That's not 1 or 2.");
        }
    }

    private static void viewAttendance() {
        manager.viewAttendance();
    }

    private static void searchStudent() {
        System.out.print("\nWhich student ID are you looking for? ");
        String id = scanner.nextLine();
        Student student = manager.searchStudent(id);
        if (student != null) {
            System.out.println("Found them:");
            System.out.println(student);
        } else {
            System.out.println("No student with that ID.");
        }
    }

    private static void updateStudent() {
        System.out.println("\nUpdating a student's details.");
        System.out.print("Student ID: ");
        String id = scanner.nextLine();
        System.out.print("New name: ");
        String name = scanner.nextLine();
        System.out.print("New email: ");
        String email = scanner.nextLine();
        System.out.print("New course: ");
        String course = scanner.nextLine();
        manager.updateStudent(id, name, email, course);
    }

    private static void deleteStudent() {
        System.out.print("\nWhich student ID do you want to delete? ");
        String id = scanner.nextLine();
        manager.deleteStudent(id);
    }
}