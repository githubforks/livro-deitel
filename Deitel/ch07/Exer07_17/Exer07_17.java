/*
 * (Jogo de dados) Escreva um aplicativo para simular o lançamento de dois dados.
 * O aplicativo deve utilizar um objeto da classe Random uma vez para lançar o
 * primeiro dado e novamente para lançar o segundo dado. A soma dos dois valores
 * deve então ser calculada. Cada dado pode mostrar um valor inteiro de 1 a 6,
 * portanto a soma dos valores vai variar de 2 a 12, com 7 sendo a soma mais
 * freqüente e 2 e 12 sendo as somas mesnos freqüentes. A Figura 7.30 mostra as
 * 36 possíveis combinações de dois dados. Seu aplicativo deve lançar o dado
 * 36 mil vezes. Utilize um array unidimensional para contar o número de vezes
 * que cada possível soma aparece. Exiba os resultados em formato tabular.
 * Determine se os totais são razoáveis (por exemplo, há sei maneiras de lançar
 * um 7, então aproximadamente um sexto de todos os lançamentos deve ser 7).
 *
 *              1   2   3   4   5   6
 *            -------------------------
 *           1| 2 | 3 | 4 | 5 | 6 | 7 |
 *            -------------------------
 *           2| 3 | 4 | 5 | 6 | 7 | 8 |
 *            -------------------------
 *           3| 4 | 5 | 6 | 7 | 8 | 9 |
 *            -------------------------
 *           4| 5 | 6 | 7 | 8 | 9 | 10|
 *            -------------------------
 *           5| 6 | 7 | 8 | 9 | 10| 11|
 *            -------------------------
 *           6| 7 | 8 | 9 | 10| 11| 12|
 *            -------------------------
 *      Figura 7.30 As 36 possíveis somas de dois dados.
 */

package ch07.Exer07_17;

import java.util.Random;

public class Exer07_17
{
	public static void main( String[] args )
	{
		Random random = new Random();
		int dado1, dado2, indice;
		int[] frequencia = new int[11];
		
		for( int i = 1; i <= 65000; i++ )
		{
			dado1 = random.nextInt( 6 );
			dado2 = random.nextInt( 6 );

			indice = ( dado1 + dado2 );
			
			frequencia[ indice ]++;
		}
		
		for( int i = 0; i < 11; i++ )
			System.out.println( ( i+2 ) + " : " + frequencia[ i ] );
	}
}
