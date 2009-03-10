/*
 * Modifique o Exercício 5.16 no final dos exercícios do capítulo para ler a entrada
 * utilizando diálogos e exibir o gráfico de barras utilizando retângulos de comprimentos
 * variados.
 */

package ch05.Exer05_02;

import java.util.Scanner;

import javax.swing.JFrame;

public class Exer05_02 {
	public static void main(String[] args)
	{
		int n1,n2,n3,n4,n5;
		Scanner input = new Scanner(System.in);
		JFrame jf = new JFrame();
		Shapes s;

		System.out.print("Digite o 1o número: ");
		n1 = input.nextInt();
		System.out.print("Digite o 2o número: ");
		n2 = input.nextInt();
		System.out.print("Digite o 3o número: ");
		n3 = input.nextInt();
		System.out.print("Digite o 4o número: ");
		n4 = input.nextInt();
		System.out.print("Digite o 5o número: ");
		n5 = input.nextInt();

		s = new Shapes(n1, n2, n3, n4, n5);

		jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		jf.add( s ); // adiciona o painel ao frame
		jf.setSize( 300, 300 ); // configura o tamanho desejado
		jf.setVisible( true ); // mostra o frame
	}
}
