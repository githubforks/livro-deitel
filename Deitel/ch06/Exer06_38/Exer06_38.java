/*
 * Escreva um aplicativo que exibe uma tabela de equivalentes binários, octal e
 * hexadecimal dos números decimais no intervalo 1 a 256. Se você não estiver
 * familiarizado com esses sistemas numéricos, leia o apêndice E primeiro.
 */

package ch06.Exer06_38;

public class Exer06_38
{
	public static void main(String[] args)
	{
		Decimal decimal = new Decimal();
		String hex,bin,oct;

		System.out.println("Decimal\tBinário\t\tOctal\tHexadecimal");

		for( int i = 1; i <= 127; i++)
		{
			bin = decimal.toBinario( i );
			oct = decimal.toOctal( i );
			hex = decimal.toHexadecimal( i );
			
			System.out.println( i + "\t" + bin + "\t\t" + oct + "\t" + hex);
		}
		
		// 2a. parte para ajustar a tabulação
		for( int i = 128; i <= 256; i++)
		{
			bin = decimal.toBinario( i );
			oct = decimal.toOctal( i );
			hex = decimal.toHexadecimal( i );
			
			System.out.println( i + "\t" + bin + "\t" + oct + "\t" + hex);
		}
	}
}
