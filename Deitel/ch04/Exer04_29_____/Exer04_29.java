package ch04.Exer04_29_____;

import java.util.Scanner;

public class Exer04_29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lado = 0;

		while ((lado < 1)||(lado > 20)){
			System.out.print("Digite o tamanho do lado: ");
			lado = input.nextInt();
		}

		for (int i = 0; i < lado; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		for (int i = 0; i < lado; i++) {
			System.out.print("*");
			for (int j = 0; i < lado-2; i++)
				System.out.print(" ");
			System.out.println("*");
		}
	
		for (int i = 0; i < lado; i++) {
			System.out.print("*");
		}

	}
}
