package startz;
import java.util.Scanner;
public class Person {
    //instance variable
    Scanner sc = new Scanner(System.in);
    public String name = sc.nextLine();
    public int age = 18;
    //Default Constructor
    public Person(){

    }
    //Method to display output
    public void display(){
//    System.out.print(name);
    System.out.println("Age: "+age);
    }
    public static void main(String[] args){
        System.out.print("Enter the name: ");
        Person person = new Person();
        person.display();
    }
}
