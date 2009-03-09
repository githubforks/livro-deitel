/*
 * 	Um estacionamento cobra uma taxa mínima de $ 2 para estacionar por até 3
 * horas. Um adicional de $ 0,50 por hora não necessariamente inteira é cobrado
 * após as três primeiras horas. A carga máxima para qualquer dado período de 24
 * horas é $ 10. Suponha que nenhum carro fica estacionado por mais de 24 horas
 * por vez. Escreva um aplicativo que calcule e exiba as taxas de estacionamento
 * para cada cliente que estacionou nessa garagem ontem. Você deve inserir as
 * horas de estacionamento para cada cliente. O programa deve exibir a cobrança
 * para o cliente atual e calcular e exibir o total dos recibos de ontem. O
 * programa deve utilizar o método calculateCharges para determinar a cobrança
 * para cada cliente.
 */

package ch06.Exer06_08;

import java.util.Scanner;

public class Exer06_08
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double horas = 0.0;
		double preco = 0.0;
		int dias = 0;
		
		System.out.print( "Dias: " );
		dias = input.nextInt();
		System.out.print( "Horas: " );
		horas = input.nextDouble();
		
		if( dias == 0 && horas <= 3)
			preco = 2;
		else
		{
			// Calcula preço por dias inteiros
			preco += ( dias * 10.0 );
			// Calcula minutos que eventualmente somem 1 dia e adiciona
			// ao preço
			preco += Math.floor( horas/24 ) * 10.0;
			// Calcula horas excedentes e adiciona $ 0.5 ao preço final para
			// cada hora que exceda
			preco +=  ( Math.floor( horas ) - ( Math.floor( horas/24 ) * 24 ) ) * 0.5;

			// Verifica hora quebrada, se estiver entre 0 e 1, adiciona
			// $ 0.5 ao preço final
			if( ( horas - Math.floor( horas ) ) > 0 )
				preco += 0.5;
		}
		System.out.print( "\nPreco: " + preco + "\n" );
	}
}
