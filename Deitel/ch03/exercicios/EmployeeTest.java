//Parte do exercício 3.14
package ch03.exercicios;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1,e2;
		
		e1 = new Employee("Márcio","Leal",100.0);
		e2 = new Employee("Leonardo","Leal",1550.0);
		
		System.out.printf("Nome: %s Salário Anual: %s\n",e1.getNome(),
				e1.getSalarioMensal()*12);
		System.out.printf("Nome: %s Salário Anual: %s\n",e2.getNome(),
				e2.getSalarioMensal()*12);
		
		e1.setSalarioMensal(e1.getSalarioMensal()*1.1);
		e2.setSalarioMensal(e2.getSalarioMensal()*1.1);
		
		System.out.println("-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;-;");
		
		System.out.printf("Nome: %s Salário Anual: %s\n",e1.getNome(),
				e1.getSalarioMensal()*12);
		System.out.printf("Nome: %s Salário Anual: %s\n",e2.getNome(),
				e2.getSalarioMensal()*12);
	}
}
