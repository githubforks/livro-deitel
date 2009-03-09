/*
 * (Tempo para calcular número de Fibonacci) Aprimore o programa Fibonacci da
 * Figura 15.5 para que ele calcule a quantidade aproximada de tempo necessário
 * para efetuar o cálculo e o número de chamadas feitas para o método recursivo.
 * Para esse fim, chame o método satic System cuttentTimeMillis, que não aceita
 * nenhum argumento e retorna a hora atual do computador em milissegundos. Chame
 * esse método duas vezes - uma antes da chamada a fibonacci e uma vez depois da
 * chamada a fibonacci. Salve cada um desses valores e calcule a diferença nas
 * horas para determinar quantos milissegundos foram necessários para efetuar o
 * cálculo. Então, adicione uma variável à classe FibonacciCalculator e utilize
 * essa variável para determinar o número de chamadas feitas para o método
 * fibonacci. Exiba seus resultados.
 */

package ch15.Exer15_23;

public class Exer15_23 {
    public static void main ( String args[] ){
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis());
    }
}
