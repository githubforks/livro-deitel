package ch04.Exer04_06;

public class Calculate {
	public static void main(String[] args) {
		int sum,x;

		x = 1;
		sum = 0;

		while (x <= 10){
			sum += x++;
			//++x;
		}
		System.out.println("A soma é: " + sum);
	}
}
