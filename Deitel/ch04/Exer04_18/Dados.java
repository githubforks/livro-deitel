package ch04.Exer04_18;

public class Dados {
	int nConta, saldoInicial, totalComprado, totalCredito, limiteCredito;
	
	void Dados(){
		setNConta(0);
		setSaldoInicial(0);
		setTotalComprado(0);
		setTotalCredito(0);
		setLimiteCredito(0);
	}

	public int getNConta() {
		return nConta;
	}

	public int getSaldoInicial() {
		return saldoInicial;
	}

	public int getTotalComprado() {
		return totalComprado;
	}

	public int getTotalCredito() {
		return totalCredito;
	}

	public int getLimiteCredito() {
		return limiteCredito;
	}

	public void setNConta(int conta) {
		nConta = conta;
	}

	public void setSaldoInicial(int saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public void setTotalComprado(int totalComprado) {
		this.totalComprado = totalComprado;
	}

	public void setTotalCredito(int totalCredito) {
		this.totalCredito = totalCredito;
	}

	public void setLimiteCredito(int limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
}
