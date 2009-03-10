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
 * 					e^x = 1 + x/1! + x^2/2! + x^3/3! 
 */

package ch04.Exer04_37b;

public class Exer04_37b {
	public static void main(String[] args)
	{
		Fatorial fat = new Fatorial();
		double euler = 0;

		for (int i = 0; i < 20; i++) {
			euler += 1.0/fat.calcula(i);
		}
		System.out.println("Euler =  "+euler+"\nMath.E = "+Math.E);
	}
}
