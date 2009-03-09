/*
 * (Imprimindo árvores) Escreva um metodo recursivo outputTree para exibir um
 * objeto árvore binária na tela. O método deve gerar saída árvore linha por
 * linha com a parte superior da árvore na parte esquerda da tela e a parte
 * inferior da árvore em direção à parte direita da tela. Cada linha enviada
 * para a saída verticalmente. Por exemplo, a árvore binária ilustrada na Figuta
 * 17.20 é enviada para a saída como mostrado na Figura 17.21.
 *      Observe que o nó mais à direita da folha aparece na parte superior da
 * saída na coluna mais a direita, e o nó-raiz aparece à equerda da saída. Cada
 * coluna de saida inicia cinco espaços a direita da coluna precedente. O método
 * outputTree deve receber um argumento totalSpaces para representar o número de
 * espaços que precedem o valor a ser enviado para a saída. (Essa variável deve
 * iniciar em zero de modo que o nó-raiz seja enviado para a saída à esquerda da
 * tela.) O método utiliza um percurso na ordem modificado para gerar saída da
 * árvore - ele inicia no nó mais à direita na árvore e segue para a esquerda. O
 * algoritmo é como segue:
 *
 *                      99
 *               97
 *                      92
 *        83
 *                      72
 *               71
 *                      69
 * 49
 *                      44
 *               40
 *                      32
 *        28
 *                      19
 *               18
 *                      11
 * Figura 17.21 Saída de exemplo do método recursivo outputTree.
 *
 * Enquanto a referência ao nó atual nao for nula, realize o seguinte:
 *      Chame recuniivamente outputTree com a subárvore direita do nó atual é
 *          totalSpaces + S.
 *      Utilize uma estrutura for para contar de 1 a totalSpaces e envie os
 *      espaços para saída.
 *      Envie para a saída o valor no nó atual.
 *      Configure a referência ao nó atual para referencir a subárvore esquerda
 *      do nó atual.
 *      Incremente totalSpaces por 5.
 */

package ch17.Exer17_25;

public class Exer17_25 {

}
