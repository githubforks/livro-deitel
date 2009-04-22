/*
 * Sistemas mais sofisticados de instruções auxiliadas por computador monitoram
 * o desempenho do estudante durante um período de tempo. A decisão sobre um
 * novo tópico freqüentemente é baseada no sucesso do estudante com tópicos
 * prévios. Modifique o programa do Exercício 6.31 para contar o número de
 * respostas corretas e incorretas digitadas pelo estudante. Depois que o aluno
 * digitar 10 respostas, seu programa deve calcular a porcentagem de respostas
 * corretas. Se a porcentagem for inferior a 75%, exiba 'Please ask your
 * instructor for extra help' [Peça ajuda ao seu instrutor] e reinicialize o
 * programa para que o outro estudante possa experimentá-lo.
 */

package ch06.Exer06_32;

import java.util.Random;
import java.util.Scanner;

public class Exer06_32
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Random random = new Random();
		int n1, n2, result, answer = -1, wrong = 0, write = 0;
		
		for( int i = 1; i <= 10; i++ )
		{
			n1 = random.nextInt(10);
			n2 = random.nextInt(10);
			result = n1 * n2;
			
			System.out.printf( "How much is %d times %d?", n1, n2 );
			answer = input.nextInt();
			
			if( answer == result)
				switch( random.nextInt( 4 )+1 )
				{
					case 1:
						System.out.println( "Very Good!" );
						write++;
					break;
					case 2:
						System.out.println( "Excellent!" );
						write++;
					break;
					case 3:
						System.out.println( "Nice Work!" );
						write++;
					break;
					case 4:
						System.out.println( "Keep up the good work" );
						write++;
					break;
				}
			else
				switch( random.nextInt( 4 )+1 )
				{
					case 1:
						System.out.println( "No. Please, try again" );
						wrong++;
					break;
					case 2:
						System.out.println( "Wrong. Try once more" );
						wrong++;
					break;
					case 3:
						System.out.println( "Don't give up!" );
						wrong++;
					break;
					case 4:
						System.out.println( "No. Keep trying." );
						wrong++;
					break;
				}

		}
		if( ( write*10 ) < 75 )
			System.out.println( "Please ask your instructor for extra help." );
	}
}
