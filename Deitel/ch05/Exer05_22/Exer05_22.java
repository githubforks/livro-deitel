/*
 * Modifique o Exercício 5.15 para combinar seu código dos quatro triângulos de
 * asteriscos, separados de modo que todos os quadrados padrões sejam impressos
 * lado a lado. Faça uso inteligente de loops for aninhados.
 */

package ch05.Exer05_22;

public class Exer05_22
{
	public static void main(String[] args)
	{
		//1 a 10
		for (int i = 1; i <= 10; i++)
		{
			//1 a i
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			//10 a i+1
			for (int j = 10; j > i; j--)
			{
				System.out.print(" ");
			}
			//10 a i
			for (int j = 10; j >= i; j--)
			{
				System.out.print("*");
			}
			//1 a 10-i
			for (int j = 1; j <= i-1; j++)
			{
				System.out.print("  ");
			}
			//10 a i
			for (int j = 10; j >= i; j--)
			{
				System.out.print("*");
			}
			//1 a 10-i
			for (int j = 1; j <= 10-i; j++)
			{
				System.out.print(" ");
			}
			//1 a i
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
