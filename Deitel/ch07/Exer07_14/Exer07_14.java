/*
 * Escreva um aplicativo que calcule o produto de uma série de inteiros que são
 * passados para o método product utilizando uma lista de argumentos de comprimento
 * variável. Teste seu método com variáveis chamadas, cada uma com um número
 * diferente de argumentos.
 */

package ch07.Exer07_14;

public class Exer07_14
{
	public static void main( String[] args )
	{
		Calculo c = new Calculo();
		int n1 = 1, n2 = 0;
		
		if ( args.length < 2 )
			System.out.println( "O programa precisa de pelomenos 2 argumentos numéricos." );
		else
		{
			for (int i = 0; i < args.length; i++)
			{
				n2 = Integer.parseInt( args[i] );
				n1 = c.product( n1, n2 );
			}
			System.out.println( n1 );
		}
	}
}
