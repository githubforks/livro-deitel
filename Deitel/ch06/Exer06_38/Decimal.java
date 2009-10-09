package ch06.Exer06_38;

public class Decimal
{
	private String c;
	private int b;

	public String toBinario(int d)
	{
		// Algoritmo copiado de http://www.guj.com.br/posts/list/22288.java
		c = new String("");
		b = 0;
		while((d/2)>=1)
		{
			c = d % 2 + c;
			d = d/2;
		}
		c = d + c;
		
		return c;
		
		// Pode-se substituir todo o algoritmo pela linha abaixo
		// return Integer.toBinaryString( i );
	}
	
	public String toOctal( int d )
	{
		c = new String("");
		b = 0;
		while((d/8)>=1)
		{
			c = d % 8 + c;
			d = d/8;
		}
		c = d + c;
		
		return c;
		
		// Pode-se substituir todo o algoritmo pela linha abaixo
		// return Integer.toOctalString( d );
	}
	
	public String toHexadecimal( int num )
	{
		String[] nums = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
		String fim = "";
		
		do
		{
			fim = nums[ num % 16 ] + fim;
			num = num/16;
		}
		while ( num/16 >= 1 );
		
		fim = nums[num % 16] + fim;
		
		return fim;
		// Pode-se substituir todo o algoritmo pela linha abaixo
		// return Integer.toHexString( num );
	}
}
