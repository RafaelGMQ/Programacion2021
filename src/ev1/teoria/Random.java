package ev1.teoria;

public class Random {

	public static void main(String[] args) {

		double aleatorio = Math.random();
		System.out.println("aleatorio = " + aleatorio);
		
		double aleatorioPor6 = aleatorio * 6;
		System.out.println("aleatorioPor6 = " + aleatorioPor6);

		int enteroDel0Al5 = (int) aleatorioPor6;
		System.out.println("enteroDel0Al5 = " + enteroDel0Al5);

		int dado = enteroDel0Al5 + 1;
		System.out.println("dado = " + dado);
	}

}
