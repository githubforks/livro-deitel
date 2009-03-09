/*
 * O que o seguinte programa imprime ?
 * 
 * [Nota: Se row for ímpar, imprime uma série de dez sinais de menor,
 * se for par imprime dez sinais de maior.]
 */

package ch04.Exer04_26;

public class Mystery3
{
	public static void main (String args[])
	{
		int row = 10;
		int column = 0;

		while ( row >= 1 )
		{
			column = 1;
			
			while ( column <= 10)
			{
				System.out.print( row % 2 == 1 ? "<" : ">");
				++column;
            } // fim do while
            
            --row;
            System.out.println();
        } // Fim do while
    } // fim do main
} // fim da classe Mystery
