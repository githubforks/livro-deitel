/*
 * Os motoristas se preocupam com a quilometragem de seus automóveis.
 * Um motorista monitorou vários tanques cheios de gasolina
 * registrando a quilometragem dirigida e a quantidade de combustível
 * em litros utilizados para cada tanque cheio. Desenvolva um
 * aplicativo Java que receba como entrada os quilômetros dirigidos
 * e os litros de gasolina consumidos (ambos como inteiros) para cada
 * tanque cheio. O programa deve calcular e exibir o consumo em
 * quilômetros/litro para cada tanque cheio e imprimir a quilometragem
 * combinada e a soma total de litros de combustível consumidos até
 * esse ponto. Todos os cálculos de média devem produzir resultados
 * de pronto flutuante. Utilize a classe Scanner e repetição controlada
 * por sentinela para obter os dados do usuário.
 */

package ch04.Exer04_17;

import java.util.Scanner;

public class Exer04_17
{
	public static void main(String[] args)
	{
		int km,litros,kmTotal,litrosTotal;
		Scanner input = new Scanner(System.in);
		Func f = new Func();
		km = 0;
		litros = 0;
		kmTotal = 0;
		litrosTotal = 0;
		
		do
		{
			System.out.print("Digite a quilometragem (-1 para sair): ");
			km = input.nextInt();
			if(km>=0){
				System.out.print("Digite os litros consumidos: ");
				litros = input.nextInt();
				System.out.println("Consumo: ");f.calcula(km, litros);
				kmTotal += km;
				litrosTotal += litros;
			}
		}while(km>=0);
		
		System.out.printf("Total de KM: %d\nTotal de Litros: %d\n", kmTotal, litrosTotal);
		System.out.println("FIM!");
	}
}
