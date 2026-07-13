package src;

import java.util.Scanner;

public class MainAI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManagerAI manager = new StudentManagerAI();

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Mark Present");
            System.out.println("6. Mark Absent");
            System.out.println("7. Display Attendance");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    System.out.print("Enter Date: ");
                    String date = scanner.nextLine();

                    StudentAI student = new StudentAI(
                            id, name, email, course, date
                    );

                    manager.addStudent(student);
                    break;


                case 2:
                    manager.viewStudents();
                    break;


                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();

                    manager.searchStudent(searchId);
                    break;


                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();

                    manager.deleteStudent(deleteId);
                    break;


                case 5:
                    System.out.print("Enter Student ID: ");
                    int presentId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Date: ");
                    String presentDate = scanner.nextLine();

                    manager.markPresent(presentId, presentDate);
                    break;


                case 6:
                    System.out.print("Enter Student ID: ");
                    int absentId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Date: ");
                    String absentDate = scanner.nextLine();

                    manager.markAbsent(absentId, absentDate);
                    break;


                case 7:
                    manager.displayAttendance();
                    break;


                case 0:
                    System.out.println("Exiting system...");
                    break;


                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);


        scanner.close();
    }
}