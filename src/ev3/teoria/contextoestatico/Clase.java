package ev3.teoria.contextoestatico;

public class Clase {

	// ATRIBUTOS
	
	private static int variableEstatica;
	
	private int id;
	private int variable;
	
	
	// CONSTRUCTORES
	
	public Clase(int variable) {

		this.id = ++variableEstatica;
		this.variable = variable;
	}
	
	
	// MÉTODOS

	public int getId() {
		return id;
	}
	
	public int getVariable() {
		return variable;
	}

	public void setVariable(int variable) {
		this.variable = variable;
	}
	
	public static int getVariableEstatica() {
		return variableEstatica;
	}

//	public static void setVariableEstatica(int variableEstatica) {
//		Clase.variableEstatica = variableEstatica;
//	}
}
