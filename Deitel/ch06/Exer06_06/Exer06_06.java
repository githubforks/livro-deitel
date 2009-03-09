/*
 * Escreva um aplicativo Java completo para solicitar ao usuário um raio (do tipo double)
 * de uma esfera e chame o método sphereVolume para calcular e exibir o volume da esfera.
 * Utilize a seguinte instrução para calcular o volume:
 * 
 * 					double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3)
 */

//Exercício 6.6
//Calcula o volume de uma esfera

package ch06.Exer06_06;

import java.util.Scanner;

public class Exer06_06
{
	//Obtém o raio a partir do usuário e exibe o volume da esfera
	public void determineSphereVolume()
	{
		Scanner input = new Scanner( System.in );

		System.out.print("Entre o raio da esfera: ");
		
		double raio = input.nextDouble();
		
		System.out.printf("O volume é %f",sphereVolume(raio));
	}
	
	public double sphereVolume(double raio)
	{
		double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow(raio, 3);
		return volume;
	}
}
