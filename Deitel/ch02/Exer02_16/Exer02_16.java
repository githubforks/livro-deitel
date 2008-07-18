/*
 * Escreva um aplicativo que solicita ao usuário inserir dois inteiros, obtém do usuário
 * esses números e exibe o número maior seguido pelas palavras "is larger". Se os números
 * forem iguais, imprima a mensagem "These numbers are equal". Utilize as técnicas mostradas
 * na figura 2.15.
 */

package ch02.Exer02_16;

import java.util.Scanner;

public class Exer02_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2;
		System.out.print("Digite o primeiro inteiro: ");
		n1 = input.nextInt();
		System.out.print("Digite o segundo inteiro: ");
		n2 = input.nextInt();
		
		if (n1 > n2)
			System.out.println("n1 � maior.");
		else if (n2 > n1)
			System.out.println("n2 � maior.");
		else System.out.println("n1 e n2 s�o iguais.");
	}
}
