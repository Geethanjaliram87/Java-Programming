package JavaArraysandCollections.StudentGradeTracker;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateAverage() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ") - Average Grade: " + String.format("%.2f", calculateAverage());
    }
}
