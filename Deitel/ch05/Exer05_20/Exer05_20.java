/*
 * Calcule o valor de π das series infinitas
 *      π = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 ...
 * Imprima uma tabela que mostre o valor aproximado de π computando um termo
 * dessa série, por dois termos, por três termos e assim por diante. Quantos
 * termos dessa série você tem de utilizar antes de primeiro obter 3,14?
 * 3,141? 3,1415? 3,14159?
 */

package ch05.Exer05_20;

public class Exer05_20
{
	public static void main ( String args[] )
	{
		double contador = 0;
		int um = 1;
		
		for (int i = 1; i <= 100000; i += 2)
		{
			contador+= (4.0/i)*um;
			um *= -1;
			System.out.println( contador );
		}
	}
}
