/*
 * Escreva um aplicativo que solicita ao usuário o raio de um círculo e
 * utiliza um método chamado circleArea para calcular a área do círculo.
 */

package ch06.Exer06_20;

import java.util.Scanner;

public class Exer06_20
{
	public double circleArea( double raio )
	{
		return ( 2*Math.PI*Math.pow( raio, 2 ) );
	}
	
	public static void main ( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Exer06_20 exer = new Exer06_20();
		
		System.out.println( exer.circleArea( input.nextDouble() ) );
	}
}
