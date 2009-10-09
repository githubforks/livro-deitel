/*
 * (Passeio do cavalo) Um dos problemas mais difíceis e interessantes para os
 * fãs de xadrez é o problema do 'passeio do cavalo', originalmente proposto
 * pelo matemático Euller. A peça de chadrez chamada cavalo pode mover-se em um
 * tabuleiro vazio e tocar cada um dos 64 quadrados uma vez e unicamente uma vez?
 * Aqui, estudaremos esse intrigante problema em profundidadde.
 *      O cavalo só faz movimentos em forma de L (dois espaços em uma direção e
 * outro em direção perpendicular). Portanto, como mostrado na Figura 7.32,
 * partindo de um quadrado próximo do centro de um tabuleiro de xadrez vazio, o
 * cavalo (rotulado K) pode fazer oito movimentos diferentes (numerados de 0 a 7).
 *
 *                      0   1   2   3   4   5   6   7
 *                    ---------------------------------
 *                   0|   |   |   |   |   |   |   |   |
 *                    ---------------------------------
 *                   1|   |   |   | 2 |   | 1 |   |   |
 *                    ---------------------------------
 *                   2|   |   | 3 |   |   |   | 0 |   |
 *                    ---------------------------------
 *                   3|   |   |   |   | K |   |   |   |
 *                    ---------------------------------
 *                   4|   |   | 4 |   |   |   | 7 |   |
 *                    ---------------------------------
 *                   5|   |   |   | 5 |   | 6 |   |   |
 *                    ---------------------------------
 *                   6|   |   |   |   |   |   |   |   |
 *                    ---------------------------------
 *                   7|   |   |   |   |   |   |   |   |
 *                    ---------------------------------
 *           Figura 7.32 Os oito possíveis movimentos do cavalo
 *
 *      a) Desenhe um tabuleiro de xadrez oito por oito em uma folha de papel e
 *         tente o passeio do cavalo manualmente. Coloque um 1 no quadrado inicial,
 *         um 2 no segundo quadrado, um 3 no terceiro e assim por diante. Antes
 *         de iniciar o passeio, estime até onde você chegará, lembrando-se que
 *         um passeio completo consiste de 64 movimentos. Até onde você foi? Isso
 *         foi próximo de sua estimativa?
 *      b) Agora vamos desenvolver um aplicativo que moverá o cavalo pelo tabuleiro.
 *         O tabuleiro é representado por um array bidimensional oito por oito
 *         'board'. Cada quadro é inicializado como zero. Descrevemos cada um dos
 *         oito movimentos possíveis em termos de seus componentes vertical e
 *         horizontal. Por exemplo, um movimento do tipo 0 como mostrado na
 *         Figura 7.32 consiste em mover dois quadrados horizontalmente para a
 *         direita e um quadrado verticalmente para cima. Um movimento do tipo
 *         2 consiste em mover um quadrado horizontalmente para a esquerda e dois
 *         quadrados e dois quadrados verticalmente para cima. Movimentos horizontais
 *         para a esquerda e movimentos verticais para cima são indicados com
 *         números negativos. Os oitos movimentos podem ser descritos por dois
 *         arrays unidimensionais, 'horizontal' e 'vertical', como segue:
 *
 *                  horizontal[ 0 ] =  2        vertical[ 0 ] = -1
 *                  horizontal[ 1 ] =  1        vertical[ 1 ] = -2
 *                  horizontal[ 2 ] = -1        vertical[ 2 ] = -2
 *                  horizontal[ 3 ] = -2        vertical[ 3 ] = -1
 *                  horizontal[ 4 ] = -2        vertical[ 4 ] =  1
 *                  horizontal[ 5 ] = -1        vertical[ 5 ] =  2
 *                  horizontal[ 6 ] =  1        vertical[ 6 ] =  2
 *                  horizontal[ 7 ] =  2        vertical[ 7 ] =  1
 *
 *         Faça com que as variáveis currentRow e currentColumn indiquem,
 *         respectivamente, a linha e a coluna da posição atual do cavalo. Para
 *         fazer um movimento do tipo moveNumber, que que moveNumber está entre
 *         0 e 7, seu aplicativo deve utilizar as instruções
 *
 *          currentRow += vertical[ moveNumber ];
 *          currentColumn += horizontal[ moveNumber ];
 * 
 *         Escreva um aplicativo para mover o cavalo pelo tabuleiro. Mantenha um
 *         contador que varia de 1 para 64. Registre a última contagem em cada
 *         quadrado para que o cavalo se move. Teste cada movimento potencial
 *         para assegurar que o cavalo não saia fora do tabuleiro. Execute o
 *         aplicativo. Quantos movimentos o cavalo fez ?
 *
 *      c) Depois de tentar escrever e executar um aplicativo para o passeido do
 *         cavalo, você provavelmente desenvolveu algumas idéias valiosas.
 *         Utilizaremos essas percepções para desenvolver uma heurística (ou
 *         'regra geral') para mover o cavalo. A heurística não garante sucesso,
 *         mas a heurística cuidadosamente desenvolvida aumenta signifivamente a
 *         a chance de sucesso. Você pode ter observado que os quadrados
 *         externos são mais incômodos que os quadrados próximos do centro do
 *         tabuleiro. De fato, os quadrados mais problemáticos ou inacessíveis
 *         são os quatro cantos.
 *              A intuição pode sugerir que você deva tentar mover o cavalo para
 *         os quatro mais problemáticos primeiro e deixar abertos aqueles que
 *         são fáceis de alcançar de modo que, quando o tabuleiro ficar
 *         congestionado próximo do fim do passeio, haja uma maior chance de
 *         sucesso.
 *              Poderíamos desenvolver uma 'acessibilidade heurística'
 *         classificando cada um dos quadrados de acordo com seu grau de
 *         acessibilidade e então sempre movendo o cavalo (utilizando os
 *         movimentos em forma de L) para o quadrado mais incessível. Rotulamos
 *         um array bidimensional 'accessibility' com números indicando apartir
 *         de quantos quadrados cada quadrado particular é acessível. Em um
 *         tabuleiro vazio, cada um dos 16 quadrados mais próximos do centro é
 *         avaliado como 8, o quadrado de cada canto é avaliado como 2, e os
 *         outros quadrados têm números de acessibilidade de 3, 4 ou 6 como
 *         segue:
 *                          2  3  4  4  4  4  3  2
 *                          3  4  6  6  6  6  4  3
 *                          4  6  8  8  8  8  6  4
 *                          4  6  8  8  8  8  6  4
 *                          4  6  8  8  8  8  6  4
 *                          4  6  8  8  8  8  6  4
 *                          3  4  6  6  6  6  4  3
 *                          2  3  4  4  4  4  3  2
 *              Escreva uma versão do passeio do cavalo utilizando a heurística
 *         de acessibilidade. O cavalo sempre deve mover-se para o quadrado com
 *         o número de acessibilidade mais baixo. Em caso de um impasse, o
 *         cavalo pode mover-se para qualquer quadrado já visitado. Portanto, o
 *         passeio pode começar em qualquer um dos quatro cantos. [Nota: À medida
 *         que o cavalo se move pelo tabuleiro de xadrez, seu aplicativo deve
 *         reduzir os números de acessibilidade conforme mais quadrados se tornam
 *         ocupados. Dessa maneira, em qualquer dado momento durando o passeio,
 *         o número de acessibilidade de cada quadrado disponível permanecerá
 *         precisamente igual ao número de quadrados a partir dos quais esse
 *         quadrado pode ser alcançado.] Execute essa versão do aplicativo.
 *         Você obteve um passeio completo? Modifique o aplicativo para executar
 *         64 passeios, um iniciando a partir de cada quadrado do tabuleiro de
 *         xadrez. Quantos passeios completos você obteve ?
 *
 *      d) Escreva uma versão do aplicativo passeio do cavalo que, diante de um
 *         impasse entre dois ou mais quadrados decide qual quadrado escolher
 *         olhando para aqueles quadrados alcançáveis a partir dos quadrados
 *         gerados do impasse. Seu aplicatico deve mover para o quadrado empatado
 *         para o qual o próximo movimento chegaria a um quadrado com o número
 *         de acessibilidade mais baixo.
 */

package ch07.Exer07_22;

public class Exer07_22
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
