/*

 * (Série de Fibonacci) A série de Fibonacci
 *      0, 1, 1, 2, 3, 5, 8, 13, 21,...
 * inicia com os termos 0 e 1 e tem a propriedade de que cada termo sucessivo é
 * a soma dos dois termos precedentes.
 *
 *      a) Escreva o método fibonacci( n ) que calcula a n-ésimo termo da série
 * de Fibonacci. Incorpore esse método a um aplicativo que permita ao usuário
 * inserir o valor de n.
 *
 *      b) Determine o maior número de Fibonacci que pode ser exibido em seu
 * sistema.
 *
 *      c) Modifique o aplicativo que você escreveu na parte (a) para utilizar
 * double em vez de int para calcular e retornar números de Fibonacci e utilizar
 * esse aplicativo midificado para repetir a parte (b).
 */

package ch07.Exer07_29;

public class Exer07_29
{
	public int fibonacci( int i )
	{
		int n1 = 0, n2 = 1, n3 = 0;
		
		if( i <= 1)
			return i;
		else
		{
			for (int counter = 2; counter <= i; counter++)
			{
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			}
			return n2;
		}
	}
	public double fibonacci( double d )
	{
		double n1 = 0, n2 = 1, n3 = 0;
		
		if( d <= 0)
			return d;
		else
		{
			for (double counter = 0; counter <= d; counter++)
			{
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			}
			return n2;
		}
	}
	public static void main(String[] args)
	{
		Exer07_29 exer = new Exer07_29();
		
		for (int i = 0; i < 48; i++)
		{
			System.out.println(exer.fibonacci((int)i));
		}
		
		for (int i = 0; i < 1476; i++)
		{
			System.out.println(exer.fibonacci((double)i));
		}
	}
}
