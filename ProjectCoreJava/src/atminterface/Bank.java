package atminterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bank implements AtmInterface {
	ATM obj=new ATM();
	Map<Double,String> m= new HashMap<>();
	
	@Override
	public void viewBalance() {
		System.out.println("Loading Your Balance.....");
		System.out.println("Current Balance : "+obj.getBalance());
		System.out.println();
	}
	@Override
	public void withdrawAmount(double withdrawAmt) {
		Scanner sc=new Scanner(System.in);
		if(withdrawAmt%100==0) {
			if(withdrawAmt<=obj.getBalance()) {
				System.out.println("Confirm : Yes/No");
				String Confirm =sc.next();
				if(Confirm.equals("Yes")||Confirm.equals("yes"))	{
				m.put(withdrawAmt, " Amount Withdrawn");			
				System.out.println(withdrawAmt+" Withdrawn Successfully");
				System.out.println("Collect Your Cash "+ withdrawAmt);
				obj.setBalance(obj.getBalance()-withdrawAmt);
				viewBalance();
				}
				else {
					System.exit(0);
				}
			}
			else
			{
				System.out.println("Insufficient Amount");
			}
			}
		else {
			System.out.println("Enter Aoumnt In Multiple Of 100");
			}
	}
	

		@Override 
		public void depositewAmount(double depositeAmt) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Confirm : Yes/No");
			String Confirm =sc.next();
			if(Confirm.equals("Yes")||Confirm.equals("yes")) {
			m.put(depositeAmt," Deposited Successfully");
			
			System.out.println(depositeAmt+" Deposited Successfully");
			obj.setBalance(obj.getBalance()+depositeAmt);
			viewBalance();
			}
	}
		@Override
		public void viewTransaction() {
			for(Map.Entry<Double,String>a:m.entrySet()) {
					System.out.println(a.getKey()+" "+a.getValue());
		}


	}
}
