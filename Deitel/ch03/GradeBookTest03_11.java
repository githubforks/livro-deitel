package ch03;

//Fig. 3.11: GradeBookTest.Java
//construtor GradeBook utilizado para especificar o nome do curso na
//hora em que cada objeto GradeBook é criado.

public class GradeBookTest03_11
{
// método main inicia a execução do programa
public static void main( String args[] )
{ 
   // cria objeto GradeBook
   GradeBook03_10 gradeBook1 = new GradeBook03_10(         
      "CS101 Introduction to Java Programming" );
   GradeBook03_10 gradeBook2 = new GradeBook03_10(         
      "CS102 Data Structures in Java" );         

   // exibe valor inicial de courseName para cada GradeBook
   System.out.printf( "gradeBook1 course name is: %s\n",
      gradeBook1.getCourseName() );
   System.out.printf( "gradeBook2 course name is: %s\n",
      gradeBook2.getCourseName() );
} // fim de main

} // fim da classe GradeBookTest