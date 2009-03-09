/*
 * 	Escreva um aplicativo que exibe os números de 1 a 4 na mesma linha, com cada
 * par de números adjacentes separados por um espaço. Escreva o programa
 * utilizando as técnicas a seguir:
 * a) Utilize uma instrução System.out.println.
 * b) Utilize quatro instruções System.out.print.
 * c) Utilize uma instrução System.out.printf.
 */

package ch02.Exer02_14;

public class Exer02_14
{
	public static void main(String[] args)
	{
		System.out.println("1 2 3 4");
		
		System.out.print("1 ");
		System.out.print("2 ");
		System.out.print("3 ");
		System.out.print("4\n");

		System.out.printf("%d %d %d %d\n",1,2,3,4);
	}
}
