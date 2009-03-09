/*
 * (Percurso na ordem de nível de árvore binária) O programa das figuras 17.17 e
 * 17.18 ilustrou os três métodos recursivos para percorrer uma árvore binária -
 * os percursos na ordem, pré-ordem e pós-ordem. Esse exercício apresenta o
 * percurso na ordem de nível de uma árvore binária, em que os valores de nó são
 * impressos nível por nível iniciando no nível do nó-raiz. Os nos em cada nível
 * são impressos da esquerda para a direita. O percurso na ordem de nível não é
 * um algoritmo recursivo. Esse percurso utiliza um objeto fila para cotrolar a
 * saída dos nós. O algoritmo é o seguinte:
 *
 *      a) inserir o nó-raiz na fila.
 *      b) Enquanto houver nós esquerdos na fila, fazer o seguinte:
 *              Obter o próximo nó na fila.
 *              Imprimir o valor do nó.
 *              Se a referência ao filho esquerdo do nó não for nula:
 *                  Inserir o nó-filho esquerdo na fila.
 *              Se a referência ao filho direito do nó não for nula:
 *                  Inserir o nó-filho direito na fila.
 *
 * Escreva o método levelOrder para realizar um percurso na ordem de nível de um
 * objeto árvore binária. Modifique o programa das figuras 17.17 e 17.18 para
 * utilizar esse método. [Nota: Você também precisará utilizar métodos de
 * processamento de fila da Figura 17.13 nesse programa.]
 */

package ch17.Exer17_24;

/**
 *
 * @author marcio
 */
public class Exer17_24 {

}
