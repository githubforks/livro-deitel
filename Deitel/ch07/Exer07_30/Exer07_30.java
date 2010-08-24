/*
 * (Embaralhamento e distribuição) Modifique o aplicativo na Figura 7.11 para
 * distribuir uma mão de cinco cartas de pôker. Então modifique a classe
 * deckOfCards da Figura 7.10 para incluir métodos que determinam se um mão contém
 *
 *      a) um par
 *      b) dois pares
 *      c) uma trinca (por exemplo, três valetes)
 *      d) uma quadra (por exemplo, quatro ases)
 *      e) um flush (isto é, cinco cartas do mesmo nipe)
 *      f) um straight (isto é, cinco cartas de valores consecutivos)
 *      g) uma full house (isto é, duas cartas de um valor e três cartas de outro valor)
 *
 * [Dica: Adicione os métodos getFace e getSuit à classe card da Figura 7.9]
 */

package ch07.Exer07_30;

public class Exer07_30
{
	public static void main(String[] args)
	{
		//min = 62, max = 3579307;
		Hand hand = new Hand();
		DeckOfCards deck = new DeckOfCards();
		
		deck.shuffle();
		hand.getCards(deck);
		
		if(hand.isRoyalStraightFlush()){System.out.println("Royal Straight Flush");}
		else if (hand.isStraightFlush()){System.out.println("Straight Flush");}
		else if (hand.isFour()){System.out.println("Four");}
		else if (hand.isFullHouse()){System.out.println("Full House");}
		else if (hand.isFlush()){System.out.println("Flush");}
		else if (hand.isStraight()){System.out.println("Straight");}
		else if (hand.isTriple()){System.out.println("Triple");}
		else if (hand.isTwoPair()){System.out.println("Two Pair");}
		else if (hand.isOnePair()){System.out.println("One Pair");}
		else System.out.println("High Card");;

	}
}
