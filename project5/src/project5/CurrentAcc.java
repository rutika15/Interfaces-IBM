package project5;

public class CurrentAcc implements Accounts {
	public CurrentAcc(double bal, double overdraft) {
		super();
		this.bal = bal;
		this.overdraft = overdraft;
	}
	public void setoverdraft(double overdraft)
	{
		this.overdraft=overdraft;
	}

	public double bal;
	public double overdraft;
	@Override
	public void deposit(double amt) {
		// TODO Auto-generated method stub
		bal=bal+amt;
		
	}

	@Override
	public void withdraw(double amt) {
		// TODO Auto-generated method stub
		if(bal+overdraft>=amt)
		{
			bal=bal-amt;
		}
		
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return bal;
	}
	
	

}
