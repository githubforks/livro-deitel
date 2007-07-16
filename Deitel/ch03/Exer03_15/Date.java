//Exercício 3.15
package ch03.Exer03_15;

public class Date {
	private int dia,mes,ano;
	
	public Date(int dia, int mes, int ano){
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}

	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void displayDate(){
		System.out.printf("%d/%d/%d",getDia(),getMes(),getAno());
	}
}