package Application;

import java.util.Scanner;

public class Bankapp {
	
	public static void main(String[]args) {
		BankAcc ba=new BankAcc("XYZ","AB0005");
		ba.ShowMenu();
		
	}

}
 class BankAcc {
	int balance;
	int PreviousTransaction;
	String CustomerName;
	String CustomerId;
	
	BankAcc(String cname,String cid){
		CustomerName=cname;
		CustomerId=cid;
	}
	void deposit(int amount) {
		if(amount!=0) {
			balance=balance+amount;
			PreviousTransaction=amount;
		}		
	}
	void withdraw(int amount ) {
		if(amount!=0) {
			balance=balance-amount;
			PreviousTransaction=-amount;
		}
	}
	void getPreviousTransaction() {
		if(PreviousTransaction > 0) {
			System.out.println("Deposit :"+PreviousTransaction);
		}
		else if(PreviousTransaction < 0) {
			System.out.println("withdraw :"+Math.abs(PreviousTransaction));
		}
		else {
			System.out.println("No transaction ossured");
		}
	}
	void ShowMenu() {
		char option='\0';
		Scanner sc=new Scanner(System.in);
		
		System.out.println("welcome: "+CustomerName);
		System.out.println("YourId is: "+CustomerId);
		System.out.println("\n");
		System.out.println("A.check Balance");
		System.out.println("B.Deposite");
		System.out.println("C.withdraw");
		System.out.println("D.PreviousTransaction");
		System.out.println("E.exit");
		
		do {
			System.out.println("-------------------");
			System.out.println("Enter an option");
			System.out.println("--------------------");
			option =sc.next().charAt(0);
			System.out.println("\n");
			
			switch (option) { 
				
				case 'A':
					System.out.println("----------");
					System.out.println("Enter an option");
					System.out.println("---------");
					System.out.println("\n");
					break;
				case 'B':
					System.out.println("----------");
					System.out.println("Enter an amount to deposite");
					System.out.println("----------");
					int amount=sc.nextInt();
					deposit(amount);
					System.out.println("\n");
					break;
					
				case 'C':
					System.out.println("----------");
					System.out.println("Enter an amount to withdraw");
					System.out.println("-----------");
					int amount2=sc.nextInt();
					withdraw(amount2);
					System.out.println("\n");
					break;
				case 'D':
					System.out.println("---------");
					getPreviousTransaction();
					System.out.println("----------");
					System.out.println("\n");
					break;
				case 'E':
					System.out.println("----------");
					break;
				default:
					System.out.println("invalid option");
					break;
			}
		}while(option !='E');
		System.out.println("Thank you for using our service");
	}
}
