/*
 * Escreva um aplicatovo que utilize somente as instruções de saída
 *		System.out.print("*");
 *		System.out.print(" ");
 *		System.out.println();
 * para seguir o padrão de tabuleiro de damas a seguir. Observe que uma chamada
 * System.out.println sem argumentos faz com que o programa gere saída de um único caractere
 * de nova linha. [Dica: As instruções de repetição são requeridas.]
 */

package ch04.Exer04_32;

public class Exer04_32 {
	public static void main(String[] args) {

		for (int i = 0; i < 8; i++) {
			if((i%2)==0)
				System.out.print(" ");
			for (int j = 0; j < 8; j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();	
		}
	}
}
