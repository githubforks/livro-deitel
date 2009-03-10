/*
 * (Leis de Morgan) Neste capítulo, discutimos os operadores lógicos &&, &, ||,
 * |, ^ e !. As Leis de Morgan às vezes podem tornar mais conveniente para nós
 * expressarmos uma expressão lógica. Essas leis afirmam que a expressão
 * !(condição1 && condição2) é logicamente equivalente à expressão
 * (!condição1 && !condição2). Além disso, a expressão !(condição1 || condição2)
 * é logicamente equivalente à expressão (!condição1 || !condição2). Utilize as
 * Leis De Morgan para escrever expressões equivalentes a seguir, então escreva
 * um aplicativo para mostrar que tando a expressão original como a nova
 * expressão em cada caso produzem o mesmo valor:
 * 		a) !( x < 5  ) && !( y >= 7 )
 * 		b) !( a == b  ) || !( g != 5 )
 * 		c) !( ( x <= 8  ) && ( y > 4 ) )
 * 		d) !( ( i > 4  ) || ( j <= 6 ) )
 */

package ch05.Exer05_23;

public class Exer05_23
{
	public static void main(String[] args)
	{
		int x=0,a=0,b=0,g=0,y=0,i=0,j=0;
		boolean A,B,C;

//		a) !( x < 5  ) && !( y >= 7 )
		A=( x < 5  ); B=( y >= 7 );
		A=!A; B=!B;
		C=(A && B);
		System.out.print(C + " == ");
		A=( x < 5  ); B=( y >= 7 );
		C=(A || B);
		C=!C;
		System.out.println(C);

//		b) !( a == b  ) || !( g != 5 )
		A=( a == b ); B=( g != 5 );
		A=!A; B=!B;
		C=(A || B);
		System.out.print(C + " == ");
		A=( a == b ); B=( g != 5 );
		C=(A && B);
		C=!C;
		System.out.println(C);


//		c) !( ( x <= 8  ) && ( y > 4 ) )
		A=( x <= 8  ); B=( y > 4 );
		C=(A && B);
		C=!C;
		System.out.print(C + " == ");
		A=( x <= 8  ); B=( y > 4 );
		A=!A; B=!B;
		C=(A || B);
		System.out.println(C);

//		d) !( ( i > 4  ) || ( j <= 6 ) )
		A=( i > 4  ); B=( j <= 6 );
		C=(A || B);
		C=!C;
		System.out.print(C + " == ");
		A=( i > 4  ); B=( j <= 6 );
		A=!A;B=!B;
		C=(A && B);
		System.out.println(C);
	}
}
