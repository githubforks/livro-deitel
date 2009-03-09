/*
 * (Exclusão de árvore binária) Neste exercício, discutimos a exclusão de itens
 * de árvores de pesquisa binária. O algoritmo de exclusão não é tão simples e
 * direto quanto o algoritmo de inserção. Três casos são encontrados ao excluir
 * um item - o item está contido em um nó-folha (isto é, não tem filhos) o item
 * está contido em um nó que tem um filho ou o item está contido em um nó que
 * tem dois filhos.
 *
 *      Se o item a ser excluido está contido em um nó-folha, o nó é excluído e
 *      a referência no nó pai e configurada como nulo.
 *
 *      Se o item a ser excluído está contido em um nó com um filho, a
 *      referência no nó-pai é configurada para referenciar o nó-filho e o nó
 *      contendo o item de dados é excluido. Isso faz com que o nó-filho tome o
 *      lugar do nó excluido na árvore.
 *
 *      O último caso é o mais dificil. Quando um nó com dois filhos é excluído,
 *      outro nó na árvore deve tomar seu lugar. Entretanto, a referência no
 *      nó-pai simplesmente não pode ser atribuída para referenciar um dos
 *      filhos do nó a ser excluido. Na maioria dos casos, a árvore de pesquisa
 *      binária resultante não incorporaria seguinte característica das árvores
 *      de pesquisa binária (sem valores duplicados): Os valores em qualquer
 *      subárvore esquerda são menores que o valor no nó-pai e os valores em
 *      qualquer subárvore direita são maiores que o valor no nó-pai.
 * 
 *    Qual é o nó utilizado como um nó substituto para manter essa
 * característica? É o nó contendo o maior valor na árvore menor que o valor no
 * nó sendo excluído, ou o nó contendo o menor valor na árvore maior que o valor
 * no nó sendo excluído? Vamos considerar o nó com o menor valor. Em uma árvore
 * de pesquisa binária, o maior valor menor que um valor do pai encontra-se na
 * subárvore esquerda do nó-pai e seguramente estará contido no nó mais à
 * direita da subárvore. Esse nó é encontrado percorrendo descendo a subárvore
 * esquerda pela direita até que a referência ao filho direito do nó atual seja
 * nula. Agora estamos referenciando o nó substituto que é um nó-folha ou um nó
 * com um filho à sua esquerda. Se o nó substituto for um nó-folha, os passos
 * para realizar a exclusão são os seguintes:
 *
 *      a) Armazene a referência ao nó a ser excluído em uma variável de
 *         referência temporária.
 *      b) Configure a referência no pai do nó sendo excluído para referenciar o
 *         nó substituto.
 *      c) Configure a referência no pai do nó substituto como null.
 *      d) Configure a referência como a subárvore direita no nó substituto para
 *         referenciar a subárvore direita do nó a ser excluído
 *      e) Configure a referência como a subárvore esquerda no nó substituto
 *         para referenciar a subárvore esquerda do nó a ser excluido.
 *
 * Os passos de exclusão para um nó substituto com um filho esquerdo são
 * semelhantes àqueles para um nó substituto sem filhos, mas o algoritmo também
 * deve mover o filho para a posição do nó substituto na árvore. Se o nó
 * substituto for um nó com um filho esquerdo, os passos a realizar a exclusão
 * são como segue:
 *
 *      a) Armazene a referência ao nó a ser excluido em uma variável de
 *         referencia temporária.
 *      b) Configure a referência no pai do nó sendo excluído para referenciar o
 *         nó substituto.
 *      c) Configure a referência no pai do nó substituto para referenciar o
 *         filho esquerdo do nó substituto.
 *      d) Configure a referência à subárvore direita do nó substituto para
 *         referenciar a subárvore direita do nó a ser excluído.
 *      e) Configure a referência como a subárvore esquerda no nó substituto
 *         para referenciar a subávore esquerda do nó a ser excluído.
 *
 * Escreva o método deleteNode, que aceita como seu argumento o valor a ser
 * excluído. O método deleteNode deve localizar na árvore o nó que contém o
 * valor a ser excluído e utilizar os algoritmos discutidos aqui para excluir o
 * nó. Se o valor não for localizado na árvore, o método deve imprimir uma
 * mensagem que indica se o valor foi excluído. Modifique o programa das figuras
 * 17.17 e 17.18 para utilizar esse método. Depois de excluir um item, chame os
 * métodos inorderTraversal, preorderTraversal e postorderTraversal para
 * confirmar que a operação de exclusão foi realizada corretamente.
 */

package ch17.Exer17_22;

public class Exer17_22 {

}
