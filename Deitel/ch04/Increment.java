package ch04;

//Fig. 4.16: Increment.java
//operadores de pré-incremento e de pós-incremento.

public class Increment 
{
public static void main( String args[] )
{
   int c;

   // demonstra o operador de pós-incremento
   c = 5; // atribui 5 à variável c
   System.out.println( c );   // imprime 5
   System.out.println( c++ ); // imprime 5 então pós-incremente
   System.out.println( c );   // imprime 6

   System.out.println(); // pula uma linha

   // demonstra o operador de pré-incremento
   c = 5; // atribui 5 à variável c
   System.out.println( c );   // imprime 5
   System.out.println( ++c ); // pré-incrementa e então imprime 6
   System.out.println( c );   // imprime 6

} // fim de main

} // fim da classe Increment