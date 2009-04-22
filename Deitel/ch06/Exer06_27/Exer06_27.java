/*
 * O máximo divisor comum (MDC) de dois inteiros é o maior inteiro que é
 * divisível por cada um dos dois números. Escreva um método mdc que retorna o
 * máximo divisor comum entre dois inteiros. Incorpore o método a aplicativo que
 * lê dois valores do usuário e exibe o resultado.
 */

package ch06.Exer06_27;

import java.util.Scanner;

public class Exer06_27 {
	public int mdc( int arg0, int arg1 )
	{
		int mdc = 0;
		int maior = ( arg0 < arg1 ? arg0 : arg1 );

		for ( int i = 1; i <= maior; i++)
			if ( ( arg0%i == 0 ) && ( arg1%i == 0 ) )
				mdc = i;
		
		return mdc;
	}
	
	public static void main ( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Exer06_27 exer = new Exer06_27();
		int valor0, valor1;
		
		valor0 = input.nextInt();
		valor1 = input.nextInt();
		
		System.out.println( exer.mdc( valor0, valor1));
	}
}
