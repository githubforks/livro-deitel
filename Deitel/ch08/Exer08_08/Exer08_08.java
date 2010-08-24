/*
 * (Aprimorando a classe Data) Modifique a classe Date da Figura 8.7 para
 * realizar uma verificação de erros nos valores inicializados das variáveis de
 * instância month, day e year (atualmente ela valida somente o mês e o dia).
 * Forneça um método nextDay para incrementar o dia por um. O objeto Date sempre
 * deve permanecer em um estado consistente. Escreva um programa que testa o
 * método nextDay em um loop que imprime a data durante cada iteração do loop
 * para ilustrar que o método nextDay funciona corretamente. Tese os seguintes
 * casos:
 *
 *      a) incrementar para o próximo mês e
 *      b) incrementar para o prócimo ano
 */

package ch08.Exer08_08;

public class Exer08_08
{
	public static void main(String[] args)
	{
		Date date = new Date(4,26,1984);
		System.out.print("Current Date: ");
		System.out.println(date.toString());
		
		for (int i = 0; i < 365; i++)
			date.nextDay();
		System.out.print("Next year:    ");
		System.out.println(date.toString());
		
		for (int i = 0; i < 30; i++)
			date.nextDay();
		System.out.print("Next month:   ");
		System.out.println(date.toString());
	}
}
