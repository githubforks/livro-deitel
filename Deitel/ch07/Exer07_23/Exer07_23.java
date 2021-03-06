/*
 * (Passeio do cavalo: abordagem de força bruta) Na parte (c) do exercício 7.22,
 * desenvolvemos uma solução para o problema do passeio do cavalo. A abordagem
 * utilizada, chamada de 'acessibilidade heurística', gera muitas soluções e
 * executa eficientemente.
 *      À medida que os computadores continuam crescendo em potência, seremos
 * capazes de resolver cada vez mais problemas com a pura capacidade do computador
 * e algoritmos relativamente simples. Vamos chamar essa abordagem de solução de
 * problemas de abordagem de 'força bruta'.
 *
 *      a) Utilize a geração de números aleatórios para permitir ao cavalo andar
 *         no tabuleiro de xadrez (em seus movimentos válidos em forma de L) de
 *         maneira aleatória. Seu aplicativo deve executar um passeio e exibir
 *         o tabuleiro final. Até onde o cavalo chegou?
 *      b) Muito provavelmente, o aplicativo na parte (a) produziu um passeio
 *         relativamente curto. Agora modifique seu aplicativo para tentar mil
 *         passeios. Utilize um array unidimensional para monitorar o número de
 *         passeios de cada comprimento. Quando seu aplicativo terminar de tentar
 *         os mil passeios, ele deve exibir organizadamente essas informações
 *         em formato tabular. Qual foi o melhor resultado ?
 *      c) Muito provavelmente, o aplicativo na parte (b) forneceu alguns passeios
 *         'respeitáveis', mas nenhum passeio completo. (Atenção: Essa versão do
 *         aplicativo poderia executar durante horas em um computador poderoso.)
 *         Mais uma vez, mantenha uma tabela do número de passeios de cada
 *         comprimento e exiba essa tela quando o primeiro passeio completo for
 *         localizado. Quantos percursos seu aplicativo tenta antes de produzir
 *         um passeio completo ? Quanto tempo ele levou ?
 *      d) Compare a versão de força bruta do passeio do cavalo com a versão de
 *         acessibilidade heurística. Qual exigiu estudo mais cuidadoso do
 *         problema ? Qual algoritmo foi mais difícil de desenvolver ? Qual
 *         exigiu mais capacidade do computador ? Poderíamos ter certeza (com
 *         antecedência) de obter um passeio completo com a abordagem de acessibilidade
 *         heurística ? Poderíamos ter certeza (com antecedência) de obter um
 *         passeio completo com a abordagem de força bruta ? Argumente as vantagens
 *         e desvantagens de resolver problema de força bruta em geral.
 */

package ch07.Exer07_23;

public class Exer07_23
{
	public static void main(String[] args)
	{
		int horizontal[] = {  2,  1, -1, -2, -2, -1, 1, 2 };
		int vertical[]   = { -1, -2, -2, -1,  1,  2, 2, 1 };
		int currentRow = 3, currentColumn = 4;
		int nMoviments = 1; // número de casas visitadas pelo cavalo
		int moveNumber = 0;
		int board[][] = new int[8][8];
		int[][] heuristic =
		{
				{2,3,4,4,4,4,3,2},
				{3,4,6,6,6,6,4,3},	
				{4,6,8,8,8,8,6,4},
				{4,6,8,8,8,8,6,4},
				{4,6,8,8,8,8,6,4},
				{4,6,8,8,8,8,6,4},
				{3,4,6,6,6,6,4,3},
				{2,3,4,4,4,4,3,2}
		};
		
		// Passa posição inicial para o tabuleiro
		board[currentRow][currentColumn] = nMoviments;
		
		while ( nMoviments <= 64 )
		{
			
			nMoviments++;
		}
		
		for (int i = 0; i < board.length; i++)
		{
			System.out.print( "|" );
			for (int j = 0; j < board.length; j++)
				if ( board[i][j] < 10 )
					System.out.print( " " + board[i][j] + "|");
				else System.out.print( board[i][j] + "|" );
			System.out.println();
		}
	}
}
