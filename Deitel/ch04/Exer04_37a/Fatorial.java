package ch04.Exer04_37a;

public class Fatorial {
	int calcula(int i){
		int retorno = 1;

		if(i > 0)
			for(int j = i; j >= 1; j--)
			{
				retorno *= j;
			}
		return retorno;
	}
}
