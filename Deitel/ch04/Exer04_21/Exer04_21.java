/*
 * O processo de localizar o maior valor (isto é, o valor máximo de um grupo de valores) é
 * freqüentemente utilizado em aplicativos de computador. Por exemplo, um programa que
 * determina o vencedor de uma competição de vendas inseriria o número de unidades vendidas
 * por cada vendedor. O vendedor que vende mais unidades ganha a competição. Escreva um
 * programa em pseudocódigo e então um aplicativo Java que aceite como entrada uma série de
 * 10 inteiros e determine e imprima o maior dos inteiros. Seu programa deve utilizar pelo
 * menos três variáveis, descritas a seguir:
 * 
 * a) counter: um contador para contar até 10 (isto é, monitorar quantos números foram
 * inseridos e determinar quando todos os 10 números foram processados).
 * b) number: o inteiro mais recentemente inserido pelo usuário.
 * c) largest: o maior número encontrado até agora.
 */

package ch04.Exer04_21;

import java.util.Scanner;

public class Exer04_21
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		int counter = 0, number, largest;

		System.out.println("Digite um inteiro: ");
		number = input.nextInt();
		largest = number;
		counter++;
		//System.out.println(counter);
		
		while (counter <= 9){
			System.out.println("Digite um inteiro: ");
			number = input.nextInt();
			if (number > largest)
				largest = number;
			counter++;
			//System.out.println(counter);
		}
		System.out.println("Maior número: " + largest);
	}
}
