package banking_system;
import java.util.*;
public class BankAccount {
	private String accountHolder;
	private double balance;
	private ArrayList<String> transaction;

	
	public BankAccount(String accoubtHolder) {
		this.accountHolder = accountHolder;
		this.balance = 0.0;
		this.transaction = new ArrayList<>();
		transaction.add("Account created with balance:Rs.0");

	}
	
	//deposit amount method
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
			transaction.add("deposited: Rs : "+amount+", Updated balance: Rs : "+balance);
			System.out.println("Deposite Succesfull!\n Rs: "+amount);
			
		}
		else {
			System.out.println("Deposit Amount invalid!!");
		}
	}
	
	//withdraw amount method
	public void withdraw(double amount) {
		if(amount>0 && amount<balance) {
			balance -= amount;
			transaction.add("Withdrew Amount: Rs: "+amount+"Updated balance: Rs: "+balance);
			System.out.println("Withdraw Succesfull!\n Rs: "+amount);
			
		}
		else {
			System.out.println("Invalid withdraw amount or Insuffcient balance!!");
		}
	}
	
	//check balance amount
	
	public void checkBalance() {
		System.out.println("Current Balance: Rs: "+balance);
	}
	
	//Transaction history
	
	public void transactionHistory() {
		System.out.println("\n Transaction History\n ");
		for(String transactions:transaction) {
			System.out.println(transactions);
		}
	}
	

}
