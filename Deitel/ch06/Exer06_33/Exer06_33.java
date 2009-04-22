/*
 * Escreva um aplicativo que joga 'adivinhe o número' como aseguir: Seu programa
 * escolhe o número a ser adivinhado selecionando um inteiro aleatório no
 * intervalo de 1 a 1.000. O aplicativo exibe o prompt 'Guess a number between 1
 * and 1.000' [Adivinhe um número entre 1 e 1.000]. O jogador insere uma
 * primeira suposição. Se o palpite do jogador estiver incorreto, seu programa
 * deve exibir 'Too high. Try again.' [Muito alto. Tente novamente.] ou
 * 'Too low. Try again.' [Muito baixo. Tente novamente.]. Para ajudar o jogador a
 * 'zerar' mediante uma resposta correta, o programa solicitar ao usuário o
 * próximo palpite. Quando o jogador inserir uma resposta correta, exiba
 * 'Congratulations. You guessed the number!' [Parabéns. Você adivinhou o
 * número!] e permita ao jogador escolher se que jogar novamente. [Nota:  A
 * técnica de adivinhação empregada nesse problema é semelhante a uma pesquisa
 * binária, discutida no Capítulo 16.]
 */

package ch06.Exer06_33;

import java.util.Random;
import java.util.Scanner;

public class Exer06_33
{
	public static void main ( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Random random = new Random();
		int number, guess;
		String answer = "yes";
		
		while ( answer.toUpperCase().equals( "YES" ) || answer.toUpperCase().equals( "Y" ) )
		{
			guess = 0;
			number = random.nextInt( 1000 ) + 1;
			System.out.println( "Guess a number between 1 and 1.000 " );
			
			while ( guess != number )
			{
				guess = input.nextInt();
				
				if ( guess < number )
					System.out.println( "Too low. Try again." );
				else if ( guess > number )
					System.out.println( "Too high. Try again." );
			}
			System.out.println( "Congratulations. You guessed the number! Try again [yes|y|no|n] ?" );
			answer = input.next();
		}
	}
}
