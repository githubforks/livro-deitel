package ch03;

//Fig. 3.8: GradeBookTest.Java
//Cria e manipula um objeto GradeBook.
import java.util.Scanner; // programa utiliza Scanner

public class GradeBookTest03_08
{
// método main inicia a execução de programa
public static void main( String args[] )
{ 
   // cria Scanner para obter entrada a partir da janela de comando
   Scanner input = new Scanner( System.in );

   // cria um objeto GradeBook e o atribui a myGradeBook
   GradeBook03_07 myGradeBook = new GradeBook03_07();

   // exibe valor inicial de courseName
   System.out.printf( "Initial course name is: %s\n\n",
      myGradeBook.getCourseName() );

   // solicita e lê o nome do curso
   System.out.println( "Please enter the course name:" );
   String theName = input.nextLine(); // lê uma linha de texto
   myGradeBook.setCourseName( theName ); // configura o nome do curso
   System.out.println(); // gera saída de uma linha em branco

   // exibe mensagem de boas-vindas depois de especificar nome do curso
   myGradeBook.displayMessage();
} // fim de main

} // fim da classe GradeBookTest