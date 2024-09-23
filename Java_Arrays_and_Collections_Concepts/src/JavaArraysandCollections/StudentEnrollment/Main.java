package JavaArraysandCollections.StudentEnrollment;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Course> courses = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Student to Course");
            System.out.println("2. List Enrolled Students");
            System.out.println("3. Remove Student from Course");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudentToCourse(scanner);
                    break;
                case 2:
                    listEnrolledStudents(scanner);
                    break;
                case 3:
                    removeStudentFromCourse(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private static void addStudentToCourse(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        int studentID = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student email: ");
        String email = scanner.nextLine();

        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();

        Course course = findOrCreateCourse(courseName);
        Student student = new Student(name, studentID, email);
        course.addStudent(student);
    }

    private static void listEnrolledStudents(Scanner scanner) {
        System.out.print("Enter course name to list enrolled students: ");
        String courseName = scanner.nextLine();

        Course course = findCourseByName(courseName);
        if (course != null) {
            course.listEnrolledStudents();
        } else {
            System.out.println("Course not found.");
        }
    }

    private static void removeStudentFromCourse(Scanner scanner) {
        System.out.print("Enter course name: ");
        String courseName = scanner.nextLine();

        Course course = findCourseByName(courseName);
        if (course != null) {
            System.out.print("Enter student ID to remove: ");
            int studentID = scanner.nextInt();
            course.removeStudent(studentID);
        } else {
            System.out.println("Course not found.");
        }
    }

    private static Course findOrCreateCourse(String courseName) {
        for (Course course : courses) {
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                return course;
            }
        }
        Course newCourse = new Course(courseName);
        courses.add(newCourse);
        return newCourse;
    }

    private static Course findCourseByName(String courseName) {
        for (Course course : courses) {
            if (course.getCourseName().equalsIgnoreCase(courseName)) {
                return course;
            }
        }
        return null;
    }
}
