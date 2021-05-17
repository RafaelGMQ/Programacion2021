package ev3.teoria;

public class Encapsulacion {

	private String marca;
	private String modelo;
	private double precioBruto;
	
	private double indiceX;
	
	public Encapsulacion(String marca, String modelo, double precioBruto) {
		
		if(marca == null) {
			
			marca = "desconocido";
		}
		
		if(modelo == null) {
			
			modelo = "desconocido";
		}
		
		this.marca = marca;
		this.modelo = modelo;
		this.precioBruto = precioBruto;
		
		indiceX = 1.25;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

//	public void setMarca(String marca) {
//		this.marca = marca;
//	}
//
//	public void setModelo(String modelo) {
//		this.modelo = modelo;
//	}
	
	public double getPrecioBruto() {
		return precioBruto;
	}
	
	public double precioFinalCoche() {
		
		return precioBruto * indiceX;
	}

	
}
