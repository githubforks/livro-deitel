package ch02.exercicios;

import java.util.Scanner;

public class Exer02_25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.println("Digite o inteiro:");
		n = input.nextInt();
		
		if (n%2 == 0)
			System.out.println("O número é par.");
		else System.out.println("O número é impar.");
	}
}
