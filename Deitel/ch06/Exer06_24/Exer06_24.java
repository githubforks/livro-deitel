/*
 * Dizemos que um número inteiro é um número perfeito se a soma de seus fatores,
 * incluindo 1 (mas não o próprio número), é igual ao número. Por exemplo, 6 é
 * um número perfeito porque 6 = 1 + 2 + 3. Escreva um método perfect que
 * determina se parâmetro number é um número perfeito. Utilize esse método em um
 * applet que determina e exibe todos os números perfeitos entre 1 e 1.000.
 * Exiba os fatores de cada número perfeito confirmando que o número é de fato
 * perfeito. Desafie o poder de computação de seu computador testando números
 * bem maiores que 1.000. Exiba os resultados.
 */

package ch06.Exer06_24;

public class Exer06_24
{
	public boolean perfect( int arg0 )
	{
		int acumula = 0;
		for (int i = 1; i <= arg0/2; i++)
			if ( arg0%i == 0 )
				acumula += i;
		return ( acumula == arg0 ? true : false);
	}

	public static void main( String args[] )
	{
		Exer06_24 exer = new Exer06_24();
		
		for( int i = 1; i <= 10000; i++ )
			if ( exer.perfect( i ) == true )
				System.out.println( i );
	}
}
