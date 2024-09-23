package JavaArraysandCollections.StudentEnrollment;
public class Student {
    private String name;
    private int studentID;
    private String email;

    // Constructor
    public Student(String name, int studentID, String email) {
        this.name = name;
        this.studentID = studentID;
        this.email = email;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getEmail() {
        return email;
    }

    // toString method for easy display of student details
    @Override
    public String toString() {
        return "Name: " + name + " (ID: " + studentID + ", Email: " + email + ")";
    }
}

