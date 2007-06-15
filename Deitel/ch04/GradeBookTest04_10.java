package ch04;

// Fig. 4.10: GradeBookTest.Java
// Cria o objeto da classe GradeBook e invoca seu método determineClassAverage

public class GradeBookTest04_10
{
   public static void main( String args[] )
   {
      // cria o objeto myGradeBookda classe GradeBook e
      // passa o nome de cursor para o construtor
      GradeBook04_09 myGradeBook = new GradeBook04_09( 
         "CS101 Introduction to Java Programming" );

      myGradeBook.displayMessage(); // exibe a mensagem welcome
      myGradeBook.determineClassAverage(); // encontra a média das notas
   } // fim de main

} // fim da classe GradeBookTest