/*
 * Dizemos que um inteiro é primo se ele é divisível somente por 1 e ele próprio.
 * Por exemplo, 2, 3, 5 e 7 são primos, mas 4, 6, 8 e 9 não o são.
 *
 *      a) Escreva um método que determina se um número é primo.
 *
 *      b) Utilize esse método em um aplicativo que determina e exibe todos os
 *      números primos menores que 10.000. Quantos desses números 10.000 você
 *      precisa testar afim de assegurar que encontrou todos os primos ?
 *
 *      c) Inicialmente você poderia pensar que n/2 é o limite superior que deve
 *      testar para ver se um número é primo, mas você precisa ir apenas até a
 *      raiz quadrada de n. Por quê ? reescreva o programa e execute-o de ambas
 *      as maneiras. Estime o melhor desempenho.
 */

package ch06.Exer06_25;

public class Exer06_25
{
	public boolean ePrimo( int arg0 )
	{
		boolean b = true;
		for ( int i = 2; i <= arg0/2; i++ )
			if( arg0%i == 0 )
				b = false;
		return b;
	}
	
	public static void main ( String args[] )
	{
		Exer06_25 exer = new Exer06_25();
		
		for ( int i = 1; i <= 5000; i++)
			if( exer.ePrimo( i ) )
				System.out.println( i );
	}
}
