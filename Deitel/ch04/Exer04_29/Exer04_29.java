/*
 * Escreva um aplicativo que solicite ao usuário inserir o tamanho do lado de um quadrado
 * e então exiba um quadrado vazio desse tamanho com asteriscos. Seu programa deve trabalhar
 * com quadrados de todos os comprimentos de lado possíveis entre 1 e 20.
 */

package ch04.Exer04_29;

import java.util.Scanner;

public class Exer04_29
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int lado = 0, i=0;

		//Lê o tamanho do lado entre 1 e 20
		while ((lado < 1)||(lado > 20))
		{
			System.out.print("Digite o tamanho do lado: ");
			lado = input.nextInt();
		}

		//Imprime a primeira linha
		for (int j = 0; j < lado; j++)
		{
			System.out.print("*");
		}
		System.out.println();
		i++;

		//Imprime as linhas do meio 
		while(i <= lado-2)
		{
			System.out.print("*"); //Imprime primeiro asterisco da linha
			for(int j=0; j<=lado-3; j++) //Imprime espaços do meio da linha
				System.out.print(" ");
			System.out.println("*"); //Imprime último asterisco da linha
			i++;
		}

		//Imprime a última linha
		if(lado>1) //Para não imprimir uma segunda linha se lado==1
			for (int j = 0; j < lado; j++)
			{
				System.out.print("*");
			}
	}
}
