/*
 * Escreva um aplicativo que simula o lançamento de uma moeda. Deixe o programa
 * lançar uma moeda toda vez que o usuário escolher a opção 'Toss Coin' no menu.
 * Conte o número de vezes que cada lado da moeda aparece. Exiba os resultados.
 * O programa deve chamar um método separado flip que não aceita nenhum
 * argumento e retorna false para coroa e true para cara. [Nota: Se o programa
 * simular o arremesso de moeda de maneira realista, cada lado da moeda da moeda
 * deve aparecer aproximadamente metade das vezes. ]
 */


package ch06.Exer06_29;

import java.util.Random;
import java.util.Scanner;

public class Exer06_29 {
	public boolean flip()
	{
		boolean b;
		Random random = new Random();
		
		b = ( random.nextInt( 2 ) == 1 ? true : false );
		
		return b;
	}
	
	public static void main ( String args[] )
	{
		Exer06_29 exer = new Exer06_29();
		Scanner input = new Scanner( System.in );
		int opcao = 1, cara = 0, coroa = 0;
		boolean moeda;
		
		while( opcao != 0 )
		{
			System.out.print("0 - Exit\n1 - Toss Coin\nEnter your option: ");
			opcao = input.nextInt();
			
			if ( opcao == 1)
			{
				moeda = exer.flip();
				
				if ( moeda )
				{
					System.out.println("Cara");
					cara++;
				}
				else
				{
					System.out.println("Coroa");
					coroa++;
				}
			}
		}
		System.out.println("Cara: " + cara + "\nCoroa: " + coroa);
	}
}
