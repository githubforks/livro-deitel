/*
 * O fatorial de um inteiro não negativo n é escrito como n! ('pronuncia-se n fatorial') e é
 * definido como segue:
 * 		n! = n*(n-1)*(n-2)* ... * 1 (para valores de n maiores ou iguais a 1)
 * 
 * e
 * 
 * 		n! = 1 (para n = 0)
 * Por exemplo, 5! = 5 * 4 * 3 * 2 * 1, o que dá 120.
 * 		a) Escreva um aplicativo que leia um inteiro não negativo, calcule e imprima seu
 * fatorial
 * 		b) Escreva um aplicativo que estime o valor da constante matemático e utilizando a
 * fórmula
 * 					e = 1/1! + 1/2! + 1/3! + ...
 * 		c) Escreva um aplicativo que computa o valor de e^x utilizando a fórmuma
 * 					e^x = 1 + (x)/1! + (x^2)/2! + (x^3)/3! + ...
 */

package ch04.Exer04_37c;

import java.util.Scanner;

public class Exer04_37c
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Fatorial fat = new Fatorial();
		double euler = 1;
		int x;

		System.out.print("Definir x para e^x : ");
		x = input.nextInt();

		for (int i = 1; i <= 33; i++)
		{
			euler += Math.pow(x, i)/fat.calcula(i);
		}

		System.out.println("Euler    = " + euler + "\nMath.pow = " + Math.pow(Math.E, x) );
	}
}
