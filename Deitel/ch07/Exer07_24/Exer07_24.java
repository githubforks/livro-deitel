/*
 * (Oito rainhas) Outro problema difícil para fãs de xadrez é o problema das
 * oito rainhas, que pede o seguinte: é possível colocar oito rainhas em um
 * tabuleiro de xadrez vazio de modo que nenhuma rainha esteja 'atacando' qualquer
 * outra (isto é, sem que duas rainhas estejam na mesma linha, na mesma coluna
 * ou na mesma diagonal)? Utilize a consideração desenvolvida no Exercício 7.22
 * a fim de formular uma heurística para resolver o problema das oito rainhas.
 * Execute seu aplicativo. (Dica: É possível atribuir um valor para cada quadrado
 * do tabuleiro de xadrez para indicar quantos quadrados de um tabuleiro de
 * xadrez vazio 'são elimindos' se uma rainha for colocada nesse quadrado. Cada
 * um dos cantos receberia o valor 22, como demonstrado na Figura 7.33. Uma vez
 * que esses 'números de eliminação' são colocados em todos os 64 quadrados, uma
 * heurística apropriada poderia ser como segue: coloque a próxima rainha no
 * quadrado com o menor número de eliminação. Por que essa estratégia é
 * intuitivamente atraente ?
 *
 *                    ---------------------------------
 *                    | * | * | * | * | * | * | * | * |
 *                    ---------------------------------
 *                    | * | * |   |   |   |   |   |   |
 *                    ---------------------------------
 *                    | * |   | * |   |   |   |   |   |
 *                    ---------------------------------
 *                    | * |   |   | * |   |   |   |   |
 *                    ---------------------------------
 *                    | * |   |   |   | * |   |   |   |
 *                    ---------------------------------
 *                    | * |   |   |   |   | * |   |   |
 *                    ---------------------------------
 *                    | * |   |   |   |   |   | * |   |
 *                    ---------------------------------
 *                    | * |   |   |   |   |   |   | * |
 *                    ---------------------------------
 *           Figura 7.33 Os 22 quadrados eliminados posicionando uma rainha no
 *                       canto esquerdo superior
 */

package ch07.Exer07_24;

/**
 *
 * @author marcio
 */
public class Exer07_24 {

}
