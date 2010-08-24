/*
 * (Classe Data e hora) Crie uma classe DateAndTime que combina a classe Time2
 * modificada do Exercício 8.7 e a classe Date modificada do exercício 8.8.
 * Modifique o método incrementHour para chamar o método nextDay se a data/hora
 * for incrementada para o próximo dia. Modifique os métodos toStandardString
 * e toUniversalString para dar saída à data além da hora. Escreva um programa
 * para testar a nova classe DateAndTime. Especificamente, teste o incremento de
 * tempo para o próximo dia.
 */

package ch08.Exer08_13;

public class Exer08_13
{
	public static void main(String[] args)
	{
		DateAndTime dateAndTime = new DateAndTime(0, 0, 0, 04, 26, 1984);
		
		System.out.print("Begining:  ");
		System.out.println(dateAndTime.toUniversalString());
		
		System.out.print("+1 Second: ");
		dateAndTime.tick();
		System.out.println(dateAndTime.toUniversalString());
		
		System.out.print("+1 Minute: ");
		for (int i = 0; i < 60; i++)
			dateAndTime.tick();
		System.out.println(dateAndTime.toUniversalString());
		
		System.out.print("+1 Hour:   ");
		for (int i = 0; i < 3600; i++)
			dateAndTime.tick();
		System.out.println(dateAndTime.toUniversalString());
		
		System.out.print("+1 Day:    ");
		for (int i = 0; i < 86400; i++)
			dateAndTime.tick();
		System.out.println(dateAndTime.toUniversalString());

		System.out.print("To Next Month: ");
		int month = dateAndTime.getMonth();
		while(month == dateAndTime.getMonth())
			dateAndTime.tick();
		System.out.println(dateAndTime.toUniversalString());
		
		System.out.print("To Next Year:  ");
		int year = dateAndTime.getYear();
		while(year == dateAndTime.getYear())
			dateAndTime.tick();
		System.out.println(dateAndTime.toUniversalString());
		
		System.out.println(dateAndTime.toString());
	}
}
