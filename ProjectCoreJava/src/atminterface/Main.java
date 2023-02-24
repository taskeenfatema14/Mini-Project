package atminterface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AtmInterface op=new Bank();
		Scanner sc=new Scanner(System.in);
		int userpin=1402;
		System.out.println("Welcome To Your Bank Account !!");
		
		while(true) {
			
			System.out.println("\n1.View Balance\n2.Withdraw Balance\n3.Deposite Balance\n4.View Transaction\n5.Exit\n");
			System.out.print("Enter Your Choice : ");
			int choice=sc.nextInt();
			System.out.print("Enter ATM Pin : ");
			int pin=sc.nextInt();
			
			
			if(choice==1) {
				if(userpin==pin) {
					System.out.println("Verified Pin!!!");
					System.out.println("---------------------");
					op.viewBalance();
				}
				else {
					System.out.println("Incorrrect Pin");
					System.exit(0);
				}
				
			}
			else if(choice==2) {
				if(userpin==pin) {
				System.out.println("Verified Pin!!!");
				System.out.println("---------------------");
				System.out.print("Enter Amount To Withdraw : ");
				double withdrawAmt=sc.nextDouble();
				op.withdrawAmount(withdrawAmt);
				}
				else {
					System.out.println("Incorrrect Pin");
					System.exit(0);
				}
			}	
			else if(choice==3) {
				if(userpin==pin) {
					System.out.println("Verified Pin!!!");
					System.out.println("---------------------");
					System.out.print("Enter Amount To Deposite : ");
					double depositeAmt=sc.nextDouble();
					op.depositewAmount(depositeAmt);
					}
				else
				{ 
					System.out.println("Incorrrect Pin");
					System.exit(0);
				}
			}
			else if(choice==4) {
				if(userpin==pin) {
					System.out.println("Verified Pin!!!");
					System.out.println("Transaction Satement");
					System.out.println("---------------------");
					op.viewTransaction();
				}
				else
				{ 
					System.out.println("Incorrrect Pin");
					System.exit(0);
				}
			}
			else if(choice==5) {
				System.out.println("---------------------");
				System.out.println("Collect Your ATM Card\nThank You For Visiting!!!");
				System.exit(0);
			}
			else {
				System.out.println("Incorrect Choice....\nPlease Enter Valid Choice");
			}
		}
	}
}
		