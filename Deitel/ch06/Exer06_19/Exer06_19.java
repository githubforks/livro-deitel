/*
 * Modifique o método criado no Exercício 6.18 para formar o quadrado a partir
 * de qualquer que seja o caracter contido no parâmetro de caractere
 * fillCharacter. Portanto, se side for 5 e fillCharacter for '#', o método
 * deve exibir
 *					#####
 *					#####
 *					#####
 *					#####
 *					#####
 */

package ch06.Exer06_19;

import java.util.Scanner;

public class Exer06_19 {
	public void squareOfAny( int side, String fillCharacter )
	{
		for( int i = 1; i <= side; i++ )
		{
			for( int j = 1; j <= side; j++ )
				System.out.print( fillCharacter );
			System.out.println();
		}
	}
	
	public static void main ( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Exer06_19 exer = new Exer06_19();
		int i = input.nextInt();
		String s = input.next();
		
		exer.squareOfAny( i, s );
	}
}
