/*
 * Escreva um método multiple que determina um par de inteiros se o segundo
 * inteiro for múltiplo do primeiro. O método deve aceitar dois argumentos
 * inteiros e retornar true se o segundo for múltiplo do primeiro e false se o
 * contrário. Incorpore esse método a um aplicativo que insere uma série de
 * pares inteiros (um par por vez) e determina se o segundo valor em cada par é
 * múltiplo do primeiro.
 */

package ch06.Exer06_16;

import java.util.Scanner;

public class Exer06_16
{
	public boolean multiple(int arg0, int arg1)
	{
		return ( arg1 % arg0 == 0);
	}
	
	public static void main ( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Exer06_16 exer = new Exer06_16();
		int n1 = 1, n2;
		
		while ( n1 != 0)
		{
			System.out.println( "n1: " );
			n1 = input.nextInt();
			if ( n1 != 0 )
			{
				System.out.println( "n2: " );
				n2 = input.nextInt();
				if ( n2 != 0 )
					System.out.println( n1 + (exer.multiple( n1, n2 ) == true
							? "" : " não") + " é múltiplo de " + n2);
				else System.out.println( "n2 = 0, valor inválido" );
			}
		}
	}
}
