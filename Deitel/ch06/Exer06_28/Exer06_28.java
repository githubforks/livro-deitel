/*
 * Escreva um método qualityPoints que insere a média de um aluno e retorna 4
 * se a média estiver entre 90 e 100, 3 se a média estiver entre 80 e 89, 2 se
 * a média estiver entre 70 e 79, 1 se se a média estiver entre 60 e 69, e 0 se
 * a média for mais baixa que 60. Incorpore o método a um aplicativo que lê um
 * valor do usuário e exibe o resultado.
 */

package ch06.Exer06_28;

import java.util.Scanner;

public class Exer06_28 {
	public int qualityPoints ( int media )
	{
		int valor;
		
		if( media < 60 )
			valor = 0;
		else if ( media < 70 )
			valor = 1;
			else if ( media < 80 )
				valor = 2;
				else if ( media < 90 )
					valor = 3;
					else if ( media <= 100 )
						valor = 4;
					else valor = 5;

		return valor;
	}
	
	public static void main ( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Exer06_28 exer = new Exer06_28();
		int i;
		
		while ( ( i = input.nextInt() ) != -1 )
		{
			System.out.println( exer.qualityPoints( i ) );
		}
	}
}
