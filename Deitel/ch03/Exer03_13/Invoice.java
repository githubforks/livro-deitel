//Exercício 3.13
package ch03.Exer03_13;

public class Invoice {
	private String num,des;	//Número e descrição
	private int quant;		//Quantidade
	private double preco;	//Preço

	public Invoice(String num, String des, int quant, double preco) {
		super();
		setNum(num);
		setDes(des);
		setQuant(quant);
		setPreco(preco);
	}

	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco < 0)
			this.preco = 0;
		else this.preco = preco;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		if(quant < 0)
			this.quant = 0;
		else this.quant = quant;
	}
	
	public double getInvoiceAmount(){
		return quant*preco;
	}
}