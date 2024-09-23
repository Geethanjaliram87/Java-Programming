package JavaArraysandCollections.StudentGradeTracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GradeBook {
    private ArrayList<Student> roster;

    public GradeBook() {
        roster = new ArrayList<>();
    }

    public void addStudent(String name, int id, ArrayList<Integer> grades) {
        Student student = new Student(id, name);
        for (int grade : grades) {
            student.addGrade(grade);
        }
        roster.add(student);
        System.out.println("Student added successfully!");
    }

    public double calculateClassAverage() {
        return roster.stream().mapToDouble(Student::calculateAverage).average().orElse(0);
    }

    public void displaySortedStudents() {
        Collections.sort(roster, Comparator.comparingDouble(Student::calculateAverage).reversed());
        System.out.println("Student List (sorted by average):");
        for (Student student : roster) {
            System.out.println(student);
        }
    }

    public Student searchStudentById(int id) {
        for (Student student : roster) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public boolean removeStudentById(int id) {
        return roster.removeIf(student -> student.getId() == id);
    }
}

