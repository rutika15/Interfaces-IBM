package project5;

public class Bankmain {
	public static void main(String args[])
	{
		Bank b=new Bank();
		SavingsAcc sa=new SavingsAcc(300.0);
		CurrentAcc ca=new CurrentAcc(200.0,100.0);
		b.addAcc(sa);
		b.addAcc(ca);
		System.out.println("deposit 100 to savings acc");
		b.deposit(sa, 100.0);
		System.out.println("deposit 10 to current acc");
		b.deposit(ca, 10.0);
		System.out.println("withdraw 20 to savings acc");
		b.printacc();
		
		
	}

}
