package ev3.teoria.modificadoresacceso;

public class MismoPaqueteSubclase extends ModificadoresAcceso {

	public static void main(String[] args) {

		ModificadoresAcceso prueba = new ModificadoresAcceso();
		prueba.variablePublic = 20;
		prueba.variableProtected = 20;
		prueba.variableDefault = 20;
//		prueba.variablePrivate = 20;
	}

	void metodo() {
		
		this.variablePublic = 20;
		this.variableProtected = 20;
		this.variableDefault = 20;
//		this.variablePrivate = 20;
	}
}
