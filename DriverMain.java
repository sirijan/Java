package GGG;
import java.util.Scanner;

//Taxable interface 
interface Taxable {
 double SALES_TAX = 0.07;  // 7% sales tax
 double INCOME_TAX = 0.105; // 10.5% income tax

//Abstract method to calculate tax
 double calcTax();  
 }

//Employee class to calculate income tax
class Employee implements Taxable {
 private int empId;
 private String name;
 private double salary;

 // Constructor initialize employee details
 public Employee(int empId, String name, double salary) {
     this.empId = empId;
     this.name = name;
     this.salary = salary;
 }

 // Implementation of calcTax method for income tax calculation
 public double calcTax() {
// Calculating income tax on yearly salary
     return salary * INCOME_TAX;  
 }

 public String toString() {
     return "Employee ID: " + empId + ", Name: " + name + ", Yearly Salary: Rs:" + salary;
 }
}

//Product class to calculate sales tax
class Product implements Taxable {
 private int pid;
 private double price;
 private int quantity;

 // Constructor to initialize product details
 public Product(int pid, double price, int quantity) {
     this.pid = pid;
     this.price = price;
     this.quantity = quantity;
 }

 // Implementation of calcTax method for sales tax calculation
   public double calcTax() {
	// Calculating sales tax on unit price
     return price * SALES_TAX;  
 }

 public String toString() {
     return "Product ID: " + pid + ", Unit Price: Rs:" + price + ", Quantity: " + quantity;
 }
}

//Main class 
public class DriverMain {
public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Accepting employee information from the user
     System.out.println("Enter Employee Details");
     System.out.print("Employee ID: ");
     int empId = scanner.nextInt();
     scanner.nextLine();  // Consume newline left-over
     System.out.print("Name: ");
     String name = scanner.nextLine();
     System.out.print("Yearly Salary: ");
     double salary = scanner.nextDouble();

     // Create an Employee object
     Employee employee = new Employee(empId, name, salary);

     // Calculate and display income tax for the employee
     System.out.println(employee);
     System.out.println("Income Tax: Rs:" + employee.calcTax());

     // Accepting product information from the user
     System.out.println("\nEnter Product Details:");
     System.out.print("Product ID: ");
     int pid = scanner.nextInt();
     System.out.print("Unit Price: ");
     double price = scanner.nextDouble();
     System.out.print("Quantity: ");
     int quantity = scanner.nextInt();

     // Create a Product object
     Product product = new Product(pid, price, quantity);

     // Calculate and display sales tax for the product
     System.out.println(product);
     System.out.println("Sales Tax on Unit Price: Rs:" + product.calcTax());

     scanner.close();
 }
}