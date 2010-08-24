/*
 * (Conjunto de inteiros) Crie a classe IntegerSet. Cada objeto IntegeSet pode
 * armazenar inteiros de 0 a 100. O conjunto é representado por um array de
 * booleans. O elemento do array a[i] é true se o inteiro i estiver no conjunto.
 * O elemento do array a[j] é false se o inteiro j não estiver no conjunto. O
 * construtor sem argumento inicializa o array Java como 'conjunto vazio' (isto
 * é, um conjunto cuja representação de array contém todos os valores false).
 *      Forneça os seguintes métodos: O método union cria um terceiro conjunto
 * que é a união teórica de dois conjuntos existentes (isto é, um elemento do
 * terceiro array do conjunto é configurado como true se esse elemento for true
 * em qualquer um dos conjuntos existentes ou em ambos; caso contrário, o
 * elemento do terceiro conjunto é configurado como falso). O método intesection
 * cria um terceiro conjunto que é a intersecção teórica de dois conjuntos
 * existentes (isto é, um elemento do array do terceiro conjunto é configurado
 * como false se esse elemento for false em qualquer um ou em ambos os conjuntos
 * existentes - caso contrário, o elemento do terceiro conjunto é configurado
 * como true). O método insertElement insere um novo inteiro k em um conjunto
 * (configurando a[k] como true). O método deleteElement exclui o inteiro m
 * (configurando a[m] como false). O método toSetString retorna uma string
 * contendo um conjunto como uma lista de números separados por espaços. Inclua
 * somente os elementos que estão presentes no conjunto. Utilize -- para
 * representar um conjunto vazio. O método isEqualTo determina se dois conjuntos
 * são iguais. Escreva um programa para testar a calsse IntegerSet. Instancie
 * diversos objetos IntegerSet. Teste se todos os seus métodos funcionam
 * adequadamente.
 */

package ch08.Exer08_15;

public class Exer08_15
{
	public static void main(String[] args)
	{
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		IntegerSet set3 = new IntegerSet();
		
		for (int i = 0; i < 100; i++)
			if( i%2 == 0 )
				set1.insertElement(i);
			else set2.insertElement(i);
		
		System.out.println("Set 1: " + set1.toSetString());
		System.out.println("Set 2: " + set2.toSetString());
		System.out.println("Empty Set 3: " + set3.toSetString());
		
		for (int i = 0; i < 90; i++) // Delete 0 to 90 elements from both vectors
		{
			set1.deleteElement(i);
			set2.deleteElement(i);
		}
		
		// Test union
		set3 = set1.union(set2);
		System.out.println();
		System.out.println("Set 1: " + set1.toSetString());
		System.out.println("Set 2: " + set2.toSetString());
		System.out.println("Union Set 3: " + set3.toSetString());
		
		for (int i = 91; i < 100; i++) // Empty vector
			set2.deleteElement(i);
		
		for (int i = 95; i < 100; i++) // Copy the final of the vector
			if(set1.getElement(i))
				set2.insertElement(i);
		
		// Test intersection
		set3 = set1.intesection(set2);
		System.out.println();
		System.out.println("Set 1: " + set1.toSetString());
		System.out.println("Set 2: " + set2.toSetString());
		System.out.println("Intersection Set 3: " + set3.toSetString());
	}
}
