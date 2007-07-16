//Parte do exercício 3.12
package ch03.Exer03_12;

public class Account {
	private double balance;

	public Account( double initialBalance )
	{
		if ( initialBalance > 0.0 ) 
			balance = initialBalance; 
	}
	
	//Quetão - Inserir função debit que retira dinheiro da acc
	//			sem deichar saldo negativo
	public void debit(double debito){
		if ( balance-debito >= 0.0 )
			balance -= debito;
		else System.out.println("Debit amount exceeded account balance.");
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
