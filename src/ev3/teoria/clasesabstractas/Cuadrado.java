package ev3.teoria.clasesabstractas;

public class Cuadrado extends Paralelogramo {

	private double lado;
	
	public Cuadrado(double lado) {
		
		super(lado * 4);
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {

		return lado * lado;
	}

	@Override
	public void metodoParalelogramo() {

		System.out.println("paralelogramo");
	}
}
