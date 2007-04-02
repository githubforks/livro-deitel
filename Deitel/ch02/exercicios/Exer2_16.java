package ch02.exercicios;

import java.util.Scanner;

public class Exer2_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2;
		System.out.print("Digite o primeiro inteiro: ");
		n1 = input.nextInt();
		System.out.print("Digite o segundo inteiro: ");
		n2 = input.nextInt();
		
		if (n1 > n2)
			System.out.println("n1 é maior.");
		else if (n2 > n1)
			System.out.println("n2 é maior.");
		else System.out.println("n1 e n2 são iguais.");
	}
}
