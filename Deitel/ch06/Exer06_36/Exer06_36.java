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
	public double distance ( Pontos arg0, Pontos arg1)
	{
		double dist = 0.0;
		
		return dist;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		Exer06_36 exer = new Exer06_36();
		Pontos p1;
		
		p = new Pontos();
		
		System.out.print("x1: ");
		p.setX1( input.nextDouble() );
		System.out.print("y1: ");
		p.setY1( input.nextDouble() );
		System.out.print("x2: ");
		p.setX2( input.nextDouble() );
		System.out.print("y2: ");
		p.setY2li( input.nextDouble() );
		
		
	}
}
