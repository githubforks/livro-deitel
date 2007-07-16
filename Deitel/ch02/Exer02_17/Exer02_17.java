package ch02.Exer02_17;

import java.util.Scanner;

public class Exer02_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3;
		int soma, media, produto;
		
		System.out.print("Digite o primeiro inteiro: ");
		n1 = input.nextInt();
		System.out.print("Digite o segundo inteiro: ");
		n2 = input.nextInt();
		System.out.print("Digite o terceiro inteiro: ");
		n3 = input.nextInt();
		
		soma = n1+n2+n3;
		media = soma/3;
		produto = n1*n2*n3;
		
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);
		System.out.println("Produto: " + produto);
		
		System.out.println("Comparações: ");
		if (n1 > n2)
			System.out.println("n1 é maior que n2.");
		else if (n1 < n2)
			System.out.println("n1 é menor que n2.");
		else
			System.out.println("n1 é igual a n2.");
		
		if (n1>n3)
			System.out.println("n1 é maior que n3.");
		else if (n1<n3)
			System.out.println("n1 é menor que n3.");
		else
			System.out.println("n1 é igual a n3.");
		
		if (n2>n3)
			System.out.println("n2 é maior que n3.");
		else if (n2<n3)
			System.out.println("n2 é menor que n3.");
		else 
			System.out.println("n2 é igual a n3.");
			
	}
}
