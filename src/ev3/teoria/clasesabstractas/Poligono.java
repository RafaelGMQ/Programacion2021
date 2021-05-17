package ev3.teoria.clasesabstractas;

public abstract class Poligono {

	// ATRIBUTOS
	
	private double perimetro;
	
	
	// CONSTRUCTORES
	
	public Poligono(double perimetro) {
		this.perimetro = perimetro;
	}
	
	
	// MÉTODOS

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	public abstract double calcularArea();
}
