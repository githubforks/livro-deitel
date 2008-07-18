/*
 * (Palíndromos) Um palíndromo é uma seqüencia de caracteres que é lida da esquerda para
 * a direita ou da direita para a esquerda. Por exemplo, cada um dos seguintes inteiros de
 * cinco dígitos é um palíndromo: 12321, 55555, 45554, 11611. Escreva um aplicativo que leia
 * em um inteiro de cinco dígitos e determine se ele é ou não um palíndromo. Se o número não
 * for de cinco dígitos, exiba uma mensagem de erro e permita que o usuário insira um novo
 * valor.
 * 
 * P.S.: Não identifica, por exemplo, 00100.
 */

package ch04.Exer04_30_Rever;

import java.util.Scanner;

public class Exer04_30 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer tamanho = 0;
		String s = "";

		while (tamanho != 5){
			System.out.print("Digite o número: ");
			s = input.next();

			tamanho=s.length();

			if (tamanho != 5)
				System.out.println("Erro: Não tem 5 dígitos.");
			else
				if ((new SubPalavra().Sub(s))==false)
					tamanho=0;
		}

		if ((s.charAt(0) == s.charAt(4)) && (s.charAt(1) == s.charAt(3)))
			System.out.println("Palíndromo");
		else System.out.println("Não é palíndromo");
	}
}
