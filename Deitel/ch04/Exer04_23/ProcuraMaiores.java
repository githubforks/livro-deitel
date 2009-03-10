package ch04.Exer04_23;

// Procurar os dois maiores valores em um vetor de inteiros

public class ProcuraMaiores
{	
	private int primeiro, segundo;
	public ProcuraMaiores(int[] vetor)
	{
		if (vetor[0] > vetor[1])
		{
			primeiro = vetor[0];
			segundo = vetor[1];
		}
		else
		{
			primeiro = vetor[1];
			segundo = vetor[0];
		}

		for (int i = 2; i < vetor.length; i++)
		{
			if (vetor[i] > primeiro)
			{
				segundo = primeiro;
				primeiro = vetor[i];
			}else if (vetor[i] > segundo)
				segundo = vetor[i];
		}
	}

	public int getMaior()
	{
		return primeiro;
	}
	public int getSegundoMaior()
	{
		return segundo;
	}
}
