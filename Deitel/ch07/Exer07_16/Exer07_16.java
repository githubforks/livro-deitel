/*
 * Escreva um aplicativo que utiliza uma instrução for aprimorada para somar os
 * valores double passados pelos argumentos de linha de comando. [Dica: Utilize
 * o método static parseDouble da classe Double para converter uma String em um
 * valor double.]
 */

package ch07.Exer07_16;

import ch07.Exer07_14.Calculo;

public class Exer07_16
{
	public static void main( String[] args )
	{
		double n1 = 0, n2 = 0;
		
		if ( args.length < 2 )
			System.out.println( "O programa precisa de pelomenos 2 argumentos numéricos." );
		else
		{
			for (int i = 0; i < args.length; i++)
			{
				n2 = Double.parseDouble( args[i] );
				n1 = n1 + n2;
			}
			System.out.println( n1 );
		}
	}
}
