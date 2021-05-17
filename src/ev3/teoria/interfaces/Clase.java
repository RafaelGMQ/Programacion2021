package ev3.teoria.interfaces;

public class Clase implements Interfaz {

	@Override
	public int metodo1(int a, int b) {
		return a * 4 - b;
	}

	@Override
	public void metodo2(double valor) {

		System.out.println("El valor es " + valor);
	}
}
