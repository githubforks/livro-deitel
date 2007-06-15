package ch03;
// Fig. 3.5: GradeBookTest.Java
// Cria objeto GradeBook e passa uma String para
// seu método displayMessage.
import java.util.Scanner; // programa utiliza Scanner

public class GradeBookTest03_05
{
   // método main inicia a execução de programa
   public static void main( String args[] )
   { 
      // cria Scanner para obter entrada a partir da janela de comando
      Scanner input = new Scanner( System.in );

      // cria um objeto GradeBook e o atribui a myGradeBook
      GradeBook03_04 myGradeBook = new GradeBook03_04(); 

      // prompt para entrada do nome do curso
      System.out.println( "Please enter the course name:" );
      String courseName = input.nextLine(); // lê uma linha de texto
      System.out.println(); // gera saída de uma linha em branco

      // chama método displayMessage de myGradeBook
      // e passa courseName como um argumento
      myGradeBook.displayMessage( courseName );
   } // fim de main

} // fim da classe GradeBookTest