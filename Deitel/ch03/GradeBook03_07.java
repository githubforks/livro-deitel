package ch03;

//Fig. 3.7: GradeBook.java
//classe GradeBook que contém uma variável de instância courseName
//e métodos para configurar e obter seu valor.

public class GradeBook03_07
{
private String courseName; // nome do curso para esse GradeBook

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