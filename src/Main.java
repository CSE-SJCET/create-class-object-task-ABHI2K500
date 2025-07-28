// Student class with name, rollNumber, and grade
class Student {
    String name;
    int rollNumber;
    char grade;

    // Constructor to initialize student details
    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Student object and display details
        Student student = new Student("Alex", 101, 'A');
        student.displayDetails();
    }
} 
