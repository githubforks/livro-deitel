/*
 * Crie uma classe chamada Invoice para que uma loja de suprimentos de informática possa
 * utilizá-la para representar uma fatura de um item vendido na loja. Uma Invoice (fatura)
 * deve incluir quatro partes das informações como variáveis de instância - o número
 * (tipo String), a descrição (tipo String), a quantidade comprada de um item (tipo int) e
 * o preço por item (double). Sua classe deve ter um construtor que inicializa as quatro
 * variáveis de instância. Forneça um método set e get para cada variável de instância.
 * Além disso, forneça um método chamada getInvoiceAmmount que calcula o valor da fatura
 * (isto é, multiplica a quantidade pelo preço por item) e depois retorna o valor como um
 * double. Se o valor não for positivo, ele deve ser configurado como 0. Se o preço por item
 * não for positivo, ele deve ser configurado como 0.0. Escreva um aplicativo de teste
 * chamado InvoiceTest que demonstra as capacidades da classe Invoice.
 */
package ch03.Exer03_13;

public class Invoice
{
	private String num,des;	//Número e descrição
	private int quant;		//Quantidade
	private double preco;	//Preço

	public Invoice(String num, String des, int quant, double preco)
	{
		super();
		setNum(num);
		setDes(des);
		setQuant(quant);
		setPreco(preco);
	}

	public String getDes()
	{
		return des;
	}
	public void setDes(String des)
	{
		this.des = des;
	}
	public String getNum()
	{
		return num;
	}
	public void setNum(String num)
	{
		this.num = num;
	}
	public double getPreco()
	{
		return preco;
	}
	public void setPreco(double preco)
	{
		if(preco < 0)
			this.preco = 0;
		else this.preco = preco;
	}
	public int getQuant()
	{
		return quant;
	}
	public void setQuant(int quant)
	{
		if(quant < 0)
			this.quant = 0;
		else this.quant = quant;
	}
	
	public double getInvoiceAmount()
	{
		return quant*preco;
	}
}