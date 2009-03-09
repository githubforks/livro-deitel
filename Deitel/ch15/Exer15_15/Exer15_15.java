/*
 * (Oito Rainhas) Em enigma para fãs de xadrez é o problema das Oito Rainhas,
 * que exige o seguinte: é possível colocar oito rainhas em um tabuleiro de
 * xadrez vazio de modo que nenhuma esteja 'atacando' alguma outra (isto é, sem
 * que duas rainhas estejam na mesma linha, na mesma coluna ou na mesma
 * diagonal)? Por exemplo, se uma rainha for colocada no cante superior esquerdo
 * do tabuleiro, nenhuma outra pode ser colocada em qualquer um dos quadros
 * marcados mostrados na Figura 15.25. Resolva o problema recursivamente. [Dica:
 * Sua solução deve iniciar com a primeira coluna e procurar uma localização
 * nessa coluna em que uma rainha possa ser colocada - inicialmente, coloque a
 * rainha na primeira linha. A solução deve então pesquisar recursivamente as
 * colunas restantes. Nas primeiras poucas colunas, há várias localizações onde
 * uma rainha pode ser colocada. Utilize a primeira localização disponível. Se
 * uma coluna for alcançada nenhuma possível localização para uma rainha, o
 * programa deve retornar à coluna anterior e mover a rainha nessa coluna para
 * uma nova linha. Esse contínuo procedimento de voltar e tentar novas
 * alternativas é um exemplo de reversão recursiva.]
 *
 *              1   2   3   4   5   6   7   8
 *            ---------------------------------
 *           1| x | * | * | * | * | * | * | * |
 *            ---------------------------------
 *           2| * | * |   |   |   |   |   |   |
 *            ---------------------------------
 *           3| * |   | * |   |   |   |   |   |
 *            ---------------------------------
 *           4| * |   |   | * |   |   |   |   |
 *            ---------------------------------
 *           5| * |   |   |   | * |   |   |   |
 *            ---------------------------------
 *           6| * |   |   |   |   | * |   |   |
 *            ---------------------------------
 *           7| * |   |   |   |   |   | * |   |
 *            ---------------------------------
 *           8| * |   |   |   |   |   |   | * |
 *            ---------------------------------
 *
 */

package ch15.Exer15_15;

public class Exer15_15 {

}
