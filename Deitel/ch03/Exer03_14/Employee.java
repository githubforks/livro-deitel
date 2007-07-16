//Parte do exercício 3.14
package ch03.Exer03_14;

public class Employee {
	private String nome, sobrenome;
	private double salarioMensal;
	
	public Employee(String nome, String sobrenome, double salarioMensal) {
		super();
		setNome(nome);
		setSobrenome(sobrenome);
		setSalarioMensal(salarioMensal);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalarioMensal() {
		return salarioMensal;
	}
	public void setSalarioMensal(double salarioMensal) {
		if(salarioMensal < 0)
			this.salarioMensal = 0.0;
		else this.salarioMensal = salarioMensal;
	}
}
