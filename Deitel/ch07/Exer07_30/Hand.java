package ch07.Exer07_30;

public class Hand
{
	private Card[] card;
	
	public void getCards(DeckOfCards deck)
	{
		card = new Card[5];
		
		for (int i = 0; i < card.length; i++) {
			card[i] = deck.dealCard();	
		}
	}
		
	public void showHand()
	{
		for (int i = 0; i < card.length; i++)
			System.out.println(card[i].toString());
	}
	
	public void orderByFace()
	{
		boolean change = true;
		
		while(change)
		{
			change = false;
			for (int i = 1; i < card.length; i++)
				if( card[i].parseInt() < card[i-1].parseInt() )
				{
					Card aux = card[i];
					card[i] = card[i-1];
					card[i-1] = aux;
					change = true;
				}
		}
	}
	
	public boolean isSequence()
	{
		boolean b = false;
		orderByFace();
		if(card[0].parseInt() == card[1].parseInt()-1)
			if(card[1].parseInt() == card[2].parseInt()-1)
				if(card[2].parseInt() == card[3].parseInt()-1)
					if(card[3].parseInt() == card[4].parseInt()-1)
						b=true;
		return b;
	}
	
	public boolean isOnePair()
	{
		boolean b = false;
		int counter = 0;
		
		orderByFace();
		for (int i = 0; i < card.length-1; i++)
		{
			String face1 = card[i].getFace();
			String face2 = card[i+1].getFace();
			if(face1.equals(face2))
				counter++;
		}
		
		b = (counter == 1);
		return b;
	}
	
	public boolean isTwoPair()
	{
		boolean b = false;
		String face1, face2, face3, face4, face5;
		
		orderByFace();
		
		face1 = card[0].getFace();
		face2 = card[1].getFace();
		face3 = card[2].getFace();
		face4 = card[3].getFace();
		face5 = card[4].getFace();
		
		b = (face1.equals(face2) & face3.equals(face4) &
			!face2.equals(face3) & !face4.equals(face5));
		
		if(!b)
			b = (face1.equals(face2) & face4.equals(face5) &
				!face2.equals(face3) & !face3.equals(face4));
		
		if(!b)
			b = (face2.equals(face3) & face4.equals(face5) &
							!face1.equals(face2));
		
		return b;
	}
	
	public boolean isTriple()
	{
		boolean b = false;
		String face1, face2, face3, face4, face5;
		
		orderByFace();
		
		face1 = card[0].getFace();
		face2 = card[1].getFace();
		face3 = card[2].getFace();
		face4 = card[3].getFace();
		face5 = card[4].getFace();
		
		b = (face1.equals(face2) & face2.equals(face3) &
			!face3.equals(face4) & !face4.equals(face5));
		
		if(!b)
			b = (!face1.equals(face2) &
				  face2.equals(face3) & face3.equals(face4) &
				 !face4.equals(face5));
		
		if(!b)
			b = (!face1.equals(face2) & !face2.equals(face3) &
				  face3.equals(face4) & face4.equals(face5));
		return b;
	}
	
	public boolean isStraight()
	{
		boolean b = false;
		
		b = (isSequence() & !isFlush());
		
		return b;
	}
	
	public boolean isFlush()
	{
		boolean b = false, flush = false;
		
		if(card[0].getSuit().equals(card[1].getSuit()))
			if(card[1].getSuit().equals(card[2].getSuit()))
				if(card[2].getSuit().equals(card[3].getSuit()))
					if(card[3].getSuit().equals(card[4].getSuit()))
						flush=true;
		return b = (flush & !isSequence());
	}
	
	public boolean isFullHouse()
	{
		boolean b = false;
		String face1, face2, face3, face4, face5;
		
		orderByFace();
		
		face1 = card[0].getFace();
		face2 = card[1].getFace();
		face3 = card[2].getFace();
		face4 = card[3].getFace();
		face5 = card[4].getFace();
		
		b = (face1.equals(face2) & face2.equals(face3) &
			!face3.equals(face4) & face4.equals(face5));
		
		if(!b)
			b = (face1.equals(face2) & !face2.equals(face3) &
				face3.equals(face4) & face4.equals(face5));
		
		return b;
	}
	
	public boolean isFour()
	{
		boolean b = false;
		String face1, face2, face3, face4, face5;
		
		orderByFace();
		
		face1 = card[0].getFace();
		face2 = card[1].getFace();
		face3 = card[2].getFace();
		face4 = card[3].getFace();
		face5 = card[4].getFace();
		
		b = (face1.equals(face2) & face2.equals(face3) & face3.equals(face4) &
								  !face4.equals(face5));
		
		if(!b)
			b = (!face1.equals(face2) & 
				  face2.equals(face3) & face3.equals(face4) & face4.equals(face5));
		
		return b;
	}
	
	public boolean isStraightFlush()
	{
		boolean b = false, flush = false;
		
		if(card[0].getSuit().equals(card[1].getSuit()))
			if(card[1].getSuit().equals(card[2].getSuit()))
				if(card[2].getSuit().equals(card[3].getSuit()))
					if(card[3].getSuit().equals(card[4].getSuit()))
						flush=true;
		
		return b = (flush & isSequence() & !isRoyalStraightFlush());
	}
	
	public boolean isRoyalStraightFlush()
	{
		boolean b = false, isRoyalSequense = false, flush = false;
		
		orderByFace();
		
		if(card[0].getFace().equals("Nine"))
			if(card[1].getFace().equals("Ten"))
				if(card[2].getFace().equals("Jack"))
					if(card[3].getFace().equals("Queen"))
						if(card[4].getFace().equals("King"))
							isRoyalSequense=true;
		
		if(card[0].getSuit().equals(card[1].getSuit()))
			if(card[1].getSuit().equals(card[2].getSuit()))
				if(card[2].getSuit().equals(card[3].getSuit()))
					if(card[3].getSuit().equals(card[4].getSuit()))
						flush=true;
		
		b = flush & isRoyalSequense;

		return b;
	}
}
