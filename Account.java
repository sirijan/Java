package startz;
import java.util.*;
public class Account {
	double balance;
	double amount;
//	No Arguments constructor
	public Account() {
		
	}
//	method
	public Account(double balance,double amount) {
		this.balance = balance;
		this.amount = amount;
	}
	public void deposit(double amount) {
		if(this.amount>0) {
			this.balance =amount+this.balance;
		}
		System.out.println("Deposited amount: "+balance);
	}
//	method
	public void withdraw(double amount) {
		if(this.balance>amount) {
			this.balance = this.balance-amount;
			System.out.println("Wthdraw amount: "+balance);	
		}
		else {
			System.out.println("Insufficient balance!");
		}
	}
	public void balance() {
	
		System.out.println("Balance: "+this.balance);
	}
	public static void main(String[] args) {
		Account obj = new Account(10,10);
		obj.deposit(3000);
		obj.withdraw(300);
		obj.balance();
		
	}

}
