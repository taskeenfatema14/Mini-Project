package atminterface;

public class ATM {
	private double balance=20000;
	private double withdrawAmt;
	private double depositeAmt;
	
	//getter and setter
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getWithdrawAmt() {
		return withdrawAmt;
	}
	public void setWithdrawAmt(double withdrawAmt) {
		this.withdrawAmt = withdrawAmt;
	}
	public double getDepositeAmt() {
		return depositeAmt;
	}
	public void setDepositeAmt(double depositeAmt) {
		this.depositeAmt = depositeAmt;
	}
	
	

}
