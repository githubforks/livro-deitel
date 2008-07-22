/*
 * Modifique o programa de juros compostos da Figura 5.6 para repetir seus passos para taxas
 * de juros de 5%, 6%, 7%, 8%, 9% e 10%. Utilize um loop for para variar a taxa de juros.
 */

package ch05.Exer05_14;

public class Exer05_14 {
	public static void main( String args[] )
	{
		double amount; // quantia em depósito ao fim de cada ano
		double principal = 1000.0; // quantidade inicial antes dos juros
		double rate; // taxa de juros

		for (int i = 5; i <= 10; i++) {

			// define e exibe nova taxa de juros
			rate = i/100.0;
			System.out.println("Rate = " + rate);

			// exibe cabeçalhos
			System.out.printf( "%s%20s \n", "Year", "Amount on deposit" );

			// calcula quantidade de depósito para cada um dos dez anos
			for ( int year = 1; year <= 10; year++ )             
			{                                                    
				// calcula nova quantidade durante ano especificado
				amount = principal * Math.pow( 1.0 + rate, year );

				// exibe o ano e a quantidade
				System.out.printf( "%4d%,20.2f\n", year, amount );
			}
		} // for final
	} // fim de main
}
