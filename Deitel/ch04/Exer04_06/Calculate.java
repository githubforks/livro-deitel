/*
 * Combine as instruções escritas no exercício 4.5 em um aplicativo
 * Java que calvula e imprime a soma dos inteiros de 1 a 10. Utilize
 * a instrução while para fazer loop pelas instruções de cálculo e
 * incremento. O loop deve terminar quando  o valor de x tornar-se 11.
 */

package ch04.Exer04_06;

public class Calculate {
	public static void main(String[] args) {
		int sum,x;

		x = 1;
		sum = 0;

		while (x <= 10){
			sum += x++;
			//++x;
		}
		System.out.println("A soma é: " + sum);
	}
}
