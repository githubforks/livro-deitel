/*
 * Desenvolva um aplicativo Java que determinará se um cliente de uma loja de departamentos
 * excedeu o limite de crédito em uma conta corrente. Para cada cliente, os seguintes fatos
 * estão disponíveis:
 * 
 * a) número de conta
 * b) saldo no início do mês
 * c) total de todos os itens cobrados desse cliente no mês
 * d) total de créditos aplicados ao cliente no mês
 * e) limite de crédito autorizado
 * 
 * O programa deve inserir todos esses fatos como inteiros, calcular o novo saldo
 * (= saldo inicial + despesas - créditos), exibir o novo saldo e determinar se o novo saldo
 * excede o limite de crédito do cliente. Para aqueles cujo limite for excedido, o programa
 * deve exibir a mensagem "Limite de crédito excedido".
 */

package ch04.Exer04_18;

import java.util.Scanner;

public class Exer04_18 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		Dados d = new Dados();

		System.out.println("Número da conta: ");
		d.setNConta(input.nextInt());

		System.out.println("Saldo no início do mês: ");
		d.setSaldoInicial(input.nextInt());

		System.out.println("Total de todos os itens cobrados no mês: ");
		d.setTotalComprado(input.nextInt());

		System.out.println("Total de créditos no mês: ");
		d.setTotalCredito(input.nextInt());

		System.out.println("Limite de crédito autorizado: ");
		d.setLimiteCredito(input.nextInt());
		
		d.setSaldoInicial(d.getSaldoInicial()+d.getTotalComprado()-d.getTotalCredito());
		if(d.getTotalCredito()>d.getLimiteCredito())
			System.out.println("Limite de crédito excedido.");
	}
}
