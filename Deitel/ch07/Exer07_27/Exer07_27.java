/*
 * (Crivo de Eratóstenes) Um numero primo é qualquer inteiro maior que um que é
 * igualmente divisível apenas por si mesmo e por 1. O crivo de Eratóstenes é um
 * método de localizar números primos. Ele opera como segue:
 *
 *      a) Crie um array booleano de tipo primitivo com todos os elementos
 * inicializados como true. Os elementos do array com índices primos permanecerão
 * true. Todos os outros elementos do array por fim são configurados como false.
 *
 *      b) Iniciando o índice de array 2, determine se um dado elemento é true.
 * Se for, faça um loop pelo restante do array e configure como false cada elemento
 * cujo índice é múltiplo do índice para o elemento com valor true. Então continue
 * o processo com o próximo elemento com valor true. Para o índice de array 2,
 * todos os elementos alé do elemento 2 no array que tiverem que tiverem índices
 * múltiplos de 2 (índices 4, 6, 8, 20 etc) serão configurados como false; para
 * o índice de array 3, todos os elementos além do elemento 3 no array que tiverem
 * múltiplos de 3 (índices 6, 9, 12, 15 etc) serão configurados como false; e
 * assim por diante.
 *
 *         Quando esse processo for concluído, os elementos de array que ainda
 * forem true indicam que o índice é um número primo. Esses índices podem ser
 * exibidos. Escreva um aplicativo que utiliza um array de 1000 elementos para
 * determinar e exibir os números primos entre 2 e 999. Ignore elementos de array
 * 0 e 1.
 */

package ch07.Exer07_27;

public class Exer07_27
{

}
