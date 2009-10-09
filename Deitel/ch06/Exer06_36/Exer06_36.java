/*
 * Escreva um método 'distance' para calcular a distância entre dois pontos
 * (x1,y1) e (x2,y2). Todos os números e valores de retorno devem ser do tipo
 * double. Incorpore esse método a um aplicativo que permite que o usuário
 * insira coordenadas de pontos.
 */

package ch06.Exer06_36;

import java.util.Scanner;

public class Exer06_36
{
	public double distance ( int x1, int y1, int x2, int y2)
	{
		return Math.sqrt( Math.pow( ( x1-x2 ), 2 ) + Math.pow( ( y1-y2 ), 2 ) );
	}
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		Exer06_36 exer = new Exer06_36();
		int x1, x2, y1, y2;

		System.out.print("x1: ");
		x1 = input.nextInt();
		System.out.print("y1: ");
		y1 = input.nextInt();
		System.out.print("x2: ");
		x2 = input.nextInt();
		System.out.print("y2: ");
		y2 = input.nextInt();
		
		System.out.println( exer.distance(x1, y1, x2, y2) );
	}
}
