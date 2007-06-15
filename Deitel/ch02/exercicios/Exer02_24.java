package ch02.exercicios;

import java.util.Scanner;

public class Exer02_24 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1,n2,n3,n4,n5,maior;

		System.out.print("Digite o primeiro inteiro:");
		n1 = input.nextInt();

		System.out.print("Digite o segundo inteiro:");
		n2 = input.nextInt();

		System.out.print("Digite o terceiro inteiro:");
		n3 = input.nextInt();

		System.out.print("Digite o quarto inteiro:");
		n4 = input.nextInt();

		System.out.print("Digite o quinto inteiro:");
		n5 = input.nextInt();
		
		maior = n1;
		
		if (n2>maior)
			maior=n2;
		if (n3>maior)
			maior=n3;
		if (n4>maior)
			maior=n4;
		if (n5>maior)
			maior=n5;
		
		System.out.println("O maior numero digitado foi: " + maior);
	}
}
