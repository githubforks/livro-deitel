/*
 * Descreva de maneira geral como você removeria qualquer instrução continue
 * de um loop em um programa e a substituiria por alguma equivalente
 * estruturada. Utilize a técnica que você desenvolve aqui para remover a
 * instrução continue do programa na Figura 5.13.
 *
 * [Nota: Nesse caso utiliza count++ dentro do loop para "pular" um número e
 *  coloca-se o restante do código dentro de um bloco.]
 */

package ch05.Exer05_28;

public class Exer05_28
{
	public static void main( String args[] )
	{
		for ( int count = 1; count <= 10; count++ ) // faz o loop 10 vezes
		{
			if ( count != 5 ) // Faz verificação logo no início do loop.
							  // Se contagem for diferente do número que se quer pular
							  // executa-se o código.
			{
				System.out.printf( "%d ", count );
			}
		} // for final

		System.out.println( "\nUsed continue to skip printing 5" );
	} // fim de main
}
