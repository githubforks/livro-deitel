package ch04.Exer04_21;

import java.util.Scanner;

public class Exer04_21 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int counter = 0, number, largest;

		System.out.println("Digite um inteiro: ");
		number = input.nextInt();
		largest = number;
		counter++;
		//System.out.println(counter);
		
		while (counter != 10){
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
