/*
 * Reescreva a Figura 8.14 para utilizar uma declaração import separada para
 * cada membro static da classe Math que é utilizado no exemplo.
 */

package ch08.Exer08_10;

import static java.lang.Math.sqrt;
import static java.lang.Math.ceil;
import static java.lang.Math.log;
import static java.lang.Math.E;
import static java.lang.Math.cos;

public class Exer08_10
{
	   public static void main( String args[] ) 
	   {
	      System.out.printf( "sqrt( 900.0 ) = %.1f\n", sqrt( 900.0 ));
	      System.out.printf( "ceil( -9.8 ) = %.1f\n", ceil( -9.8 ));
	      System.out.printf( "log( E ) = %.1f\n", log( E ));
	      System.out.printf( "cos( 0.0 ) = %.1f\n", cos( 0.0 ));
	   } // fim de main
}
