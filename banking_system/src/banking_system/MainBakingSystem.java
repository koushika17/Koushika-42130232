package banking_system;
import java.util.*;
public class MainBakingSystem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int pin = 7373;
		int atempt = 3;
		
		System.out.println("Welcome To Banking System!!");
		while (atempt > 0) {
			System.out.println("Please Enter Your 4-Digit Pin Number: ");
			int enteredpin = in.nextInt();
			if(enteredpin==pin) {
				System.out.println("PIN Verified Successfully!\n");
				break;
			}
			else {
				atempt--;
				if(atempt>0) {
					System.out.println("Incorrect PIN!");
					
				}
				else {
					System.out.println("\nYou Reached Maximum attempts\nAccount Locked!!\n");
					
				}
				return;
			}
		}
			

		in.nextLine();
		System.out.println("Enter Your Name : ");
		String name = in.nextLine();
		
		BankAccount a = new BankAccount(name);
		
		boolean exit = false;
		while(!exit) {
			System.out.println("\nWelcome " + name + "! Please choose an option:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = in.nextInt();
            
            switch(choice) {
            
            case 1:
            	System.out.println("Enter the deposite amount : ");
            	double d = in.nextDouble();
            	a.deposit(d);
            	break;
             
            case 2:
            	System.out.println("Enter the Withdraw amount : ");
            	double w = in.nextDouble();
            	a.withdraw(w);
            	break;
            	
            case 3:
                a.checkBalance();
                break;
                
            case 4:
            	a.transactionHistory();
            	break;
            	
            case 5:
            	exit = true;
            	System.out.println("THANK YOU !!!");
            	break;
            
            default:
            	System.out.println("Choice Invalid.../n Please try agin with given Choice.!");
            }
		}

			}
		}


