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
