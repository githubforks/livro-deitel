/*
 * Os exercícios 6.30 a 6.32 desenvolveram um programa de instrução auxiliada
 * por computador para ensinar multiplicação a um estudante do ensino
 * fundamental. Realize os seguintes aprimoramentos:
 *      a) Modifique o programa para permitir que o usuário insira uma
 *      capacidade de nível de graduação. Um nível de notas de 1 significa que o
 *      programa deve utilizar somente números de um dígito nos problemas, um
 *      nível de notas de 2 significa que o programa deve utilizar número de
 *      dois dígitos, e assim por diante.
 *
 *      b) Modifique o programa para permitir que o usuário selecione os tipos
 *      de problemas aritméticos que ele deseja estudar. Uma opção de 1
 *      significa apenas problemas de adição, 2 significa apenas problemas de
 *      subtração, 3 significa apenas problemas de multiplicação, 4 significa
 *      apenas problemas de divisão, e 5 significa uma combinação aleatória de
 *      problemas de todos esses tipos.
 */

package ch06.Exer06_35;

import java.util.Random;
import java.util.Scanner;

public class Exer06_35
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Gerador gerador = new Gerador();
		Random random = new Random();
		int n1, n2, result = 0, answer = -1, wrong = 0, write = 0, level, type;
		
		System.out.printf( "Level: " );
		level = input.nextInt();
		System.out.printf( "Problem type: " );
		type = input.nextInt();

		for( int i = 1; i <= 10; i++ )
		{
			n1 = gerador.geraNumero( level );
			n2 = gerador.geraNumero( level );
			

			switch ( type ){
			case 1:
				result = n1 + n2;
				System.out.printf( "How much is %d more %d?", n1, n2 );
				answer = input.nextInt();
				break;
			case 2:
				result = n1 - n2;
				System.out.printf( "How much is %d less %d?", n1, n2 );
				answer = input.nextInt();
				break;
			case 3:
				result = n1 * n2;
				System.out.printf( "How much is %d times %d?", n1, n2 );
				answer = input.nextInt();
				break;
			case 4:
				result = n1 / n2;
				System.out.printf( "How much is %d / %d?", n1, n2 );
				answer = input.nextInt();
				break;
			case 5:
				if( gerador.opcaoCinco(n1, n2) == true )
					answer = result;
					else result = 1;
				break;
			default:
		}
			
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
