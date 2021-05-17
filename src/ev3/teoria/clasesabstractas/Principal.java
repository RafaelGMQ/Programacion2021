package ev3.teoria.clasesabstractas;

public class Principal {

	public static void main(String[] args) {

		Cuadrado cuadrado = new Cuadrado(4);
		
		cuadrado.setPerimetro(20);
		
		System.out.println("perímetro = " + cuadrado.getPerimetro());
		cuadrado.metodoParalelogramo();
		
		
		
//		Poligono poligono = new Poligono(20);
	}

}
