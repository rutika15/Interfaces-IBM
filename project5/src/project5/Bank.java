package project5;
import java.util.*;

public class Bank {
	ArrayList<Accounts> acc;
	
	public Bank()
	{
		acc=new ArrayList<>(); 
	}
	public void addAcc(Accounts ac)
	{
		acc.add(ac);
	}
	public void removeAcc(Accounts ac)
	{
		acc.remove(ac);
	}
	public void deposit(Accounts ac,double amt)
	{
		ac.deposit(amt);
	}
	public void withdraw(Accounts ac,double amt)
	{
		ac.withdraw(amt);
	}
	public void printacc()
	{
		for(Accounts a:acc)
		{
			System.out.println("Balance is: "+a.getBalance());
		}
	}

}
