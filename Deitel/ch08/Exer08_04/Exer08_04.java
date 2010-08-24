/*
 * (Classe retângulo) Crie uma classe Rectangle. A classe tem atributos length e
 * width, cada um dos quais é configurado com o padrão 1. A classe deve ter métodos
 * que calculam o perímetro (perimeter) e a área (area) do retângulo. A classe tem
 * métodos get e set para o comprimento (length) e largura (width). Os métodos
 * set devem verificar se length e width são, cada um, números de ponto flutuante
 * maiores que 0.0 e menores que 20.0. Escreva um programa para testar a classe
 * Rectangle.
 */

package ch08.Exer08_04;

public class Exer08_04
{
	public static void main(String[] args)
	{
		Rectangle rectangle = new Rectangle();		
		
		System.out.printf("Length = %f, Width = %f\n", rectangle.getLength(), rectangle.getWidth());
		System.out.println("Area = " + rectangle.getArea());
		System.out.println("Perimeter = " + rectangle.getPerimeter());
		
		rectangle.setLength(10.0);
		rectangle.setWidth(5.0);

		System.out.printf("Length = %f, Width = %f\n", rectangle.getLength(), rectangle.getWidth());
		System.out.println("Area = " + rectangle.getArea());
		System.out.println("Perimeter = " + rectangle.getPerimeter());
	}
}
