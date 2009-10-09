package ch06.Exer06_37;

import java.util.Random;

public class Convarsation
{
	private int bankBalance;
	private Random randomNumbers = new Random();
	
	public Convarsation( int bankBalance )
	{
		this.bankBalance = bankBalance;
	}
	
	public void talk( int bankBalance )
	{
		int phrasis = randomNumbers.nextInt(2);
		
		if ( this.bankBalance > bankBalance )
			System.out.println( "Aw, c'mon, take a chance [Ah, vamos lá, dê uma chance para sua sorte!]");

		if ( this.bankBalance < bankBalance )
			if ( phrasis == 0 )
				System.out.println( "Oh, you're going for broke, huh? [Oh, parece que você vai quebrar, hein?]" );
			else System.out.println( "You're up big. No's the time to cash in your chips! [Você está montado na grana. Agora é hora de trocar essas fichas e embolsar o dinheiro!].");
	}
}
