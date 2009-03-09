/*
 * (Percurso para saída de um labirinto utilizando reversão recursiva) A grade
 * #s e pontos (.) na Figura 15.26 é uma representação de um array bidimensional
 * de um labirinto. Os #s representam as paredes do labirinto e os pontos
 * representam as localizações nos possíveis caminhos pelo labirinto. Movimentos
 * são permitidos apenas nas posições do array que contiverem um ponto.
 *      Escreva um método recursivo (mazeTransversal) para percorrer labirintos
 * semelhantes aos mostrados na Figura 15.26. O método deve receber como
 * argumentos um array de caracteres 12 por 12 que representa o labirinto e a
 * localização atual no labirinto (na primeira vez que esse método for chamdo, a
 * localização atual deve ser o ponto de entrada do labirinto). À medida que
 * mazeTransversal tenta localizar a saída, ele deve colocar o caractere x em
 * cada quadrado no caminho. Há um algoritmo simples para percorrer um labirinto
 * que garante a localização da saída (assumindo que existe uma saída). Se não
 * houver nenhuma saída, você chegará à localização inicial novamente. O
 * algoritmo para esse método é semelhante ao mostrado a seguir: a partir da
 * localização atual no labirinto, tente mover-se um espaço em qualquer uma das
 * possíveis deireções (para baixo, para a direita, para cima ou para a
 * esquerda). Se for possível ir pelo menos par uma direção, chame mazeTraversal
 * recursivamente, passando o novo local no labirinto como o local atual.
 * Programe o método para exibir o labirinto depois de cada movimento para que o
 * usuário possa observar enquanto uma solução para o labirinto é procurada. A
 * saída final do labirinto deve exibir somente o caminho necessário para
 * resolver o labirinto - os outros caminhos não devem ser exibidos. [Dica: Para
 * exibir apenas o caminho final, pode ser útil marcar os locais que resultam em
 * um caminho sem saída com outro caractere (como 'O').]
 *
 *                  # # # # # # # # # # # #
 *                  # . . . # . . . . . . #
 *                  . . # . # . # # # # . #
 *                  # # # . # . . . . # . #
 *                  # . . . . # # # . # . .
 *                  # # # # . # . # . # . #
 *                  # . . # . # . # . # . #
 *                  # # . # . # . # . # . #
 *                  # . . . . . . . . # . #
 *                  # # # # # # . # # # . #
 *                  # . . . . . . # . . . #
 *                  # # # # # # # # # # # #
 * Figura 15.26 Representação de array bidimensional de um labirinto
 */

package ch15.Exer15_20;

public class Exer15_20 {

}
