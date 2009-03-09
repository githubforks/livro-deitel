package ch06.Exer06_14;

public class Power
{
	public int integerPower( int arg0, int arg1)
	{
		int num = arg0;
		
		for( int i = 2; i <= arg1; i++ )
			num *= arg0;
		
		return num;
	}
}
