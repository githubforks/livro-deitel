package ch04.Exer04_23;

public class Exer04_23 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		int maior, segundoMaior;

		LeVetor lv = new LeVetor(nums);

		ProcuraMaiores pm = new ProcuraMaiores(nums);
		maior = pm.getMaior();
		segundoMaior = pm.getSegundoMaior();

		for (int i = 0; i < nums.length; i++) {
			System.out.printf("[%d] = %d\n", i, nums[i]);
		}
		System.out.printf("Maior = %d, Segundo Maior = %d", maior, segundoMaior);
	}
}
