package GGG;
import java.util.Scanner;

//Exception for handling age not within the specified range
class AgeNotWithinRangeException extends Exception {
 public AgeNotWithinRangeException(String message) {
     super(message);
 }
}

//Exception for handling invalid names
class NameNotValidException extends Exception {
 public NameNotValidException(String message) {
     super(message);
 }
}

//Student class to represent student information
class Student {
 private int rollNo;
 private String name;
 private int age;
 private String course;

 // Constructor to initialize student details with validations
 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
     this.rollNo = rollNo;
     setName(name);
     setAge(age);
     this.course = course;
 }

 // Validate and set age
 public void setAge(int age) throws AgeNotWithinRangeException {
     if (age < 15 || age > 21) {
         throw new AgeNotWithinRangeException("Age not within valid range (15-21). Provided age: " + age);
     }
     this.age = age;
 }

 // Validate and set name
 public void setName(String name) throws NameNotValidException {
     if (!name.matches("[a-zA-Z ]+")) {  // Only allows letters and spaces
         throw new NameNotValidException("Name is not valid. It should not contain numbers or special symbols. Provided name: " + name);
     }
     this.name = name;
 }

 // Overriding toString method to display student details
 public String toString() {
     return "Student [Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course + "]";
 }
}

//Main class 
public class StudentManagementSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         // Accepting student details from the user
         System.out.println("Enter Student Details:");
         System.out.print("Roll No: ");
         int rollNo = scanner.nextInt();
         scanner.nextLine();  // Consume newline left-over
         System.out.print("Name: ");
         String name = scanner.nextLine();
         System.out.print("Age: ");
         int age = scanner.nextInt();
         scanner.nextLine();  // Consume newline left-over
         System.out.print("Course: ");
         String course = scanner.nextLine();

         // Creating a Student object
         Student student = new Student(rollNo, name, age, course);

         // Displaying student details
         System.out.println("\nStudent Created Successfully:");
         System.out.println(student);
         
     } catch (AgeNotWithinRangeException | NameNotValidException e) {
         // Handling exceptions
         System.out.println("Error: " + e.getMessage());
     } finally {
         // Closing scanner
         scanner.close();
     }
 }
}