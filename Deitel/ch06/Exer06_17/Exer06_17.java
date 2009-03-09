/*
 * Escreva um método isEven que utiliza o operador de resto (%) para determinar
 * se um inteiro é par. O método deve aceitar um argumento inteiro e retornar
 * true se o inteiro for par e false se o contrário. Incorpore esse método a um
 * aplicativo que insere uma sequência de inteiros (um por vez) e determina se
 * cada um é par ou ímpar.
 */

package ch06.Exer06_17;

import java.util.Scanner;

public class Exer06_17
{
	public boolean isEven( int arg0 )
	{
		return ( arg0 % 2) == 0;
	}
	
	public static void main ( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Exer06_17 exer = new Exer06_17();
		int n = 1;
		
		while ( n != 0 )
		{
			n = input.nextInt();
			System.out.println( exer.isEven( n ) == true ? "É par" : "É impar" );
		}
	}
}
