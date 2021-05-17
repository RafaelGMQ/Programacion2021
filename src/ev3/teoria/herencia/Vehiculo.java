package ev3.teoria.herencia;

public class Vehiculo {

	// ATRIBUTOS
	
	String marca;
	String modelo;
	String matricula;
	double cantidadDeCombustible;
	
	
	// CONTRUCTORES
	
//	public Vehiculo(String marca, String modelo, String matricula, double cantidadDeCombustible) {
//		this.marca = marca;
//		this.modelo = modelo;
//		this.matricula = matricula;
//		this.cantidadDeCombustible = cantidadDeCombustible;
//	}
	
	
	// MÉTODOS

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getCantidadDeCombustible() {
		return cantidadDeCombustible;
	}

	public void setCantidadDeCombustible(double cantidadDeCombustible) {
		this.cantidadDeCombustible = cantidadDeCombustible;
	}
}
