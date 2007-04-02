package ch02.exercicios;

import java.util.Scanner;

public class Exer2_32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=0, pos=0, neg=0, zeros=0;
		
		System.out.print("Digite um numero:");
		n = input.nextInt();
		if (n>0)
			pos++;
		else if (n<0)
			neg++;
		else zeros++;
		
		System.out.print("Digite um numero:");
		n = input.nextInt();
		if (n>0)
			pos++;
		else if (n<0)
			neg++;
		else zeros++;
		
		System.out.print("Digite um numero:");
		n = input.nextInt();
		if (n>0)
			pos++;
		else if (n<0)
			neg++;
		else zeros++;
		
		System.out.print("Digite um numero:");
		n = input.nextInt();
		if (n>0)
			pos++;
		else if (n<0)
			neg++;
		else zeros++;
		
		System.out.print("Digite um numero:");
		n = input.nextInt();
		if (n>0)
			pos++;
		else if (n<0)
			neg++;
		else zeros++;
		
		System.out.printf("Positivos: %d, Negativos: %d, Zeros: %d",pos,neg,zeros);
	}
}
