/*
 * Desenvolva um aplicativo Java que determine o salário bruto de cada um dos três empregados.
 * A empresa paga 'hora normal' pelas primeiras 40 horas trabalhadas por cada funcionário
 * e 50% a mais para todas as horas trabalhadas além de 40 horas. Você recebe uma lista dos
 * empregados da empresa, o número de horas trabalhadas por empregado na última semana e o
 * salário-hora de cada empregado. Seu programa deve aceitar a entrada dessas informações para
 * cada empregado e então determinar e exibir o salário bruto do empregado. Utilize a classe
 * Scanner para inserir os dados.
 */

package ch04.Exer04_20;

import java.util.Scanner;

public class Exer04_20 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] emp = new double[3]; //Empregados
		int[] h = new int[3]; //Horas trabalhadas
		double[] s = new double[3]; //Salário-hora de cada empregado

		for (int i = 0; i <= 2; i++) {
			System.out.println("Empregado " + i);
			System.out.print("Horas trabalhadas: ");
			h[i] = input.nextInt();
			System.out.print("Salário-hora: ");
			s[i] = input.nextDouble();
		}
		
		for (int i = 0; i <= 2; i++) {
			if (h[i] <= 40)
				emp[i] = h[i]*s[i];
			else{
				emp[i] = 40*s[i];
				emp[i] += (h[i]-40)*(s[i]*1.5);
			}
		}

		for (int i = 0; i <= 2; i++) {
			System.out.println("-;-;-;-;-;-;-;-;-;-;");
			System.out.println("Empregado " + i);
			System.out.println("Salário-hora: " + s[i]);
			System.out.println("Horas trabalhadas: " + h[i]);
			System.out.println("Salário Final: " + emp[i]);
		}
	}
}