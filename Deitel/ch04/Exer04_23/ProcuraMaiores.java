package ch04.Exer04_23;

public class ProcuraMaiores {

	public ProcuraMaiores(int[] vetor, int maior, int segundoMaior){
		
		if (vetor[0] > vetor[1]){
			maior = vetor[0];
			segundoMaior = vetor[1];
		}
		else{
			maior = vetor[1];
			segundoMaior = vetor[0];
		}

		for (int i = 2; i < vetor.length; i++) {
			if (vetor[i] > maior){
				segundoMaior = maior;
				maior = vetor[i];
			}else if (vetor[i]>segundoMaior)
				segundoMaior = vetor[i];
		}
	}
}
