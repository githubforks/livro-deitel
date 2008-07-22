/*
 * Escreva um aplicativo que exiba os seguintes padrões separadamente, um embaixo do outro.
 * Utilize loops for para gerar os padrões. Todos os asteriscos (*) devem ser impressos por
 * uma única instrução na forma System.out.print('*'); o que faz com que os asteriacos
 * sejam impressos lado a lado. Uma instrução na forma System.out.println(); pode ser
 * utilizada para mover para a próxima linha. Uma instrução na forma System.out.print(' ');
 * pode ser utilizada para exibir um espaço para os últimos dois padões. Não devem haver
 * outras instruções de saída no programa [Dica: Os dois últimos padrões requerem que cada
 * linha inicie com um número adequado de espaços em branco.]
 */

package ch05.Exer05_15;

public class Exer05_15 {
	public static void main(String[] args) {
		//1 a 10
		for (int i = 1; i <= 10; i++) {
			//1 a i
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//10 a 1
		for (int i = 10; i >= 1; i--) {
			//1 a i
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//10 a 1
		for (int i = 10; i >= 1; i--) {
			//1 a 10-i
			for (int j = 1; j <= 10-i; j++) {
				System.out.print(" ");
			}
			//1 a i
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//1 a 10
		for (int i = 1; i <= 10; i++) {
			//1 a 10-i
			for (int j = 1; j <= 10-i; j++) {
				System.out.print(" ");
			}
			//1 a i
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
