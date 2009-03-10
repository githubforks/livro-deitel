/*
 * Escrever um aplicativo que aceite como entrada um inteiro contendo somente 0s e 1s
 * (isto é, um inteiro binário) e imprime seu equivalente decimal. [Dica: Utilize os
 * operadores de resto e divisão para pegar os dígitos do número binário um de cada vez,
 * da direita para a esquerda. No sistema de números decimais, o dígito mais à direita
 * tem um valor posicional 1 e o próximo dígito à esquerda tem um valor posicional de 10,
 * depois 100, depois 1.000 e assim por diante. O número decimal 234 pode ser interpretado
 * como 4*1 + 3*10 + 2*100. No sistema de números binários, o dígito mais à direita tem um
 * valor posicional de 1, o próximo dígito à esquerda tem um valor posicional de 2, depois de
 * 4, depois de 8 e assim por diante. O equivalente dicimal do binário 1101 é
 * 1*1 + 0*2 + 1*4 + 1*8, ou 1 + 0 + 4 + 8 ou, 13]
 */

package ch04.Exer04_31;

import java.util.Scanner;

public class Exer04_31
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Integer bin, soma = 0, divisor=1, mult=1;

		System.out.print("Digite o número binário: ");
		bin = input.nextInt();

		for (int i = bin.toString().length(); i > 0; i--)
		{
			System.out.println("(("+bin+"/"+divisor+")%10)*"+mult);
			System.out.println("(("+bin/divisor+")%10)*"+mult);
			System.out.println("("+(bin/divisor)%10+")*"+mult);
			System.out.println(((bin/divisor)%10)*mult);
			soma+=((bin/divisor)%10)*mult;
			divisor*=10;
			mult*=2;
			System.out.println("-;-;-;-;-;-;-;-;");
		}
		System.out.println("soma = " + soma);
	}
}
