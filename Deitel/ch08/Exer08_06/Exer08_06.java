/*
 * (Classe Conta de poupança) Crie uma classe SavingsAccount. Utilize uma variável
 * static annualInterestRate para armazenar a taxa de  juros anual para todos os
 * correntistas. Cada objeto da classe contém uma variável de instância private
 * savingsBalance para indicar a quantidade que o poupador atualmente tem em
 * depósito. Forneça um método calculateMonthlyInterest para calcular os juros
 * mensais multiplicando savingsBalance por annualInterestRate dividido por 12 -
 * esses juros devem ser adicionados a savingsBalance. Forneça um método static
 * modifyInterestRate que configure annualInterestRate com um novo valor. Escreva
 * um programa para testar a classe SavingsAccount. Instancie dois objetos
 * SavingsAccount, saver1 e saver2, com saldos de $2.000 e $3.000, respectivamente.
 * Configure anualInterestRate para 5%, calcule a taxa do próximo mês e imprima
 * os novos saldos para os dois poupadores.
 */

package ch08.Exer08_06;

public class Exer08_06
{
	public static void main(String[] args)
	{
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		saver1.modifyInterestRate(1.05);
		
		System.out.println(saver1.getSavingsBalance());
		System.out.println(saver2.getSavingsBalance());
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println(saver1.getSavingsBalance());
		System.out.println(saver2.getSavingsBalance());
	}
}
