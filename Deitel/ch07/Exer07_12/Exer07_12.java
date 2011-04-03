/*
 * (Eliminação de duplicatas) Utilize um array unidimensional para resolver o
 * seguinte problema: Escreva um aplicativo que insere cinco números, cada um
 * dos quais está entre 10 e 100, inclusive. Enquanto cada número é lido, exibe
 * somente se ele não tiver duplicata de um número já lido. Cuide de tratar o 'pior
 * caso', em que todos os cinco* números são diferentes. Utilize o menor array possível
 * para resolver esse problema. Exiba o conjunto completo de valores únicos inseridos
 * depois que o usuário inserir cada valor novo.
 * 		*Errata: cinco e não 20.
 */

package ch07.Exer07_12;

import java.util.Scanner;

public class Exer07_12
{
	public static void main( String[] args )
	{
		int contador = 0, num = 0;
		int[] lidos = new int[5];
		boolean inserido;
		Auxi aux = new Auxi();
		
		while( contador < lidos.length )
		{
			inserido = false;
			while( inserido == false )
			{
				num = aux.leitor();
				inserido = aux.insereVetor( num, lidos);
				
				if ( inserido )
					System.out.println( "Número inserido no array." );
				else System.out.println( "Número NÃO inserido no array." );
			}
			contador++;
		}
		for (int j = 0; j < lidos.length; j++)
			System.out.print( "| " + lidos[j] + " |" );
	}
}
