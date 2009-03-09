/*
 * O que o seguinte programa imprime ?
 * 
 * [Nota: Em y = x * x calcula x^2 e depois imprime. Soma todos os x^2 na variável total
 * pra depois imprimir.]
 */

package ch04.Exer04_16;

public class Mystery
{
    public static void main (String args[])
    {
        int y;
        int x = 1;
        int total = 0;

        while ( x <= 10 )
        {
            y = x * x;
            System.out.println( y );
            total += y;
            ++x;
        } // Fim do while

        System.out.printf("O total é %d\n", total);
    } // fim do main
} // fim da classe Mystery
