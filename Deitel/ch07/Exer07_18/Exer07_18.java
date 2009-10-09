/*
 * (Jogo de dados) Escreva um aplicativo que executa 1000 jogos de dados (Figura
 * 6.9) e responda às perguntas:
 *
 *      a) Quantos jogos são ganhos na primeira rolagem, segunda rolagem, ...,
 *      vigésima rolagem e depois da vigésima rolagem ?
 *
 *      b) Quantos jogos são perdidos na primeira rolagem, segunda rolagem, ...,
 *      vigésima rolagem e depois da vigésima rolagem ?
 *
 *      c) Quais são as chances de ganhar no jogo de dados ? [Nota: Você deve
 *      descobrir que o craps é um dos jogos mais comuns de cassino. O que você
 *      supõe que isso significa?]
 *
 *      d) Qual é o comprimento médio de um jogo de dados ?
 *
 *      e) As chances de ganhar aumentam com o comprimento do jogo ?
 */

package ch07.Exer07_18;

public class Exer07_18
{
	public static void main(String[] args)
	{
		int wins = 0, looses = 0;
		Craps craps = new Craps();
		
		for (int i = 0; i < 1000; i++)
			if ( craps.play() )
				wins++;
			else looses++;
		
		System.out.println("Vitórias: " + wins);
		System.out.println("Derrotas: " + looses);
	}
}
