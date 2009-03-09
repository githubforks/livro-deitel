/* Math.floor pode ser utilizado para arredondar um número para uma casa
 * decimal específica. A instrução
 *
 * y = Math.floor( x * 10 + 0.5) / 10;
 *
 * arredonda x para a casa decimal (isto é, a primeira posição à direita do
 * ponto de fração decimal). A instrução
 *
 * y = Math.floor( x * 100 + 0.5 ) / 100;
 *
 * arredonda x para a casa centensimal (isto é, a segunda posição à direita do
 * ponto de fração decimal). Escreva um aplicativo que defina quatro métodos
 * para arredondar um número x de várias maneiras:
 *
 * a) roundToInteger( number )
 * b) roundToTenths( number )
 * c) roundToHundredths( number )
 * d) roundToThousandths( number )
 *
 * Para cada leitura de valor, seu programa deve exibir o valor original, o
 * número arredondado para o inteiro mais próximo, o número arredondado para o
 * décimo mais próximo, o número arredondado para o centésimo mais próximo e o
 * número arredondado para o milésimo mais próximo.
 */

package ch06.Exer06_10;

import java.util.Scanner;

public class Exer06_10
{
	public static void main ( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Round round = new Round();
		double number;
		
		System.out.print( "Digite o número: " );
		number = input.nextDouble();
		
		System.out.println( round.roundToInteger( number ) );
		System.out.println( round.roundToTenths( number ) );
		System.out.println( round.roundToHundredths( number ) );
		System.out.println( round.roundToThousandths( number ) );
	}
}
