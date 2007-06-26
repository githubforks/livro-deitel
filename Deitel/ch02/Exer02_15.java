package ch02;

import java.util.Scanner;

public class Exer02_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		int numero1, numero2, soma, produto, diferenca, divisao;		
		
		System.out.print("O primeiro inteiro: ");
		numero1 = input.nextInt();
		System.out.print("O segundo inteiro: ");
		numero2 = input.nextInt();
		
		soma = numero1 + numero2;
		produto = numero1 * numero2;
		diferenca = numero1 - numero2;
		divisao = numero1/numero2;
		
		System.out.printf("Soma = %d, Produto = %d, Diferenca = %d, Divisao = %d", 
				soma,produto,diferenca, divisao);
	}
}
