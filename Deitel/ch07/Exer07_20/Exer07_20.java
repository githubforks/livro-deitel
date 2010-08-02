/*
 * (Vendas totais) Utilize um array bidimensional para resolver o seguinte problema:
 * Uma empresa tem quatro equipes de venda (1 a 4) que vendem cinco produtos
 * diferentes (1 a 5). Uma vez por dia, cada vendedor passa uma nota de cada tipo
 * de produto diferente vendido. Cada nota contém o seguinte:
 *      a) O número do vendedor
 *      b) O número do produto
 *      c) O valor total em reais desse produto vendido nesse dia
 * Portanto, cada vendedor passa entre 0 e 5 notas de venda por dia. Assuma que
 * as informações a partir de todas as notas durante o último mês estão disponpiveis.
 * Escreva um aplicativo que leia todas essas informações sobre as vendas do
 * último mês e resuma as vendas totais por vendedor e por produto. Todos os
 * totais devem ser armazenados no array bidimensional 'sales'. Depois de
 * processar todas as informações do último mês, exiba os resultados em formato
 * tabular, com cada coluna representando um vendedor particular e cada linha
 * representando um produto particular. Some cada linha para obter o total das
 * vendas de cada produto no último mês. Some cada coluna para obter o total de
 * vendas por vendedor no último mês. Sua saída tabular deve incluir esses totais
 * cruzados à direita das linhas totalizandas e na parte inferior das colunas
 * totalizadas.
 */

package ch07.Exer07_20;

import java.util.Scanner;

public class Exer07_20
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );
		double[][] vendas = new double[4][5];
		double[] totalVendedor = new double[4];
		double[] totalProdutos = new double[5];
		int vendedor = 1, produto = 0;
		
		for( int i = 1; i < 4; i ++ )
			for( int j = 0; j < 5; j++ )
				vendas[i][j] = 0.0;
		
		while ( vendedor >= 1 && vendedor <= 4)
		{
			System.out.print( "Nro. do Vendedor: [1-4] " );
			vendedor = input.nextInt();
			if( vendedor >= 1 && vendedor <= 4 )
			{
				System.out.print( "Produto: [1-5] " );
				produto = input.nextInt();
				
				System.out.print( "Total de venda em reais: " );
				vendas[vendedor-1][produto-1] = input.nextDouble();
			}
			else System.out.println();
		}
		
		System.out.println( "         Produtos" );
		for( int i = 0; i < 4; i ++ )
		{
			if( i == 0 )
				System.out.print( "Vendedor |" );
			else System.out.print("         |");
			
			for( int j = 0; j < 5; j++ )
			{
				System.out.print( vendas[i][j] + "|" );
				totalProdutos[j] += vendas[i][j];
				totalVendedor[i] += vendas[i][j];
			}
			
			// Imprime últimas duas colunas, total por vendedor
			System.out.println( "|" + totalVendedor[i] );
		}
		
		// Imprime últimas duas linhas, total por produto
		System.out.print( "         " );
		for (int i = 0; i < 20; i++)
		{
			System.out.print( "-" );
		}
		System.out.println();
		System.out.print( "         |" );
		for( int j = 0; j < 5; j++ )
		{
			System.out.print(totalProdutos[j] + "|");
		}
	}
}
