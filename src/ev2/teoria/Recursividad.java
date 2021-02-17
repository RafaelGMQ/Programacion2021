package ev2.teoria;

public class Recursividad {

	public static void main(String[] args) {

		System.out.println(factorialMetodoRecursivo(6));
	}
	
	static long factorialMetodoIterativo(int numero) {
		
		long retorno = 1;
		
		for (int i = 2; i <= numero; i++) {
			
			retorno *= i;
		}
		
		return retorno;
	}
	
	static long factorialMetodoRecursivo(int numero) {
		
		if (numero == 1) {
			
			return 1;
			
		} else {
			
			return factorialMetodoRecursivo(numero - 1) * numero;
		}
	}

}
