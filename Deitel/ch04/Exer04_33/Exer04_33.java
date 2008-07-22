/*
 * Escreva um aplicativo que continue exibindo na janela de comando os múltiplos do inteiro
 * 2 - a saber, 2, 4, 8, 16, 32, 64 e assim por diante. Seu loop não deve terminar (isto é,
 * crie um loop infinito). O que acontece quando você executa esse programa ?
 */

package ch04.Exer04_33;

public class Exer04_33 {
	public static void main(String[] args) {
		int i=2;
		for(int j=0;j<35;j++) {
//		for(;;) {
//		while(true){
			System.out.println(i);
			i*=2;
		}
	}
}
