package ev3.teoria.modificadoresacceso;

public class ModificadoresAcceso {
	
	public int variablePublic;
	protected int variableProtected;
	int variableDefault;
	private int variablePrivate;
	
//	public Prueba() {
//		
//		variable = 0;
//	}

	public int getVariable() {
		return variableProtected;
	}
}
