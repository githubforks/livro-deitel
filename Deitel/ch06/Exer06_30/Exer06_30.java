/*
 * Os computadores estão desenpenhando um crescente papel na educação. Ecreva
 * um programa que ajudará um estudante do ensino fundamental a aprender
 * multiplicação. Utilize o método Random para produzir dois inteiros positivos
 * de um algarismo. O programa então deve fazer ao usuário uma pergunta, como
 *
 *          How much is 6 times 7?
 * 
 * O aluno insere então a resposta. Em seguida, o programa verifica a resposta
 * do aluno, se estiver correta, exiba a mensagem "Very good!" e faça outra
 * pergunta de multiplicação, se a resposta estiver errada, exiba a mensagem
 * "No. Please try again!" e deixe que o estudante tente a mesma pergunta
 * repetidamente até por fim responder corretamente. Um método separado deve ser
 * utilizado para gerar cada nova pergunta. Esse método deve ser chamado uma vez
 * quando a aplicação inicia a execução e toda vez quando o usuário responde
 * corretamente.
 */

package ch06.Exer06_30;

import java.util.Random;
import java.util.Scanner;

public class Exer06_30
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Random random = new Random();
		int n1, n2, result, answer = -1;
		
		for(;;)
		{
			n1 = random.nextInt(10);
			n2 = random.nextInt(10);
			result = n1 * n2;
			
			while ( result != answer )
			{
				System.out.printf( "How much is %d times %d?", n1, n2 );
				answer = input.nextInt();
				
				if( answer == result)
					System.out.println( "Very good!" );
				else System.out.println( "No. Please, try again." );
			}
		}
	}
}
