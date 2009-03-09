/*
 * (Bunket sort) Uma classificação do tipo bucket sort inicia com um array
 * unidimensional de inteiros positivos a ser classificado e um array
 * bidimensional de inteiros com linhas indexadas de 0-9 e colunas indexadas de
 * O a n-1, onde n é o número dos valores a ser classificado. Cada linha do
 * array bidimensional e chamada bucket. Escreva uma classe chamada BucketSort
 * que contenha um método denominado sort que opera desta maneira:
 *
 *      a) Coloque cada valor do array unidimensional em uma linha do array de
 * bucket, com base nas 'unidades' (o numero mais à direita) do valor. Por
 * exemplo, 97 é colocado na linha 7. 3 é colocado na linha 3 e 100 é colocado
 * na linha 0. Esse procedimento é denominado passagem de distribuição.
 *      b) Realize um loop pelo array de bucket linha por linha e copie os
 * valores de volta para o array original. Esse procedimento é denominado
 * passagem de coleta. A nova ordem dos valores precedentes no array
 * unidimensional é 100. 3 e 97.
 *      c) Repita esse processo para a posição de cada digito subseqüente
 * (dezenas, centenas, milhares etc.)
 *      Na segunda passagem (digitos das dezenas), 100 é colocado na linha 0, 3
 * é colocado na linha 0 (porque 3 não tem nenhum digito de dezena) e 97 é
 * colocado na linha 9. Depois da passagem de coleta, a ordem dos valores no
 * array unidimensional e 100, 3 e 97. Na terceira passagem (digitos das
 * centenas), 100 é colocado na linha 1, 3 é colocado na linha 0, e 97 é
 * colocado na linha O (depois do 3). Depois dess última passagem de coleta, o
 * array original está na ordem classificada.
 *      Observe que o array bidimensional dos buckets tem dez vezes o
 * comprimento do array de inteiros sendo classificado. Essa técnica de
 * classificação fornece um desempenho melhor que um bubble sort, mas exige
 * muito mais memória - o bubble sort exige espaço par somente um elemento
 * adicional de dados. Essa comparação é um exemplo da relação de troca
 * espaço-tempo: bucket sort utiliza mais memória que bubble sort, mas seu
 * desempenho é melhor. Essa versão de bucket sort requer cópia de todos os
 * dados de volta para o array original a cada passagem. Outra possibilidade é
 * criar um segundo array de bucket bidimensional e permutar os dados
 * repetidamente entre os dois arrays de bucket.
 */

package ch16.Exer16_07;

public class Exer16_07 {

}
