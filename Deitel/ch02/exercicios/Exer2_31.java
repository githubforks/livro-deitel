/*
 * Utilizando apenas as técnicas de programação que você aprendeu neste capítulo, escreva um
 * aplicativo que calcula os quadrados e os cubos dos números de 0 a 10 e imprima os valores
 * resultantes no formato de tabela como asseguir
 * número quadrado cubo
 * 0      0        0
 * 1      1        1
 * 2      4        8
 * 3      9        27
 * 4      16       64
 * 5      25       125
 * 6      36       216
 * 7      49       343
 * 8      64       512
 * 9      81       729
 * 10     100      1000
 */

package ch02.exercicios;

public class Exer2_31 {
	public static void main(String[] args) {
		System.out.println("número quadrado cubo");
		System.out.printf( "%d      %s      %s\n",0,Math.pow(0,2),Math.pow(0,3));
		System.out.printf( "%d      %s      %s\n",1,Math.pow(1,2),Math.pow(1,3));
		System.out.printf( "%d      %s      %s\n",2,Math.pow(2,2),Math.pow(2,3));
		System.out.printf( "%d      %s      %s\n",3,Math.pow(3,2),Math.pow(3,3));
		System.out.printf( "%d      %s     %s\n",4,Math.pow(4,2),Math.pow(4,3));
		System.out.printf( "%d      %s     %s\n",5,Math.pow(5,2),Math.pow(5,3));
		System.out.printf( "%d      %s     %s\n",6,Math.pow(6,2),Math.pow(6,3));
		System.out.printf( "%d      %s     %s\n",7,Math.pow(7,2),Math.pow(7,3));
		System.out.printf( "%d      %s     %s\n",8,Math.pow(8,2),Math.pow(8,3));
		System.out.printf( "%d      %s     %s\n",9,Math.pow(9,2),Math.pow(9,3));
		System.out.printf( "%d     %s    %s\n",10,Math.pow(10,2),Math.pow(10,3));
	}
}
