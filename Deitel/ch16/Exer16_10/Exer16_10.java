/*
 * (Quicksort) A técnica de classificação recursiva chamada quicksort utiliza o
 * seguinte algoritmo básico para um array unidimensional de valores:
 *
 *      a) Passo de partição: selecione o primeiro elemento do array
 * não-classificado e determine sua localização final no array classificado
 * (isto é, todos os valores à esquerda do elemento no array são menores que o
 * elemento e todos os valores à direita do elemento no array são maiores que o
 * elemento - mostramos como fazer isso a seguir). Agora temos um elemento em
 * sua posição adequada e dois subarrays não-classificados.
 *      b) Passo recursivo: realize o Passo 1 em cada subarray não-classificado.
 * Toda vez que o Passo 1 for realizado em um subarray, outro elemento é
 * colocado em sua posição final no array classificado e dois subarrays
 * não-classificados são criados. Quando um subarray consiste em apenas um
 * elemento, esse elemento esta na sua localização final (porque o array de um
 * elemento já esta classificado).
 *      O algoritmo básico parece suficientemente simples, mas como determinamos
 * a posição final do primeiro elemento de cada subarray ? Como exemplo,
 * considere o seguinte conjunto de valores (o elemento em negrito é o elemento
 * de partição - ele será colocado em sua localização final no array
 * classificado):
 *      (37) 2 6 4 89 8 10 12 68 45
 * Iniciado a partir do elemento mais a direita do array, compare cada elemento
 * com 37 até um elemento menor que 37 ser encontrado; então permute o 37 e esse
 * elemento. O primeiro elemento menor que 37 é 12, então 37 e 12 são
 * permutados. O novo array é
 *      12 2 6 4 89 8 10 (37) 68 45
 *      O elemento 12 esta em itálico para indicar que acabou de ser permutado
 * com 37.
 *      Iniciando a partir da esquerda do array, mas começando com o elemento
 * depois de 12, compare cada elemento com 37 até um elemento maior que 37 ser
 * encontrado; então permute 37 e esse elemento. O primeiro elemento maior que
 * 37 é 89; então 37 e 89 foram permutados. O novo array é
 *      12 2 6 4 (37) 8 10 89 68 45
 * Iniciando da direita, mas começando com o elemento antes de 89, compare cada
 * elemento com 37 até um elemento menor que 37 ser encontrado; então permute 37
 * e esse elemento. O primeiro elemento menor que 37 ŕ 10; então 37 e 10 são
 * permutados. O novo array é
 *      12 2 6 4 10 8 (37) 89 68 45
 *      Iniciando da esquerda, mas começando com o elemento depois de 10,
 * compare cada elemento para 37 até umelemento maior que 37 ser encontrado;
 * então permute 37 e esse elemento. Não ha mais elementos maiores que 37; então
 * quando comparamos 37 com ele mesm o sabemos que 37 foi colocado na sua
 * localização final do array classificado. Cada valor à esquerda do 37 é menor
 * que ele e cada valor à direita do 37 e maior que ele.
 *      Uma vez que a partição foi aplicada no array anterior, há dois subarrays
 * não-classificados. O subarray com valores menores que 37 contém 12, 2, 6, 4,
 * 10 e 8. O subarray com valores maiores que 37 contém 89, 68 e 45. A
 * classificação continua recursivamente com ambos os subarrays particionados da
 * mesma maneira que o array original.
 *      Com base na discussão precedente, escreva o metodo recursivo
 * quickSortHelper para classificar um array unidimensional de inteiros. O
 * método deve receber como argumentos um índice inicial e um índice final no
 * array original sendo classificado.
 */

package ch16.Exer16_10;

public class Exer16_10 {

}
