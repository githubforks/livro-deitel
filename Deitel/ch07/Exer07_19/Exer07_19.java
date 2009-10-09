/*
 * (Sistema de reservas de passagens aéreas) Uma pequena companhia aérea acabou
 * de comprar um computador para seu novo sistema automatizado de reservas. Você
 * foi solicitado a desenvolver o novo sistema. Você escreverá um aplicativo para
 * atribuir assentos em cada vôo da companhia aérea para somente um avião
 * (capacidade: dez acentos).
 *      Seu aplicativo deve exibir as seguintes alternativas: 'Please type 1 for
 * first class' e 'Please type 2 for Economy' [Por favor digite 1 para Primeira
 * classe e Por favor digite 2 para Classe Econômica]. Se o usuário digitar 1,
 * seu aplicativo deve atribuir assentos na primeira classe (poltronas 1-5). Se
 * o usuário digitar 2, seu aplicativo deve atribuir um assento na classe econômica
 * (poltronas 6-10). Em seguida, seu aplicativo deve exibir um cartão de embarque
 * indicando o número da poltrona da pessoa e se ela está na primeira classe ou
 * na classe econômica.
 *      Utilize um array unidimensional do tipo primitivo boolean para representar
 * o gráfico de assentos do avião. Inicialize todos os elementos do array como
 * false para indicar que todas as poltronas estão desocupadas. À medida que cada
 * assento é atribuido, configure os assentos correspondentes do array como true
 * para indicar que o assento não está mais disponível.
 *      Seu aplicativo nunca deve atribuir uma poltrona que já foi reservada.
 * Quando a classe econômica estiver lotada, seu aplicativo deve perguntar à pessoa
 * se ela aceita ficar na primeira classe (e vice-versa). Se sim, faça a atribuição
 * apropriada de assento. Se não, exiba a mensagem "Next flight leaves in 3 hours"
 * [O próximo vôo parte em 3 horas].
 */

package ch07.Exer07_19;

import java.util.Scanner;

public class Exer07_19
{
	public static void main(String[] args)
	{
		// tipo boolean é inicializado com false
		boolean[] seats = new boolean[10];
		int clas, firstCount = 0, economyCount = 5;
		Scanner input = new Scanner( System.in );
		String resposta;
		
		for (int i = 0; i < seats.length; i++)
		{
			seats[i] = false;
		}
		
		while ( seats[4] == false || seats[9] == false)
		{
			System.out.print( "Please type 1 for First Class or type 2 for Economy: " );
			clas = input.nextInt();
			
			if ( clas == 1 )
				if (  seats[4] ) // se utimo assento da Primeira Classe ja estiver reservado
				{
					System.out.print( "No more seats at First Class. Do you want at Economy ? [Y/N] " );
					resposta = input.next();
					
					if(resposta.equals("Y"))
					{
						seats[economyCount] = true;
						new Tiket( 2, economyCount );
						economyCount++;
						System.out.println("Seat at Economy reserved.");
					} else System.out.println("Seat do not reserved.");
				}
				else
				{
					seats[firstCount] = true;
					new Tiket( 1, firstCount );
					firstCount++;
				}
			else if ( clas == 2)
				if ( seats[9] )
				{
					System.out.print( "No more seats at Economy. Do you want at First Class ? [Y/N] " );
					resposta = input.next();
					
					if(resposta.equals("Y"))
					{
						seats[firstCount] = true;
						new Tiket( 2, firstCount );
						firstCount++;
					} else System.out.println("Seat do not reserved.");
				}
				else
				{
					seats[economyCount] = true;
					new Tiket( 2, economyCount );
					economyCount++;
				}
			else
			{
				System.out.println( "Error. Invalid class." );
				for (int i = 0; i <= 4; i++)
					if ( seats[i] )
						System.out.println("First Class " + i + " reserved.");
					else System.out.println("First Class " + i + " NOT reserved.");
				for (int i = 5; i <= 9; i++)
					if ( seats[i] )
						System.out.println("Economy " + i + " reserved.");
					else System.out.println("Economy " + i + " NOT reserved.");
			}
		}
		System.out.println( "No more seats at all !!!" );
	}
}
