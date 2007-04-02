package ch02.exercicios;

import java.util.Scanner;

public class Exer2_28 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int raio;
		
		System.out.print("Digite o raio:");
		raio = input.nextInt();
		
		System.out.printf("Diâmetro = %d, Circunferência = %f, Área = %f",2*raio,2*Math.PI,Math.pow(Math.PI, 2));
	}
}
