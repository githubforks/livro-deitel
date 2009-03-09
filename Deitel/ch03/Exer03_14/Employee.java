/*
 * Crie uma classe chamada Employee que inclui três partes de informações como variáveis de
 * instância - um primeiro nome (tipo String), um sobrenome (tipo String) e um salário
 * mensal (double). Sua classe deve ter um construtor que inicializa as três variáveis de
 * instância. Forneça um EmployeeTest que demonstra as capacidades da classe Employee. Crie
 * dois objetos Employee e exiba o salário anual de cada objeto. Então dê a cada Employee um
 * aumento de 10% e exiba novamente o salário anual de cada Employee.
 */
package ch03.Exer03_14;

public class Employee
{
	private String nome, sobrenome;
	private double salarioMensal;
	
	public Employee(String nome, String sobrenome, double salarioMensal)
	{
		setNome(nome);
		setSobrenome(sobrenome);
		setSalarioMensal(salarioMensal);
	}

	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public String getSobrenome()
	{
		return sobrenome;
	}
	public void setSobrenome(String sobrenome)
	{
		this.sobrenome = sobrenome;
	}
	public double getSalarioMensal()
	{
		return salarioMensal;
	}
	public void setSalarioMensal(double salarioMensal)
	{
		if(salarioMensal < 0)
			this.salarioMensal = 0.0;
		else this.salarioMensal = salarioMensal;
	}
}
