/*
 * Escreva um método integerPower( base, exponent ) que retorna o valor de
 *
 * base^exponentarg0
 *
 * Por exemplo, integerPower( 3, 4 ) calcula 3^4 (ou 3 * 3 * 3 * 3). Assuma que
 * exponent é um inteiro não-zero positivo, e base é um inteiro. O método
 * integerPower deve utilizar um loop for ou while para controlar o cálculo.
 * Não utilize nenhum método da biblioteca de matemática. Incorpore esse método
 * a um aplicativo  que lê os valores inteiros para base e exponent e realiza o
 * cálculo com o método integerPower.
 */

package ch06.Exer06_14;

import java.util.Scanner;

public class Exer06_14 {
	public static void main ( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Power power = new Power();
		int base, exponent;
		
		System.out.println( "Digitar a base: " );
		base = input.nextInt();
		System.out.println( "Digitar o expoente: " );
		exponent = input.nextInt();
		
		System.out.println( "Resultado = " + power.integerPower( base, exponent) );
	}

}
