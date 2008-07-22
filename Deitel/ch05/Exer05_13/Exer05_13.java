/*
 * Fatoriais costumam ser utilizados em problemas de probabilidade. O fatorial de um inteiro
 * positivo n (escrito n! e pronunciado 'n fatorial') é igual ao produto dos inteiros
 * positivos de 1 a n. Escreva um aplicativo que avalia o fatorial dos inteiros de 1 a 5.
 * Exiba os resultados no formato de tabela. Que dificuldade poderia impedir você de calcular
 * o fatorial de 20 ?
 */

package ch05.Exer05_13;

public class Exer05_13 {
	public static void main(String[] args) {
		int aux;
		System.out.println("i      i!");
		for (int i = 1; i <= 5; i++) {
			aux = i;
			for (int j = 1; j < i; j++) {
				aux *= j;
			}
			System.out.printf("%d      %d\n",i,aux);
		}
	}
}
