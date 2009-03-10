/*
 * Modifique o aplicativo que você escreveu no Exercício 5.24 para ler um número
 * ímpar no intervalo 1 a 19 para especificar o número de linhas no losango. Seu
 * programa então deve exibir um losango do tamanho apropriado.
 */

package ch05.Exer05_25;

import java.util.Scanner;

public class Exer05_25
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int aux = 1, leitor = 0;

		while((leitor%2 == 0)||(leitor < 1)||(leitor > 19)){
			System.out.print("Tamanho do losango (Ímpar 1 - 19): ");
			leitor = input.nextInt();

			if (leitor%2 == 0)
			{
				System.out.println("ERRO: Digite um número ímpar.");
				//leitor = 0;
			}
			else if (leitor < 1)
			{
				System.out.println("ERRO: Digite um número maior ou igual a 1.");
				//leitor = 0;
			}
			else if (leitor > 19)
			{
				System.out.println("ERRO: Digite um número menor ou igual a 19.");
				//leitor = 0;
			}
		}

		for (int i = 1; i <= (leitor/2)+1; i++) //contador de linhas
		{
			for (int j = (leitor/2)+1; j > i; j--)//contador de espaços
				System.out.print(" ");
			for (int k = 1 ; k <= aux; k++)//contador de asteriscos
				System.out.print("*");
			aux += 2;
			System.out.println();
		}
		aux -= 2;
		for (int i = 1; i <= (leitor/2); i++)//contador de linhas
		{
			for (int j = 1; j <= i; j++)//contador de espaços
				System.out.print(" ");
			aux -= 2;
			for (int k = 1 ; k <= aux; k++)//contador de asteriscos
				System.out.print("*");
			System.out.println();
		}
	}
}
