package appJ;
// Keypad.java
// Representa o teclado do ATM
import java.util.Scanner; // o programa utiliza Scanner para obter a entrada do usuário

public class Keypad
{
   private Scanner input; // lê os dados na linha de comando
                         
   // o construtor sem argumento inicializa a classe Scanner
   public Keypad()
   {
      input = new Scanner( System.in );    
   } // fim do construtor Keypad sem argumentos

   // retorna um valor inteiro inserido pelo usuário
   public int getInput()
   {
      return input.nextInt(); // supomos que o usuário insira um inteiro
   } // fim do método getInput
} // fim da classe Keypad  


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/