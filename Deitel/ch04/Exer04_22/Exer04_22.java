/*
 * Escreva um aplicativo Java que utiliza um loop para imprimir a seguinte tabela de valores:
 * 
 * 							N  10*N  100*N  1000*N
 * 							1  10    100    1000
 *  						2  20    200    2000
 *   						3  30    300    3000
 *    						4  40    400    4000
 *     						5  50    500    5000
 */

package ch04.Exer04_22;

public class Exer04_22 {
	public static void main(String[] args) {
		System.out.println("N  10*N  100*N  1000*N");
		
		for (int i = 1; i < 6; i++) {
			System.out.printf("%d  %d    %d    %d\n", i, i*10, i*100, i*1000);
		}
	}
}
