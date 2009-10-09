/*
 * (Gráficos de tartaruga) A linguagem Logo tornou famoso o conceito de gráfocos
 * de tartaruga. Imagine uma tartaruga mecânica que caminha no lugar sob o controle
 * de um aplicativo Java. A tartaruga segura uma caneta em uma de duas posições,
 * para cima ou para baixo. Enquanto a caneta está para baixo a tartaruga desenha
 * formas à medida que se move, e enquanto a caneta está para cima a tartaruga
 * se move quase livremente sem escrever nada. Nesse problema, você simulará
 * a operação da tartaruga e criará um bloco de rascunho computadorizado.
 *      Utilize um array de 20 por 20 'floor' que é inicializado com zeros. Leia
 * comandos a partir de um array que contenha esses comandos. Monitore a posição
 * atual da tartaruga todas as vezes e se a caneta está atualmente para cima ou
 * para baixo. Suponha que a tartaruga inicia sempre na posição (0,0) do chão com
 * sua caneta para cima. O conjunto de comandos de tartaruga que seu aplicativo
 * deve processar é mostrado na figura 7.31.
 *
 *                  Comando     Significado
 *                  1           Caneta para cima
 *
 *                  2           Caneta para baixo
 *
 *                  3           Vira para a direita
 *
 *                  4           Vira para a esquerda
 *
 *                  5,10        Avance 10 espaços (substitua 10 por um número
 *                              diferente de espaços)
 *                  6           Exiba o array 20 por 20
 *
 *                  9           Fim dos dados (sentinela)
 *				Figura 7.31 Comandos dos gráficos de tartaruga
 *
 * Suponha que a tartaruga esteja em algum lugar próximo ao centro do chão. O
 * seguinte 'problema' desenharia e exibiria um quadrado de 12 por 12 deixando
 * a caneta na posição levantada
 *
 *          2
 *          5,12
 *          3
 *          5,12
 *          3
 *          5,12
 *          3
 *          5,12
 *          1
 *          6
 *          9
 * À medida que a tartaruga se move com a caneta para baixo, configure os elementos
 * apropriados do array floor como 1s. Quando o comando 6 (exibir array) for dado,
 * onde quer que haja um 1 no array, exiba um asterisco ou o caractere que você
 * escolher. Onde quer que haja um 0, exiba um espaço em branco.
 *      Escreva um aplicativo para implementar as capacidadesdos gráficos de tartaruga
 * discutidos aqui. Escreva vários programas de gráfico de tartaruga para desenhar
 * formas interessantes. Adicione outros comandos para aumentar a capacidade de
 * sua linguagem de gráfico de tartaruga.
 */

package ch07.Exer07_21;

import java.util.Scanner;

public class Exer07_21
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in );
		String comando = "0", posicao = "direita";
		int floor[][] = new int[20][20];
		int numero = 0, posicaoX = 0, posicaoY = 0;
		boolean caneta = false; // False = virada para cima e True = virada para baixo
		
		// Inicializa o array.
		for (int i = 0; i < 20; i++)
			for (int j = 0; j < 20; j++)
				floor[i][j] = 0;
		
		// Exibe Opções
		 System.out.println( "Comando\tSignificado" );
		 System.out.println( "1\tCaneta para cima" );
		 System.out.println( "2\tCaneta para baixo" );
		 System.out.println( "3\tVira para a direita" );
		 System.out.println( "4\tVira para a esquerda" );
		 System.out.println( "5,10\tAvance 10 espaços ( substitua 10 por um número diferente de espaços )" );
		 System.out.println( "6\tExiba o array 20 por 20" );
		 System.out.println( "9\tFim dos dados (sentinela)" );
		
		while( numero != 9 )
		{
			System.out.print( "Comando: " );
			comando = input.next();
			
			numero = Integer.parseInt( comando.substring( 0, 1 ) );
			
			if( numero != 9 )
			{
				switch( numero )
				{
					case 1:
						caneta = false; // Define caneta como virada para cima
						break;
					case 2:
						caneta = true; // Define caneta como virada para baixo
						break;
					case 3:
						if( posicao.equals( "direita" ) )
							posicao = "baixo";
						else if( posicao.equals( "baixo" ) )
							posicao = "esquerda";
						else if( posicao.equals( "esquerda" ) )
							posicao = "cima";
						else if( posicao.equals( "cima" ) )
							posicao = "direita";
						break;
					case 4:
						if( posicao.equals( "direita" ) )
							posicao = "cima";
						else if( posicao.equals( "baixo" ) )
							posicao = "direita";
						else if( posicao.equals( "esquerda" ) )
							posicao = "baixo";
						else if( posicao.equals( "cima" ) )
							posicao = "esquerda";
						break;
					case 5:
						int movimento = Integer.parseInt( comando.substring( 2 , comando.length() ) );

						if( posicao.equals( "direita" ) )
						{
							if ( posicaoX + movimento > 19)
								System.out.println( "Vai passar pela parede ?" );
							else for ( int i = 1; i <= movimento; i++ )
							{
								if( caneta )
									floor[posicaoY][posicaoX] = 1;
								posicaoX += 1;
							}
						}
						else if( posicao.equals( "baixo" ) )
						{
							if ( posicaoY + movimento > 19)
								System.out.println( "Vai passar pela parede ?" );
							else for ( int i = 1; i <= movimento; i++ )
							{
								if( caneta )
									floor[posicaoY][posicaoX] = 2;
								posicaoY += 1;
							}
						}
						else if( posicao.equals( "esquerda" ) )
						{
							if ( posicaoX - movimento < 0 )
								System.out.println( "Vai passar pela parede ?" );
							else for ( int i = 1; i <= movimento; i++ )
							{
								if( caneta )
									floor[posicaoY][posicaoX] = 1;
								posicaoX -= 1;
							}
						}
						else if( posicao.equals( "cima" ) )
						{
							if ( posicaoY - movimento < 0)
								System.out.println( "Vai passar pela parede ?" );
							else for ( int i = 1; i <= movimento; i++ )
							{
								if( caneta )
									floor[posicaoY][posicaoX] = 2;
								posicaoY -= 1;
							}
						}
					break;
					case 6:
						// Imprime primeira linha
						for (int i = 0; i < 22; i++)
							System.out.print("=");
						System.out.println();
						
						// Imprime array
						for (int i = 0; i < 20; i++)
						{
							System.out.print( "|" );
							for (int j = 0; j < 20; j++)
							{
								// Se for posição da tartaruga
								if( posicaoY == i && posicaoX == j )
								{
									if( posicao.equals( "direita" ) )
										System.out.print( "→" );
									else if( posicao.equals( "esquerda" ) )
										System.out.print( "←" );
									else if( posicao.equals( "cima" ) )
										System.out.print( "↑" );
									else if( posicao.equals( "baixo" ) )
										System.out.print( "↓" );
								}
								else if( floor[i][j] == 1 )
									System.out.print( "-" );
								else if( floor[i][j] == 2 )
									System.out.print( "|" );
								else System.out.print( " " );
							}
							System.out.print( "|" );
							System.out.println();
						}
						for (int i = 0; i < 22; i++)
							System.out.print("=");
						System.out.println();
						break;
				}
			}
		}
		System.out.println( "Saindo, bye !!!" );
	}
}
