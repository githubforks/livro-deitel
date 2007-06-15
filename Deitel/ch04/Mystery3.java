package ch04;

public class Mystery3 
{
   public static void main( String args[] )
   {
      int row = 10;
      int column;

      while ( row >= 1 ) 
      {
         column = 1;

         while ( column <= 10 ) 
         {
            System.out.print( row % 2 == 1 ? "<" : ">" );
            ++column;
         } // fim do while

         --row;
         System.out.println();
      } // fim do while
   } // fim de main

} // fim da classe Mystery3