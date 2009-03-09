/*
 * Escreva um aplicativo que lê um inteiro e determina e imprime se ele é ímpar
 * ou par. [Dica: Utilize o operador de módulo. Um número par é um múltiplo de
 * 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
 */

package ch02.Exer02_25;

import java.util.Scanner;

public class Exer02_25
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.println("Digite o inteiro:");
		n = input.nextInt();
		
		if (n%2 == 0)
			System.out.println("O número é par.");
		else System.out.println("O némero é impar.");
	}
}
