package ev3.teoria.clasesabstractas;

public class Triangulo extends Poligono {

	private double base;
	private double altura;
	
	public Triangulo(double perimetro) {
		super(perimetro);
	}
	
	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}
}
