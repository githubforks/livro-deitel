package ch04.Exer04_30;

import java.util.Scanner;

public class Exer04_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer num = 0;
		String s;

		while (num.toString().length() != 5){
			System.out.print("Digite o número: ");
			num = input.nextInt();
			if (num.toString().length() != 5)
				System.out.println("Erro: Não tem 5 dígitos.");
		}

		s = num.toString();		
		if ((s.charAt(0) == s.charAt(4)) && (s.charAt(1) == s.charAt(3)))
			System.out.println("Palíndromo");
		else System.out.println("Não é palíndromo");
	}
}
