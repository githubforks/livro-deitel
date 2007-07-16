package ch04.Exer04_22;

public class Exer04_22 {
	public static void main(String[] args) {
		System.out.println("N  10*N  100*N  1000*N");
		
		for (int i = 1; i < 6; i++) {
			System.out.printf("%d  %d    %d    %d\n", i, i*10, i*100, i*1000);
		}
	}
}
