package ev1.teoria;

public class ClaseMath {

	public static void main(String[] args) {

		int numeroNegativo = -13;
		int valorAbsoluto = Math.abs(numeroNegativo);
		int potencia = (int) Math.pow(5, 2);
		long numero = (long) 5.999;
		long redondeo = Math.round(5.5);
		
		System.out.println("valor absoluto = " + valorAbsoluto);
		System.out.println("potencia = " + potencia);
		System.out.println("numero = " + numero);
		System.out.println("redondeo = " + redondeo);
	}

}
