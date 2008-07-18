/*
 * Uma grande empresa paga seu pessoal de vendas com base em comissões. O pessoal de vendas
 * recebe $200 por semana mais 9% de suas vendas brutas durante essa semana. Por exemplo,
 * um vendedor que realiza um total de vendas de mercadorias de $5000 em uma semana receve
 * $200 mais 9% de $5000 ou um valor total de $650. Foi-lhe  fornecida uma lista dos itens
 * dos itens vendidos por cada vendedor. Os valores desses itens itens são como segue:
 *							Item    Value
 *							1       239,99
 *							2       129,75
 *							3        99,97
 *							4       350,89
 * Desenvolva um aplicativo Java que receba a entrada de itens vendidos durante a última
 * semana e calcule e exibe os rendimentos do vendedor. Não há limites quanto ao número de
 * itens que podem ser vendidos por um mesmo vendedor.
 */

package ch04.Exer04_19;

import java.util.Scanner;

public class Exer04_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int item = 0;
		float salario = 200, vendas = 0;

		System.out.println("Item    Value");
		System.out.println("1       239,99");
		System.out.println("2       129,75");
		System.out.println("3        99,97");
		System.out.println("4       350,89");

		while (item != -1){
			System.out.println("Digite o novo item (-1 para FIM):");
			item = input.nextInt();
				if (item != -1){
					switch (item) {
						case 1:
							vendas += 239.99;
							break;
						case 2:
							vendas += 129.75;
							break;
						case 3:
							vendas += 99.95;
							break;
						case 4:
							vendas += 350.89;
							break;
						default:
							System.out.println("Vendas = " + vendas);
							break;
					}
				}
		}
		salario += vendas * 0.09;
		System.out.println("Salário Final = " + salario);

	}
}
