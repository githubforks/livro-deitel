/*
 * (Números complexos) Crie uma classe chamada Complex para realizar aritmética
 * com números complexos. Os números complexos tem a forma
 *          parteReal + parteImaginária * i
 * onde i é
 *          √-1
 * Escreva um programa para testar sua classe. Utilize variáveis de ponto
 * flutuante para representar os dados private da classe. Forneça um construtor
 * que permita que um objeto dessa classe seja inicializado quando ele for
 * declarado. Forneça um construtor sem argumento com valores-padrão caso
 * nenhum inicializador seja fornecido. Forneça métodos public que realizam as
 * seguintes operações:
 *      a) Somar dois números Complex: as partes reais somadas de um lado e as
 * partes imaginárias são somadas de outro.
 *      b) Subtrair dois números Complex: A parte real do operando direito é
 * subtraída da parte real do operando esquerdo e a parte imaginária do operando
 * direito é subtraída da parte imaginária do operando esquerdo.
 *      c) Imprimir números Complex na forma (a, b), onde a é a parte real e b
 * é a parte imaginária.
 */

package ch08.Exer08_12;

public class Exer08_12
{
	public static void main(String[] args)
	{
		Complex complex = new Complex();
		
		complex.imprimir1();
		System.out.println();
		complex.imprimir2();
		
		complex = new Complex(3, 2);
		
		System.out.println("\n-----");
		complex.imprimir1();
		System.out.println();
		complex.imprimir2();
		
		complex.somar(0, 2);
		complex.subtrair(1, 1);
		
		System.out.println("\n-----");
		complex.imprimir1();
		System.out.println();
		complex.imprimir2();
	}
}
