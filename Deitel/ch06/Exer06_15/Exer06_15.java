/*
 * Defina um método hypotenuse que calcule o comprimento da hipotenusa de um
 * triângulo direito quando o comprimento dos outros dois lados são conhecidos.
 * (Utilize os dados do exemplo na Figura 6.26.) O método deve receber dois
 * argumentos do tipo double e retornar a hipotenusa como um double. Incorpore
 * esse método a um aplicativo que lê valores para side1 e side2 e realiza o
 * cálculo com o método hypotenuse. Determine o comprimento da hipotenusa para
 * cada um dos triângulos na Figura 6.26.
 *
 *			Triângulo	Lado 1	Lado 2
 *			1           3.0     4.0
 *			2           5.0     12.0
 *			3           8.0     15.0
 *
 * Figura 6.26 Valores para os lados dos triângulos no exemplo 6.15
 *
 * [Nota: hypotenusa^2 = cateto_oposto^2 + cateto_adjacente^2]
 */

package ch06.Exer06_15;

import java.util.Scanner;

public class Exer06_15
{
	public double hypotenuse( double arg0, double arg1)
	{
		return ( Math.sqrt( Math.pow(arg0, 2) + Math.pow(arg1, 2) ) );
	}
	
	public static void main ( String args[] )
	{
		Scanner input = new Scanner( System.in );
		Exer06_15 exer = new Exer06_15();
		double side1, side2;
		
		side1 = 3.0; side2 = 4.0;
		System.out.println( "side1 = " + side1 + ", side2 = " + side2 +
				", hypotenuse = " + exer.hypotenuse( side1, side2 ) );
		
		side1 = 5.0; side2 = 12.0;
		System.out.println( "side1 = " + side1 + ", side2 = " + side2 +
				", hypotenuse = " + exer.hypotenuse( side1, side2 ) );
		
		side1 = 8.0; side2 = 15.0;
		System.out.println( "side1 = " + side1 + ", side2 = " + side2 +
				", hypotenuse = " + exer.hypotenuse( side1, side2 ) );

		System.out.println( "Digite side1: ");
		side1 = input.nextDouble();
		System.out.println( "Digite side2: ");
		side2 = input.nextDouble();
		System.out.println( "side1 = " + side1 + ", side2 = " + side2 +
				", hypotenuse = " + exer.hypotenuse( side1, side2 ) );
	}
}
