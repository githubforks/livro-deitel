/*
 * Escreva um aplicativo que calcule o produto dos inteiros ímpares de 1 a 15.
 */

package ch05.Exer05_12;

public class Exer05_12 {
    public static void main ( String args[] )
    {
        int total = 1;

        for (int i = 3; i < 10; i+=2)
        {
            total *= i;
        }

        System.out.printf("Total = %d\n",total);

    }
}
