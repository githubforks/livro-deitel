/*
 * Escreva um aplicativo que imprima s seguinte forma de losango. Você pode
 * utilizar instruções de saída que imprima um único asterisco (*), um único
 * espaço ou um único caractere de nova linha. Maximize sua utilização de
 * repetição (com instruções for aninhadas) e minimize o número de instruções de
 * saída.
 * 
 *                 *
 *                ***
 *               *****
 *              *******
 *     	       *********
 *              *******
 *               *****
 *                ***
 *                 *
 */

package ch05.Exer05_24;

public class Exer05_24
{
	public static void main(String[] args)
	{
		int aux = 1;
		for (int i = 1; i <= 5; i++)//contador de linhas
		{
			for (int j = 5; j > i; j--)//contador de espaços
				System.out.print(" ");
			for (int k = 1 ; k <= aux; k++)//contador de asteriscos
				System.out.print("*");
			aux += 2;
			System.out.println();
		}
		aux -= 2;
		for (int i = 1; i <= 4; i++)//contador de linhas
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
