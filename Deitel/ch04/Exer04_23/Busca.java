package ch04.Exer04_23;

//Procura se já não existe um valor em um dado vetor

public class Busca
{
	public boolean busca(int[] v, int ultimo, int valor)
	{
		boolean b = false;
		
		for (int i = 0; i <= ultimo; i++)
		{
			if (v[i] == valor)
				b = true;
		}
		return b;
	}
}
