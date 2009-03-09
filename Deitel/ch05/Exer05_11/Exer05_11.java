/*
 * Escreva um aplicativo que localiza o menor de vários inteiros. Assuma que o
 * primeiro valor lido especifica o número de valores a serem inseridos pelo
 * usuário.
 */
package ch05.Exer05_11;

import java.util.Scanner;

public class Exer05_11
{
    public static void main (String args[])
    {
        int menor, atual, contador;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantidade de números: ");
        contador = input.nextInt();

        System.out.print("Número 1: ");
        menor = input.nextInt();

        for (int i = 2; i <= contador; i++)
        {
            System.out.printf("Número %d: ", i);
            atual = input.nextInt();

            if (atual < menor)
                menor = atual;
        }

        System.out.printf("Menor = %d\n", menor);
    }
}
