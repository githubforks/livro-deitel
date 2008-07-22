package ch04.Exer04_35;

public class Compara {
	boolean Comp(int a, int b, int c){
		int d = b - c;

		if(d < 0)
			d *= -1;

		boolean bool = true;
		if(d < a)
			if(a < b+c)
				bool = true;
			else bool = false;

		return bool;
	}
}
