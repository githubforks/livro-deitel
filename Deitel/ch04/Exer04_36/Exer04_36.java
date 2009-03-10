/*
 * Uma empresa quer transmitir dados por telefone, mas está preocupada com a possibilidade
 * de seus telefones estarem grampeados. Ela pediu para você escrever um programa que
 * criptografe os dados de modo que estes possam ser transmitidos mais seguramente. Todos os
 * dados são transmitidos como inteiros de quatro dígitos. Seu aplicativo deve ler um inteiro
 * de quatro dígitos inserido pelo usuário e criptografá-lo desta maneira: Substitua cada
 * dígito pelo resultado da adição de 7 ao dígito e obtendo o resto depois da divisão do novo
 * valor por 10. Troque então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto.
 * Então imprima o inteiro criptografado. Escreva um aplicativo separado que receba entrada
 * de um inteiro de quatro dígitos criptografado e o descriptografe para formar o número
 * original.
 */

package ch04.Exer04_36;

import java.util.Scanner;

public class Exer04_36
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Cripto c = new Cripto();
		Decripto d = new Decripto();
		int i=-1;

		while((i > 9999)||(i < 0))
		{
			i = input.nextInt();
			i = c.criptografa(i);
			System.out.println(i);
			i = d.descriptografa(i);
			System.out.println(i);
		}
	}
}
