/*
 * (Triplas de Pitágoras) Um triângulo retângulo pode ter lados cujos
 * comprimentos são todos inteiros. O conjunto de três valores inteiros para os
 * comprimentos dos lados de um triângulo é chamado de tripla de Pitágoras. Os
 * comprimentos dos três lados devem satisfazer a relação de que a soma dos
 * quadrados de dois dos lados é igual ao quadrado da hipotenusa. Escreva um
 * aplicativo para localizar todos os triplos de Pitágoras para side1, side2 e
 * hypotenuse, todos não maiores que 500. Utilize um loop for triplamente
 * aninhado que tenta todas as possibilidades. Esse é um método de computação de
 * 'força bruta'. Você aprenderá em cursos mais avançados de ciência da
 * computação que há muitos problemas interessantes para os quais não há
 * abordagem algorítmica conhecida, a não ser utilizar a pura força bruta.
 * 
 * 								      |\
 * 								      | \
 * 								      |  \
 * 								side1 |   \ hypotenuse
 * 								      |    \
 *								      |     \
 *								      |______\
 *								        side2
 */

package ch05.Exer05_21;

public class Exer05_21
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 500; i++)
			for (int j = 1; j <= 500; j++)
				for (int k = 1; k <= 500; k++)
				{
					System.out.printf("i = %s, j = %s, k = %s\n",i,j,k);
					// i como hypotenuse
					if(Math.pow(i,2)==(Math.pow(j,2)+Math.pow(k,2)))
						System.out.printf("side1 = %s, side2 = %s, hypotenuse = %s.\n %s == %s+%s\n",j,k,i,Math.pow(j,2),Math.pow(k,2),Math.pow(i,2));
					// j como hypotenuse
					if(Math.pow(j,2)==(Math.pow(i,2)+Math.pow(k,2)))
//						System.out.printf("side1 = %s, side2 = %s, hypotenuse = %s.\n",i,k,j);
						System.out.printf("side1 = %s, side2 = %s, hypotenuse = %s.\n %s == %s+%s\n",i,k,k,Math.pow(i,2),Math.pow(k,2),Math.pow(j,2));
					// k como hypotenuse
					if(Math.pow(k,2)==(Math.pow(i,2)+Math.pow(j,2)))
						System.out.printf("side1 = %s, side2 = %s, hypotenuse = %s.\n",i,j,k);
						System.out.printf("side1 = %s, side2 = %s, hypotenuse = %s.\n %s == %s+%s\n",i,j,k,Math.pow(i,2),Math.pow(j,2),Math.pow(k,2));
				}
	}
}
