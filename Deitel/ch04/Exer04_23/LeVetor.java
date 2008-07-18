package ch04.Exer04_23;

//Preenche um vetor de inteiros sem repetir valores

import java.util.Scanner;

public class LeVetor {
	public LeVetor(int[] vetor){

		Scanner input = new Scanner(System.in);
		Busca b = new Busca();
		boolean boo;
		int temp, ultimo = 0;

		for (int i = 0; i < vetor.length; i++) {
			boo = true;
			while (boo == true){
				System.out.print("Digite um inteiro: ");
				temp = input.nextInt();
				boo = b.busca(vetor, ultimo-1, temp);
				if (boo == true)
					System.out.println("Numero já existe no vetor.");
				else vetor[ultimo]=temp;
			}
			ultimo++;
		}
	}
}
