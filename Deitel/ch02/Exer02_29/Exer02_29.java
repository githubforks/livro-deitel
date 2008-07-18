/*
 * 		Eis outra prévia do que virá futuramente. Neste capítulo, você aprendeu sobre
 * inteiros e o tipo int. O Java também pode representar letras maiúsculas, minúsculas
 * e uma variedade considerável de símbolos especiais. Cada caractere tem uma representação
 * correspondente de inteiro. O conjunto de caracteres que um computador utiliza e das
 * correspondentes representações na forma de inteiro desses caracteres é chamado de conjunto
 * de caracteres desse computador. Você pode indicar um valor de caractere em um programa
 * simplesmente incluindo esse caractere entre aspas simples, como em 'A'.
 * 		Você pode determinar o equivalente inteiro de um caractere precedendo esse caractere
 * com (int), como em
 * 			(int)'A'
 * Essa forma é chamada de operador de coerção. (Você aprenderá sobre os operadores de
 * coerlção no capítulo 4.) A instrução a seguir gera saída de um caractere e seu equivalente
 * inteiro:
 * 			System.out.printf(
 * 				"The caractere %c has the value %d\n", 'A', ((int)'A'));
 * Quando a instrução precedente executa, ela exibe o caractere A e o valor 65 (do chamado
 * conjunto de caracteres Unicode®) como parte da string. Observe que o especificador de
 * formaro %c é um marcador de lugar para um caractere (nesse caso, o caractere 'A').
 * 		Utizando instruções semelhantes àquela mostrada anteriormente neste exercício,
 * escreva um aplicativo que exibe os equivalentes inteiros de algumas letras maiúsculas,
 * letras minúsculas, dígitos e símbolos especiais. Exiba os equivalentes inteiros de
 * A B C a b c 0 1 2 $ * + / e o caractere em branco.
 */
package ch02.Exer02_29;

public class Exer02_29 {
	public static void main(String[] args) {
		System.out.printf(
				 "The character %c has the value %d\n",'A',((int)'A'));
		System.out.printf(
				 "The character %c has the value %d\n",'B',((int)'B'));
		System.out.printf(
				 "The character %c has the value %d\n",'C',((int)'C'));
		System.out.printf(
				 "The character %c has the value %d\n",'a',((int)'a'));
		System.out.printf(
				 "The character %c has the value %d\n",'b',((int)'b'));
		System.out.printf(
				 "The character %c has the value %d\n",'c',((int)'c'));
		System.out.printf(
				 "The character %c has the value %d\n",'0',((int)'0'));
		System.out.printf(
				 "The character %c has the value %d\n",'1',((int)'1'));
		System.out.printf(
				 "The character %c has the value %d\n",'2',((int)'2'));
		System.out.printf(
				 "The character %c has the value %d\n",'$',((int)'$'));
		System.out.printf(
				 "The character %c has the value %d\n",'*',((int)'*'));
		System.out.printf(
				 "The character %c has the value %d\n",'+',((int)'+'));
		System.out.printf(
				 "The character %c has the value %d\n",'/',((int)'/'));
	}
}
