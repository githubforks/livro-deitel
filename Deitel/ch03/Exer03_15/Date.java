/*
 * Crie uma classe chamada Date que inclui três informações como variáveis de instância - um
 * mês (tipo int), um dia (tipo int) e um ano (tipo int). Sua classe deve ter um construtor
 * que inicializa as três variáveis e assumir que os valores fornecidos são corretos. Forneça
 * um método set e um get para cada variável de instância. Forneça um método displayDate que
 * exibe o mês, o dia e o ano separados por barras normais (/). Escreva um aplicativo de teste
 * camado DateTest que demonstra as capacidades da classe Date.
 */

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