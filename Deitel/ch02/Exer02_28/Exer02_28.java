/*
 * Eis uma prévia do que virá à frente. Neste capítulo, você aprendeu sobre
 * inteiros e o tipo int. O Java também pode representar números de pontos
 * flutuantes que contêm pontos de fração decimal, como 3,14159. Escreva um
 * aplicativo que lê a entrada do raio de um círculo como um inteiro e imprime o
 * diâmetro do círculo, a circunferência e a área, usando o valor de ponto
 * flutuante 3,14159 para π. Utilize as técnicas mostradas na Figura 2.7. [Nota:
 * Você também pode utilizar a constante Math.PI predefinida para o valor de π.
 * Essa constante é mais precisa que o valor 3,14159. A classe Math é definida
 * no pacote java.lang. As classes nesse pacote são importadas automaticamente,
 * assim você não precisa importar a classe Math para utilizá-la.] Utilize as
 * seguintes fórmulas (r é o raio):
 * 
 * 		diâmetro=2r
 * 		circunferência=2πr
 * 		área=π²
 *
 * Não armazene os resultados de cada cálculo em uma variável. Em vez disso,
 * especifique cada cálculo como o valor de saída de uma expressão
 * System.out.printf. Observe que os valores produzidos pela circunferência e os
 * cálculos da área são números de ponto flutuante. A saída desses valores pode
 * ser gerada com o especificador de formato %f em uma instrução
 * System.out.printf. Você aprenderá mais sobre números de pontos flutuantes no
 * Capítulo 3.
 */

package ch02.Exer02_28;

import java.util.Scanner;

public class Exer02_28
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int raio;
		
		System.out.print("Digite o raio:");
		raio = input.nextInt();
		
		System.out.printf("Diâmetro = %d, Circunferência = %f, Área = %f",2*raio,2*Math.PI,Math.pow(Math.PI, 2));
	}
}
