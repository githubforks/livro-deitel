package ch04;

//Fig. 4.6: GradeBook.java
//Classe GradeBook que resolve o problema da média da classe utilizando
//repetição controlada por contador.
import java.util.Scanner; // programa utiliza a classe Scanner

public class GradeBook04_06 
{
private String courseName; // nome do curso que essa GradeBook representa

// construtor inicializa courseName
public GradeBook04_06( String name )
{
   courseName = name; // inicializa courseName
} // fim do construtor

// método para configurar o nome do curso
public void setCourseName( String name )
{
   courseName = name; // armazena o nome do curso
} // fim do método setCourseName

// método para recuperar o nome do curso
public String getCourseName()
{
   return courseName;
} // fim do método getCourseName

// exibe uma mensagem de boas-vindas para o usuário GradeBook
public void displayMessage()
{
   // getCourseName obtém o nome do curso
   System.out.printf( "Welcome to the grade book for\n%s!\n\n", 
      getCourseName() );
} // fim do método displayMessage

// determina a média da classe com base em 10 notas inseridas pelo usuário
public void determineClassAverage()
{
   // cria Scanner para obter entrada a partir da janela de comando
   Scanner input = new Scanner( System.in );

   int total; // soma das notas inseridas pelo usuário
   int gradeCounter; // número da nota a ser inserida a seguir
   int grade; // valor da nota inserida pelo usuário
   int average; // média das notas

   // fase de inicialização
   total = 0; // inicializa o total
   gradeCounter = 1; // inicializa o contador de loops

   // fase de processamento
   while ( gradeCounter <= 10 ) // faz o loop 10 vezes
   {
      System.out.print( "Enter grade: " ); // prompt
      grade = input.nextInt(); // insere a próxima nota
      total = total + grade; // adiciona grade a total
      gradeCounter = gradeCounter + 1; // incrementa o contador por 1
   } // fim do while

   // fase de término
   average = total / 10; // divisão de inteiros produz um resultado inteiro

   // exibe o total e a média das notas
   System.out.printf( "\nTotal of all 10 grades is %d\n", total );
   System.out.printf( "Class average is %d\n", average );
} // fim do método determineClassAverage

} // fim da classe GradeBook