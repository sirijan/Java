package GGG;
import java.util.Scanner;
//Exception for invalid voter age
class InvalidVoterAgeException extends Exception {
 public InvalidVoterAgeException(String message) {
     super(message);
 }
}
//Voter information
class Voter {
 private int voterId;
 private String name;
 private int age;
// Parameterized constructor with age validation
 public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
     if (age < 18) {
         throw new InvalidVoterAgeException("Invalid age for voter");
     }
     this.voterId = voterId;
     this.name = name;
     this.age = age;
 }
 public String toString() {
     return "Voter [Voter ID: " + voterId + ", Name: " + name + ", Age: " + age + "]";
 }
}

//Main class 
public class VoterManagementSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         // Accepting voter details from the user
         System.out.println("Enter Voter Details:");
         System.out.print("Voter ID: ");
         int voterId = scanner.nextInt();
         scanner.nextLine();//new line
         System.out.print("Name: ");
         String name = scanner.nextLine();
         System.out.print("Age: ");
         int age = scanner.nextInt();

         // Creating a Voter object
         Voter voter = new Voter(voterId, name, age);

         // Displaying voter details
         System.out.println("\nVoter Created Successfully:");
         System.out.println(voter);

     } catch (InvalidVoterAgeException e) {
         // Handling the exception
         System.out.println("Error: " + e.getMessage());
     } finally {
         // Closing scanner
         scanner.close();
     }
 }
}
