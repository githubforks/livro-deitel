/*
 * O que o seguinte programa imprime ?
 * 
 * [Nota: count % 2 == 1 testa se count é ímpar, se sim imprime 4 asteriscos, se não
 * imprime oito sinais de soma. ]
 */

package ch04.Exer04_25;

public class Mystery2
{
    public static void main (String args[])
    {
        int count = 1;

        while ( count <= 10 )
        {
            System.out.println( count % 2 == 1 ? "****" : "++++++++" );
            ++count;
        } // Fim do while
    } // fim do main
} // fim da classe Mystery
