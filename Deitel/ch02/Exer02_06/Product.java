/*
 * 	Utilizando as instruções que você escreveu no Exercício 2.5, escreva um
 * programa completo que calcule e imprima o produto de três inteiros.
 */

package ch02.Exer02_06;

//Ex. 2.6: Product.java
//Calcula o produto de três inteiros
import java.util.Scanner;

public class Product
{
	public static void main(String[] args)
	{
		//cria um Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		int x; //Primeiro número inserido pelo usuário
		int y; //Segundo número inserido pelo usuário
		int z; //Terceiro número inserido pelo usuário
		int result; //Produto dos números
		
		System.out.println("Enter first integer:"); //Solicita entrada
		x = input.nextInt(); //Lê o primeiro inteiro
		
		System.out.println("Enter second integer:"); //Solicita entrada
		y = input.nextInt(); //Lê o segundo inteiro
		
		System.out.println("Enter third integer:"); //Solicita entrada
		z = input.nextInt(); //Lê o terceiro inteiro
		
		result = x*y*z; //Calcula o produto dos números
		
		System.out.printf("Product is %d\n", result);
	}//Fim do método principal
}//Fim da classe product
