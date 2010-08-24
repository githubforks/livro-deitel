/*
 * (Embaralhamento e distribuição de cartas) Utilize os métodos desenvolvidos
 * no Exercício 7.30 para escrever um aplicativo que distribui duas mãos de
 * pôquer de cinco cartas, avalia cada mão e determina qual é a melhor mão.
 */

package ch07.Exer07_31;

import ch07.Exer07_30.DeckOfCards;
import ch07.Exer07_30.Hand;

public class Exer07_31
{
	public static void main(String[] args)
	{
		Hand hand1 = new Hand();
		Hand hand2 = new Hand();
		DeckOfCards deck = new DeckOfCards();
		int n1, n2;
		
		deck.shuffle();
		hand1.getCards(deck);
		hand2.getCards(deck);
		
		if(hand1.isRoyalStraightFlush())
		{n1 = 9; System.out.println("Hand1: Royal Straight Flush");}
		else if (hand1.isStraightFlush())
		{n1 = 8; System.out.println("Hand1: Straight Flush");}
		else if (hand1.isFour())
		{n1 = 7; System.out.println("Hand1: Four");}
		else if (hand1.isFullHouse())
		{n1 = 6; System.out.println("Hand1: Full House");}
		else if (hand1.isFlush())
		{n1 = 5; System.out.println("Hand1: Flush");}
		else if (hand1.isStraight())
		{n1 = 4; System.out.println("Hand1: Straight");}
		else if (hand1.isTriple())
		{n1 = 3; System.out.println("Hand1: Triple");}
		else if (hand1.isTwoPair())
		{n1 = 2; System.out.println("Hand1: Two Pair");}
		else if (hand1.isOnePair())
		{n1 = 1; System.out.println("Hand1: One Pair");}
		else
		{n1 = 0; System.out.println("Hand1: High Card");}
		
		if(hand2.isRoyalStraightFlush())
		{n2 = 9; System.out.println("Hand2: Royal Straight Flush");}
		else if (hand2.isStraightFlush())
		{n2 = 8; System.out.println("Hand2: Straight Flush");}
		else if (hand2.isFour())
		{n2 = 7; System.out.println("Hand2: Four");}
		else if (hand2.isFullHouse())
		{n2 = 6; System.out.println("Hand2: Full House");}
		else if (hand2.isFlush())
		{n2 = 5; System.out.println("Hand2: Flush");}
		else if (hand2.isStraight())
		{n2 = 4; System.out.println("Hand2: Straight");}
		else if (hand1.isTriple())
		{n2 = 3; System.out.println("Hand2: Triple");}
		else if (hand2.isTwoPair())
		{n2 = 2; System.out.println("Hand2: Two Pair");}
		else if (hand2.isOnePair())
		{n2 = 1; System.out.println("Hand2: One Pair");}
		else
		{n2 = 0; System.out.println("Hand2: High Card");}
		
		if(n1 > n2)
			System.out.println("Hand1 is better.");
		else if(n1 < n2)
			System.out.println("Hand2 is better.");
		else System.out.println("The both hands have the same weight.");
	}
}
