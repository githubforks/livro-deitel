package ch04.Exer04_37c;

public class Fatorial {
	double calcula(int i){
		double retorno = 1.0;

		if(i > 0)
			for(int j = i; j >= 1; j--)
			{
				retorno *= j;
			}
		return retorno;
	}
}
