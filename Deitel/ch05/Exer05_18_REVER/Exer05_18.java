/*
 * Modifique o aplicativo na Figura 5.6 para utilizar apenas inteiros para
 * calcular juros compostos [Dica: Trate todas as quantidades monetárias como
 * números inteiros em centavos. Então divida o resultado em suas partes dólar e
 * centavos utilizando as operações divisão e resto respectivamente. Insira uma
 * vírgula entre as partes dólar e centavos.]
 * 
 *  1 ->       5 x 10^ -2
 *  2 ->      25 x 10^ -4
 *  3 ->     125 x 10^ -6
 *  4 ->     625 x 10^ -8
 *  5 ->    3125 x 10^-10
 *  6 ->   15625 x 10^-12
 *  7 ->   78125 x 10^-14
 *  8 ->  390625 x 10^-16
 *  9 -> 1953125 x 10^-18
 * 10 -> 9765625 x 10^-20
 */

package ch05.Exer05_18_REVER;

public class Exer05_18
{
	public static void main(String[] args)
	{
		long amount; // quantia em depósito ao fim de cada ano
		long principal = 1000; // quantidade inicial antes dos juros
		long rate = 105; // taxa de juros
		long div = 100;
		
		// exibe cabeçalhos
		System.out.printf( "%s%20s \n", "Year", "Amount on deposit" );

		amount = (principal*rate)/div;
		System.out.printf("%s	%s\n",1, amount );
		
		// calcula quantidade de depósito para cada um dos dez anos
		for ( Integer year = 2; year <= 10; year++ )
		{
			div *= 100;
			rate *= 105;
			// calcula nova quantidade durante ano especificado
			amount = (principal * rate)/div;

			// exibe o ano e a quantidade
			System.out.printf("%s	%s\n",year,amount);
		}
	}
}
