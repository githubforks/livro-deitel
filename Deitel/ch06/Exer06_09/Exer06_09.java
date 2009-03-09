/*
 * Uma aplicação do método Math.floor é arredondar um valor para o inteiro mais
 * próximo. A instrução
 *
 * y = Math.floor( x + 0.5 );
 *
 * vai arredondar o número x para o inteiro mais próximo e atribuir o resultado
 * a y. Escreva um aplicativo que lê valores double e utilize a instrução
 * anterior para arredondar cada um dos números para o inteiro mais próximo.
 * Para cada número processado, exiba cada um dos números, o original e o
 * arredondado.
 */

package ch06.Exer06_09;

import java.util.Scanner;

public class Exer06_09
{
	public static void main( String args[] )
	{
		double num;
		Scanner input = new Scanner( System.in );

		System.out.print( "Digite o número: " );
		num = input.nextDouble();

		System.out.printf( "Número original: %s\nNúmero arredondado: %s\n",
				num, Math.floor(num));
	}
}
