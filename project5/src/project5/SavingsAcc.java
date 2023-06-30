package project5;

public class SavingsAcc implements Accounts {
	public SavingsAcc(double balance) {
		super();
		this.balance = balance;
	}

	

	public double balance;
	

	@Override
	public void deposit(double amt) {
		// TODO Auto-generated method stub
		balance=balance+amt;
		
		
	}

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		balance=balance-amt;
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
	

}
