/*
 * O uso de computadores na educação é referido como instrução auxiliada por
 * computador (CAI - Computer-Assisted Instruction). Um  que se
 * desenvolve em ambientes CAI é a fadiga do estudante. Esse problema pode ser
 * eliminado variando as respostas do computador para prender a atenção do
 * estudante. Modifique o programa do Exercício  6.30 de modo que os vários
 * comentários sejam exibidos para cada resposta correta e cada resposta
 * incorreta, como segue:
 *	Respostas para uma resposta correta:
 * 		Very good!				[Muito bom!]
 * 		Excellent!				[Excelente!]
 * 		Nice Work!      		[Bom Trabalho!]
 * 		Keep up the good work	[Continue o bom trabalho!]
 * 	Respostas para uma resposta incorreta:
 * 		No. Please try again	[Não. Tente novamente.]
 * 		Wrong. Try once more	[Errado. Tente mais uma vez.]
 * 		Don't give up!			[Não desista!]
 * 		No. Keep trying.		[Não. Continue tentando.]
 * Utilize geração de números aleatórios para escolher um número entre 1 e 4 que
 * será utilizando para selecionar uma resposta apropriada para cada resposta.
 * Utilize uma instrução switch para emitir as respostas.
 */

package ch06.Exer06_31;

import java.util.Random;
import java.util.Scanner;

public class Exer06_31
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
					switch( random.nextInt( 4 )+1 )
					{
						case 1: System.out.println( "Very Good!" );
						break;
						case 2: System.out.println( "Excellent!" );
						break;
						case 3: System.out.println( "Nice Work!" );
						break;
						case 4: System.out.println( "Keep up the good work" );
						break;
					}
				else
					switch( random.nextInt( 4 )+1 )
					{
						case 1: System.out.println( "No. Please, try again" );
						break;
						case 2: System.out.println( "Wrong. Try once more" );
						break;
						case 3: System.out.println( "Don't give up!" );
						break;
						case 4: System.out.println( "No. Keep trying." );
						break;
					}
			}
		}
	}
}
