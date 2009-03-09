/*
 * O que o seguinte programa faz ?
 * 
 * [Nota: No for aninhado imprime 5 arrobas e no for mais externo imprime uma nova linha.]
 */

package ch05.Exer05_10;

public class Printing
{
    public static void main ( String args[] )
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 5; j++)
                System.out.print( '@' );

            System.out.println();
        } // fim do for externo
    } // fim do main
} // fim da classe Printing
