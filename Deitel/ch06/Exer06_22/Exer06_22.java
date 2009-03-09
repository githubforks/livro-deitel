/*
 * Implemente os seguintes métodos de inteiro:
 *      a) O método celsius retorna o equivalente em Celsius de uma temperatura
 *      em Fahrenheit utilizando o cálculo C = 5.0 / 9.0 * ( F - 32 );
 *
 *      b) O método fahrenheit retorna o equivalente em Fahrenheit de uma temperatura
 *      em Celcius utilizando o cálculo F = 9.0 / 5.0 * ( C - 32 );
 *
 *      c) Utilize os métodos nas partes (a) e (b) para escrever um aplicativo
 *      que permite ao usuário inserir uma temperatura em Fahrenheit e exibe
 *      o equivalente em Celsius ou inserir uma temperatura em Celsius e exibe o
 *      equivalente em Fahrenheit.
 */

package ch06.Exer06_22;

import java.util.Scanner;

public class Exer06_22
{
	public static void main( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Transformers t = new Transformers();
		
		System.out.print( "Celsius para Fahrenheit" );
		System.out.print( t.fahrenheit( input.nextDouble() ) );
		
		System.out.print( "Fahrenheit para Celsius" );
		System.out.print( t.celsius( input.nextDouble() ) );
	}
}
