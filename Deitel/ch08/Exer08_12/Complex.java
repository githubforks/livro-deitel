package ch08.Exer08_12;

public class Complex
{
	private double parteReal, parteImaginaria;
	
	public Complex()
	{
		parteReal = 0;
		parteImaginaria = 1;
	}
	
	public Complex(double real, double img)
	{
		parteReal = real;
		parteImaginaria = img;
	}
	
	public void somar(double real, double img)
	{
		parteReal += real;
		parteImaginaria += img;
	}
	
	public void subtrair(double real, double img)
	{
		parteReal += real;
		parteImaginaria += img;
	}
	
	public void imprimir1()
	{
		System.out.printf("(%2.2f,%2.2f)",parteReal,parteImaginaria);
	}
	
	public void imprimir2()
	{
		if( parteImaginaria >= 0 )
			System.out.printf("%2.2f + %2.2f * √-1",parteReal,parteImaginaria);
		else
			System.out.printf("%2.2f %2.2f * √-1",parteReal,parteImaginaria);
	}
}
