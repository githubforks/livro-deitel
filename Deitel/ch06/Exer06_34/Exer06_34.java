/*
 * Modifique o programa do Exercício 6.33 para contar o número de suposições que
 * o jogador faz. Se o número for 10 ou menos, exiba
 * 'Either you know the secret or you got lucky' [Você sabe o segredo ou tem
 * muita sorte!] se o jogador adivinhar o número em 10 tentativas, exiba
 * 'Aha, you know the secret!' [Aha, você sabe o segredo!]. Se o jogador fizer
 * mais que 10 adivinhações, exiba 'You should be able do to better!' [Você é
 * capaz de fazer melhor!]. Por que esse jogo não deve precisar mais que 10
 * suposições? Bem, a cada 'boa suposição' o jogador deve ser capaz de eliminar
 * metade dos números. Agora mostre por que qualquer número 1 a 1.000 pode ser
 * advinhado em 10 ou menos tentativas.
 */

package ch06.Exer06_34;

import java.util.Random;
import java.util.Scanner;

public class Exer06_34
{
	public static void main ( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Random random = new Random();
		int number, guess, trying;
		String answer = "yes";
		
		while ( answer.toUpperCase().equals( "YES" ) || answer.toUpperCase().equals( "Y" ) )
		{
			trying = 0;
			guess = 0;
			number = random.nextInt( 1000 ) + 1;
			System.out.println( "Guess a number between 1 and 1.000 " );
			
			while ( guess != number )
			{
				guess = input.nextInt();
				
				trying++;
				
				if ( guess < number )
					System.out.println( "Too low. Try again." );
				else if ( guess > number )
					System.out.println( "Too high. Try again." );
			}
			
			if ( trying < 10 )
				System.out.println( "Either you know the secret or you got lucky " );
			else if ( trying == 10 )
				System.out.println( "Aha, you know the secret! " );
			else
				System.out.println( "You should be able do to better! " );
			
			System.out.println( "Congratulations. You guessed the number! Try again [yes|y|no|n] ?" );
			answer = input.next();
		}
	}
}