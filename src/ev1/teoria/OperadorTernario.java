package ev1.teoria;

public class OperadorTernario {

	public static void main(String[] args) {

		final int CODIGO_PRODUCTO_NUEVO = 65463278;
		
		int codigoCamisetaRoja = 89437289;
		int codigoPantalonAzul = 65463278;
		int codigoSudaderaVerde = 68746784;
		
		int precioCamisetaRoja = codigoCamisetaRoja == CODIGO_PRODUCTO_NUEVO ? 100 : 80;
		int precioPantalonAzul = codigoPantalonAzul == CODIGO_PRODUCTO_NUEVO ? 100 : 80;
		int precioSudaderaVerde = codigoSudaderaVerde == CODIGO_PRODUCTO_NUEVO ? 100 : 80;
		
		System.out.println("precioCamisetaRoja = " + precioCamisetaRoja);
		System.out.println("precioPantalonAzul = " + precioPantalonAzul);
		System.out.println("precioSudaderaVerde = " + precioSudaderaVerde);
	}

}
