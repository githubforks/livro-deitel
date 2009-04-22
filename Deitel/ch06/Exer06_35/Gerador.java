package ch06.Exer06_35;

import java.util.Random;
import java.util.Scanner;

public class Gerador {
	public int geraNumero( int arg0 )
	{
		Random r = new Random();
		int min = 1, max = 10;

		for ( int i = 1; i < arg0; i++) // Se arg0 == 1, deixa min e max do jeito que estão
		{
			min *= 10;
			max *= 10;
		}

		if( min > 1 )
			return ( r.nextInt( max - min ) + min );
		else return r.nextInt( 10 );
	}

	public boolean opcaoCinco( int n1, int n2 )
	{
		Scanner input = new Scanner( System.in );
		Random r = new Random();
		int result = 0, answer = 0;
		
		switch ( r.nextInt( 4 ) + 1 ){
		case 1:
			result = n1 + n2;
			System.out.printf( "How much is %d more %d?", n1, n2 );
			answer = input.nextInt();
			break;
		case 2:
			result = n1 - n2;
			System.out.printf( "How much is %d less %d?", n1, n2 );
			answer = input.nextInt();
			break;
		case 3:
			result = n1 * n2;
			System.out.printf( "How much is %d times %d?", n1, n2 );
			answer = input.nextInt();
			break;
		case 4:
			result = n1 / n2;
			System.out.printf( "How much is %d / %d?", n1, n2 );
			answer = input.nextInt();
			break;
		}
		
		if( result == answer )
			return true;
		else return false;
	}
}
