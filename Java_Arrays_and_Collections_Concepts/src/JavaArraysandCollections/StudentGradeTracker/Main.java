package JavaArraysandCollections.StudentGradeTracker;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeBook gradeBook = new GradeBook();
        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Calculate Average for a Student");
            System.out.println("3. Calculate Class Average");
            System.out.println("4. Display Student List (sorted by average)");
            System.out.println("5. Search for Student");
            System.out.println("6. Remove Student");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter student grades (comma-separated): ");
                    String[] gradesInput = scanner.next().split(",");
                    ArrayList<Integer> grades = new ArrayList<>();
                    for (String grade : gradesInput) {
                        grades.add(Integer.parseInt(grade.trim()));
                    }
                    gradeBook.addStudent(name, id, grades);
                    break;

                case 2:
                    System.out.print("Enter student ID: ");
                    id = scanner.nextInt();
                    Student student = gradeBook.searchStudentById(id);
                    if (student != null) {
                        System.out.println("Average Grade for " + student.getName() + ": " + student.calculateAverage());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    double classAverage = gradeBook.calculateClassAverage();
                    System.out.println("Class Average: " + String.format("%.2f", classAverage));
                    break;

                case 4:
                    gradeBook.displaySortedStudents();
                    break;

                case 5:
                    System.out.print("Enter student ID: ");
                    id = scanner.nextInt();
                    student = gradeBook.searchStudentById(id);
                    if (student != null) {
                        System.out.println(student);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter student ID to remove: ");
                    id = scanner.nextInt();
                    if (gradeBook.removeStudentById(id)) {
                        System.out.println("Student removed successfully!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
