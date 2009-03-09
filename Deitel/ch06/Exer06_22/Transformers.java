package ch06.Exer06_22;

public class Transformers
{
	public double celsius( double Fahrenheit)
	{
		return ( 5.0 / 9.0 * ( Fahrenheit - 32 ) );
	}
	public double fahrenheit( double Celsius )
	{
		return ( 9.0 / 5.0 * ( Celsius - 32 ) );
	}
}
