/*
 * Escreva segmentos de programa que realizam cada uma das seguintes tarefas:
 *      a) Calcule a parte inteira do quociente quando o inteiro a é dividido
 *      pelo número inteiro b.
 *
 *      b) Calcule o resto inteiro quando o inteiro a é dividido pelo inteiro b
 *
 *      c) Utilize segmentos do programa desenvolvidos nas partes (a) e (b) para
 *      escrever o método displayDigits que recebe um inteiro entre 1 e 99999 e
 *      o exibe como uma seqüência de dígitos, separando cada par de dígitos por
 *      dois espaços. Por exemplo, o inteiro 4562 deve aparecer como
 *      4  5  6  2
 *
 *      d) Incorpore o método desenvolvido na parte (c) a um aplicativo que
 *      insere um inteiro e chama displayDigits passando o método que o inteiro
 *      inseriu. Exiba os resultados.
 */

package ch06.Exer06_21;

import java.util.Scanner;

public class Exer06_21
{
	public static void main ( String args[] )
	{
		Scanner input = new Scanner(System.in);
		Metodos m = new Metodos();
		int n;
		
		System.out.print( "Número entre 1 e 99999: " );
		n = input.nextInt();
		
		m.displayDigits( n );
	}
}
