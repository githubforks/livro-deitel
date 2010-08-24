package ch08.Exer08_06;

public class SavingsAccount
{
	private static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount(double savingsBalance)
	{
		this.savingsBalance = savingsBalance;
	}
	
	public void calculateMonthlyInterest()
	{
		savingsBalance += (savingsBalance * annualInterestRate)/12;
	}
	
	public static void modifyInterestRate(double interestRate)
	{
		annualInterestRate = interestRate;
	}
	
	public double getSavingsBalance()
	{
		return savingsBalance;
	}
}
