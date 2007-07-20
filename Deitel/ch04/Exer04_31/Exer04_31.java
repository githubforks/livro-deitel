package ch04.Exer04_31;

import java.util.Scanner;

public class Exer04_31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer bin, soma = 0;
		String c;

		System.out.print("Digite o número binário: ");
		bin = input.nextInt();

		for (int i = 0; i < bin.toString().length(); i++) {
			c = (String)bin.toString().charAt(i);
			System.out.println((int)c + "*" + (i+1));
			soma += ((int)c * (i+1));
		}
		System.out.println("soma = " + soma);
	}
}
