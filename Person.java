package startz;
import java.util.*;
class Person {
	String name;
	int age;
//	constructor
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
//	method
	public void display() {
		System.out.println("Employee name: "+name+"Employee age: "+age);
	}

}
//inherits
class Employee extends Person{
	int employeeId;
	int salary;
//	constructor
	public Employee(String name,int age,int employeeId,int salary) {
		super(name,age);
		this.employeeId = employeeId;
		this.salary = salary;
		
	}
//	methodx
	public void display() {
		super.display();
		System.out.println("EmployeeId: "+employeeId+"Salary: "+salary);
		
	}
	public static void main(String[] args) {
		Employee emp = new Employee("Again",18,3121,200000);
		emp.display();
	}
}
