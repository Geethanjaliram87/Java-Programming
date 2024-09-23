package JavaArraysandCollections.StudentEnrollment;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> students;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Add student to the course
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added to course successfully!");
    }

    // List enrolled students
    public void listEnrolledStudents() {
        if (students.isEmpty()) {
            System.out.println("No students enrolled in " + courseName);
        } else {
            System.out.println("Enrolled Students in " + courseName + ":");
            for (int i = 0; i < students.size(); i++) {
                System.out.println((i + 1) + ". " + students.get(i));
            }
        }
    }

    // Remove student by ID
    public void removeStudent(int studentID) {
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID() == studentID) {
                students.remove(i);
                System.out.println("Student removed from course successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + studentID + " not found.");
        }
    }

    // Get the course name
    public String getCourseName() {
        return courseName;
    }
}
