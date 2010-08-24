/*
 * (Aprimorando a classe Time2) Modifique a classe Time2 da Figura 8.5 para
 * incluir um método tick que incrementa a data/hora armazenada em um objeto
 * Time2 em um segundo. Forneça o método incrementMinute para incrementar os
 * minutos e o método incrementHour para incrementar a hora. O objeto Time2
 * sempre deve permanecer em um estado consistente. Escreva um programa que
 * testa o método tick, o método incrementMinute e o método incrementHour para
 * assegurar que eles funcionem corretamente. Certifique-se de testar os
 * seguintes casos:
 *
 *      a) incrementar para o próximo minuto,
 *      b) incrementar para a próxima hora e
 *      c) incrementar para o próximo dia (isto é 11:59:59 PM para 12:00:00 AM
 */

package ch08.Exer08_07;

public class Exer08_07
{
	public static void main(String[] args)
	{
		Time2 time = new Time2();
		
		for (int i = 0; i < 86401; i++)
		{
			System.out.println(time.toUniversalString());
			time.tick();
		}
	}
}
