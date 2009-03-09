/*
 * Escreva um método que aceita um valor inteiro e retorna o número com seus
 * dígitos invertidos. Por exemplo, dado o número 7.631, o método deve retornar
 * 1.367. Incorpore o método a um aplicativo que lê um valor a partir da entrada
 * fornecida pelo usuário e exibe o resultado.
 */

package ch06.Exer06_26;

import java.util.Scanner;

public class Exer06_26
{
	public void iverte( int arg0 )
	{
		int count = 1;
		for ( int i = 1; i <= Integer.toString( arg0 ).length(); i++ )
		{
			System.out.print( arg0%count );
			count *= 10;
		}
	}

	public static void main ( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Exer06_26 exer = new Exer06_26();
		
		exer.iverte( input.nextInt() );
	}
}
