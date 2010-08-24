/*
 * (Retornando indicadores de erros de métodos) Modifique os métodos set na
 * classe Time2 na Figura 8.5 para retornar valores de erro apropriados se
 * ocorrer uma tentativa de configurar uma das variáveis de instância hour,
 * minute ou second de um objeto da classe Time como um valor inválido. [Dica:
 * Utilize tipos de retorno boolean em cada método.] Escreva um programa que
 * teste esses novos métodos set e gere a saída de mensagem de erro quando
 * valores incorretos são fornecidos.
 */

package ch08.Exer08_09;

public class Exer08_09
{
	public static void main(String[] args)
	{
		Time2 time = new Time2();
		
		if(time.setHour(13))
			System.out.println("OK!");
		else System.out.println("Erro!");
		
		if(time.setMinute(50))
			System.out.println("OK!");
		else System.out.println("Erro!");
		
		if(time.setSecond(61))
			System.out.println("OK!");
		else System.out.println("Erro!");
		
		System.out.println(time.toUniversalString());
	}
}
