package appN;
// Fig. N.1: AccountTest.Java
// Cria e manipula um objeto Account.

public class AccountTest
{
   // método main inicia a execução
   public static void main( String args[] ) 
   {
      Account account = new Account( 50.00 ); // cria o objeto Account

      // exibe o saldo inicial do objeto Account
      System.out.printf( "initial account balance: $%.2f\n", 
         account.getBalance() );
      
      double depositAmount = 25.00; // deposita uma quantia
      
      System.out.printf( "\nadding %.2f to account balance\n\n", 
         depositAmount );
      account.credit( depositAmount ); // adiciona ao saldo da conta

      // exibe um novo saldo
      System.out.printf( "new account balance: $%.2f\n", 
         account.getBalance() );
   } // fim de main

} // fim da classe AccountTest


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
