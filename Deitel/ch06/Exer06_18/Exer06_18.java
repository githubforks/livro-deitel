/*
 * Escreva um método squareOfAsterisks que exibe um quadrado sólido (o mesmo
 * número de linhas e colunas) de asteriscos cujo lado é especificado no
 * parâmetro inteiro side. Por exemplo, se side for 4, o método deve exibir
 *					****
 *					****
 *					****
 *					****
 * Incorpore esse método a um aplicativo que lê um valor inteiro para side a
 * partir da entrada fornecida pelo usuário e gera a saída dos asteriscos com o
 * método squareOfAsterisks
 */

package ch06.Exer06_18;

import java.util.Scanner;

public class Exer06_18
{
	public void squareOfAsterisks( int side )
	{
		for( int i = 1; i <= side; i++ )
		{
			for( int j = 1; j <= side; j++ )
				System.out.print( "*" );
			System.out.println();
		}
	}
	
	public static void main ( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Exer06_18 exer = new Exer06_18();
		
		exer.squareOfAsterisks( input.nextInt() );
	}
}
