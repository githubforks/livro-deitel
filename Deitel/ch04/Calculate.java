package ch04;

//Calcula a soma dos inteiros de 1 a 10
public class Calculate 
{
   public static void main( String args[] )
   {
      int sum;
      int x;

      x = 1;   // inicializa x como 1 para contagem
      sum = 0; // inicializa a soma como 0 para totalização

      while ( x <= 10 ) // enquanto x é menor ou igual a 10
      {
         sum += x; // adiciona x a soma
         ++x; // incrementa x 
      } // fim do while

      System.out.printf( "The sum is: %d\n", sum );
   } // fim de main

} // fim da classe Calculate