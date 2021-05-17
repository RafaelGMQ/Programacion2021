package ev3.teoria.modificadoresacceso.paquetedistinto;

import ev3.teoria.modificadoresacceso.ModificadoresAcceso;

public class DistintoPaquete {

	public static void main(String[] args) {

		ModificadoresAcceso prueba = new ModificadoresAcceso();
		prueba.variablePublic = 20;
//		prueba.variableProtected = 20;
//		prueba.variableDefault = 20;
//		prueba.variablePrivate = 20;
	}

	void metodo() {
		
//		this.variablePublic = 20;
//		this.variableProtected = 20;
//		this.variableDefault = 20;
//		this.variablePrivate = 20;
	}
}
