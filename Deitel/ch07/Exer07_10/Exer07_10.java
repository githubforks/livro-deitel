/*
 * (Comissões de vendas) Utilize um array unidimensional para resolver o seguinte
 * problema: uma empresa paga seu pessoal de vendas por comissão. O pessoal de vendas
 * recebe $ 200 por semana mais 9% de suas vendas brutas durante essa semana. Por
 * exemplo, um vendedor que vende $ 5.000 brutos em uma semana recebe $ 200 mais
 * 9% de $ 5000 ou um total de $ 650. Escreva um aplicativo (utilizando um array
 * de contadores) que determina quanto o pessoal de vendas ganhou em cada um dos
 * seguintes intervalos (assuma que o salário de cada vendedor foi truncado para
 * uma quantia inteira):
 *
 *      a) $ 200-299
 *      b) $ 300-399
 *      c) $ 400-499
 *      d) $ 500-599
 *      e) $ 600-699
 *      f) $ 700-799
 *      g) $ 800-899
 *      h) $ 900-999
 *      i) $ 1000 e acima
 * Resuma os resulatados em formato tabular.
 */

package ch07.Exer07_10;

import java.util.Scanner;

public class Exer07_10 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in );
		boolean continuar = true;
		String resposta = "";
		double totalVendas;
		int [] estatistica = new int [ 9 ];
		
		while( continuar )
		{
			while ( resposta.equals( "S" ) || !resposta.equals( "N" ) )
			{
				System.out.print( "Cadastrar novo funcionárcio ? [S/N] " );
				resposta = input.next();
				resposta = resposta.toUpperCase();
				
				if ( resposta.equals( "N" ) )
					continuar = false;
				else if ( !resposta.equals( "S" ) )
					System.out.println( "Resposta inválida !" );
				
				if ( resposta.equals( "S" ) )
				{
					System.out.print( "Total de vendas do funcionário: " );
					totalVendas = input.nextInt();
					totalVendas = ( totalVendas * 0.09 ) + 200; // 9% do total das vendas
																// + 200 de salário 
					
					if ( totalVendas >= 1000 )
						estatistica[ 8 ]++;
					else if ( totalVendas >= 900 )
						estatistica[ 7 ]++;
					else if ( totalVendas >= 800 )
						estatistica[ 6 ]++;
					else if ( totalVendas >= 700 )
						estatistica[ 5 ]++;
					else if ( totalVendas >= 600 )
						estatistica[ 4 ]++;
					else if ( totalVendas >= 500 )
						estatistica[ 3 ]++;
					else if ( totalVendas >= 400 )
						estatistica[ 2 ]++;
					else if ( totalVendas >= 300 )
						estatistica[ 1 ]++;
					else estatistica[ 0 ]++;
				}
			}

			// Imprime array de estatísticas de salários
			for (int i = 0; i < estatistica.length; i++)
				System.out.println( ( i*100 + 200 ) + "+ : "+  estatistica[i] );
		}
	}
}
