package ch03;

//Fig. 3.10: GradeBook.java
//Classe GradeBook com um construtor para inicializar o nome de um curso.

public class GradeBook03_10
{
private String courseName; // nome do curso para esse GradeBook

// construtor inicializa courseName com String fornecido como argumento
public GradeBook03_10( String name )                                       
{                                                                     
   courseName = name; // inicializa courseName
} // termina construtor

// método para configurar o nome do curso
public void setCourseName( String name )
{
   courseName = name; // armazena o nome do curso
} // termina o método setCourseName

// método para recuperar o nome do curso
public String getCourseName()
{
   return courseName;
} // termina o método getCourseName

// exibe uma mensagem de boas-vindas para o usuário GradeBook
public void displayMessage()
{
   // essa instrução chama getCourseName para obter o
   // nome do curso que esse GradeBook representa
   System.out.printf( "Welcome to the grade book for\n%s!\n", 
      getCourseName() );
} // termina o método displayMessage

} // fim da classe GradeBook