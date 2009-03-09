/*
 * Escreva um método minimum3 que retorna o menor de três números de ponto
 * flutuante. Utilize o método Math.min para implementar minimun3. Incorpore o
 * método a um aplicativo que lê três valores do usuário, determina o menor valor
 * e exibe o resultado.
 */

package ch06.Exer06_23;

import java.util.Scanner;

public class Exer06_23
{
	public double minimun3( double arg0, double arg1, double arg2)
	{
		return Math.min( Math.min( arg0, arg1 ), arg2 );
	}
	
	public static void main( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Exer06_23 exer = new Exer06_23();
		double n1, n2, n3;
		
		System.out.print( "n1: " );
		n1 = input.nextDouble();
		System.out.print( "n2: " );
		n2 = input.nextDouble();
		System.out.print( "n3: " );
		n3 = input.nextDouble();
		
		System.out.println( "Menor: " + exer.minimun3( n1, n2, n3 ) );
	}
}
