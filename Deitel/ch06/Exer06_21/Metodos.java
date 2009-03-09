package ch06.Exer06_21;

public class Metodos
{
	public int quociente( int a, int b )
	{
		return a/b;
	}
	public int resto( int a, int b )
	{
		return a%b;
	}
	public void displayDigits( int arg0 )
	{
		int count = 1;
		for ( int i = 1; i <= Integer.toString( arg0 ).length(); i++ )
		{
			System.out.print(resto( quociente( arg0, count), 10)+"  ");
			i *= 10;
		}
	}
}
