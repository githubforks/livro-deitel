/*
 * Os motoristas se preocupam com a quilometragem de seus autom�veis.
 * Um motorista monitorou v�rios tanques cheios de gasolina
 * registrando a quilometragem dirigida e a quantidade de combust�vel
 * em litros utilizados para cada tanque cheio. Desenvolva um
 * aplicativo Java que receba como entrada os quil�metros dirigidos
 * e os litros de gasolina consumidos (ambos como inteiros) para cada
 * tanque cheio. O programa deve calcular e exibir o consumo em
 * quil�metros/litro para cada tanque cheio e imprimir a quilometragem
 * combinada e a soma total de litros de combust�vel consumidos at�
 * esse ponto. Todos os c�lculos de m�dia devem produzir resultados
 * de pronto flutuante. Utilize a classe Scanner e repeti��o controlada
 * por sentinela para obter os dados do usu�rio.
 */

package ch04.Exer04_17;

import java.util.Scanner;

public class Exer04_17 {

	public static void main(String[] args) {
		int km,litros,kmTotal,litrosTotal;
		Scanner input = new Scanner(System.in);
		//func f = new func();
		km = 0;
		litros = 0;
		kmTotal = 0;
		litrosTotal = 0;
		
		do{
			System.out.print("Digite a quilometragem (-1 para sair): ");
			km = input.nextInt();
			if(km>=0){
				System.out.print("Digite os litros consumidos: ");
				litros = input.nextInt();
				//System.out.printf("Consumo: %d Km(s) por litro\n", km/litros);
				System.out.println("Consumo: ");//f.calcula(km, litros);
				kmTotal += km;
				litrosTotal += litros;
			}
		}while(km>=0);
		
		System.out.printf("Total de KM: %d\nTotal de Litros: %d\n", kmTotal, litrosTotal);
		System.out.println("FIM!");
	}
}
