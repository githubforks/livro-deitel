/*
 * Reescreva a figura 7.2 para que o tamanho do array seja especificado pelo
 * primeiro argumento da linha de comando, se nenhum argumento de linha de comando
 * for passado, utilize 10 como tamanho-padrão do array.
 */

package ch07.Exer07_15;

public class Exer07_15
{
	public static void main( String args[] )
	{
		int array[];

		if ( args.length < 1 )
			array = new int[ 10 ];
		else array = new int[ Integer.parseInt( args[0] ) ];

		System.out.printf( "%s%8s\n", "Index", "Value" );
		
		for ( int counter = 0; counter < array.length; counter++ )
			System.out.printf( "%5d%8d\n", counter, array[ counter ] );
	}
}
