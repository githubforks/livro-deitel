package appJ;
// Transaction.java
// A superclasse abstrata Transaction representa uma transação no ATM

public abstract class Transaction
{
   private int accountNumber; // indica conta envolvida
   private Screen screen; // Tela do ATM
   private BankDatabase bankDatabase; // banco de dados de informações sobre a conta

   // Construtor de Transaction invocado pelas subclasses utilizando super()
   public Transaction( int userAccountNumber, Screen atmScreen, 
      BankDatabase atmBankDatabase )
   {
      accountNumber = userAccountNumber;
      screen = atmScreen;
      bankDatabase = atmBankDatabase;
   } // fim do construtor de Transaction

   // retorna o número da conta
   public int getAccountNumber()
   {
      return accountNumber; 
   } // fim do método getAccountNumber

   // retorna a referência à tela
   public Screen getScreen()
   {
      return screen;
   } // fim do método getScreen

   // retorno a referência ao banco de dados da instituição financeira
   public BankDatabase getBankDatabase()
   {
      return bankDatabase;
   } // fim do método getBankDatabase

   // realiza a transação (sobrescrita por cada subclasse)
   abstract public void execute();
} // fim da classe Transaction


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