package ch07.Exer07_12;

import java.util.Scanner;

public class Aux
{
	private Scanner input;
	private boolean b;
	private int contador;
	
	
	// Construtor
	public Aux()
	{
		input = new Scanner( System.in );
	}
	
	public int leitor()
	{
		int num = 0;
		while( num < 10 || num > 100 )
		{
			System.out.print( "Inserir número entre 10 e 100: " );
			num = input.nextInt();
			
			if ( num < 10 || num > 100 )
				System.out.println( "Erro: Número deve ser entre 10 e 100." );
		}
		return num;
	}
	
	public boolean insereVetor( int num, int[] vetor)
	{
		b = false;
		contador = 0;
		while( b == false  && contador < vetor.length )
		{
			if( vetor[contador] == 0 )
			{
				vetor[contador] = num;
				b = true;
			}
			else if ( vetor[contador] == num )
			{
				b = false;
				contador = vetor.length;
			}
			else contador++;
		}
		return b;
	}
}
