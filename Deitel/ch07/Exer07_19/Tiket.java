package ch07.Exer07_19;

public class Tiket
{
	public Tiket( int classNumber, int seat )
	{
		System.out.println( " _______________________" );
		System.out.println("( Boarding Tiket        )");
		
		if( classNumber == 1 )
			System.out.println( "( First Class. Seat: " + seat + "  )");
		else System.out.println( "( Economy Class. Seat: " + seat + ")");
		
		System.out.println( "(_______________________)" );
	}
}
