/*
 * 		Escreva um programa que insere cinco números e determina e imprime quantos números
 * negativos, quantos número positivos e quantos zeros foram inseridos.
 */

package ch02.Exer02_32;

import java.util.Scanner;

public class Exer02_32
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n=0, pos=0, neg=0, zeros=0;
		
		System.out.print("Digite o primeiro número:");
		n = input.nextInt();
		if (n>0)
			pos++;
		else if (n<0)
			neg++;
		else zeros++;
		
		System.out.print("Digite o segundo numero:");
		n = input.nextInt();
		if (n>0)
			pos++;
		else if (n<0)
			neg++;
		else zeros++;
		
		System.out.print("Digite o terceiro numero:");
		n = input.nextInt();
		if (n>0)
			pos++;
		else if (n<0)
			neg++;
		else zeros++;
		
		System.out.print("Digite o quarto numero:");
		n = input.nextInt();
		if (n>0)
			pos++;
		else if (n<0)
			neg++;
		else zeros++;
		
		System.out.print("Digite o quinto numero:");
		n = input.nextInt();
		if (n>0)
			pos++;
		else if (n<0)
			neg++;
		else zeros++;
		
		System.out.printf("Positivos: %d, Negativos: %d, Zeros: %d",pos,neg,zeros);
	}
}
