package ch03.exercicios;

public class Exer3_12 {
	private double balance;

	public Exer3_12( double initialBalance )
	{
		if ( initialBalance > 0.0 ) 
			balance = initialBalance; 
	}

	public void credit( double amount )
	{      
		balance = balance + amount;
	}

	public double getBalance()
	{
		return balance;
	}
}
