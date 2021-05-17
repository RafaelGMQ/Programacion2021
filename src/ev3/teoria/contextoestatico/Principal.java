package ev3.teoria.contextoestatico;

public class Principal {

	public static void main(String[] args) {

		System.out.println("Clase.variableEstatica = " + Clase.getVariableEstatica());
		
		Clase clase1 = new Clase(150);
		
		System.out.println("Creada clase1");
//		System.out.println("clase1.variableEstatica = " + clase1.getVariableEstatica());
		System.out.println("Clase.variableEstatica = " + Clase.getVariableEstatica());

		
		Clase clase2 = new Clase(200);
		
		System.out.println("Creada clase2");
//		System.out.println("clase1.variableEstatica = " + clase1.getVariableEstatica());
//		System.out.println("clase2.variableEstatica = " + clase2.getVariableEstatica());
		System.out.println("Clase.variableEstatica = " + Clase.getVariableEstatica());
		
		Clase clase3 = new Clase(300);
		
		System.out.println("Creada clase3");
//		System.out.println("clase1.variableEstatica = " + clase1.getVariableEstatica());
//		System.out.println("clase2.variableEstatica = " + clase2.getVariableEstatica());
//		System.out.println("clase3.variableEstatica = " + clase3.getVariableEstatica());
		System.out.println("Clase.variableEstatica = " + Clase.getVariableEstatica());
		
		System.out.println();
		
		System.out.println("clase1.variable = " + clase1.getVariable());
		System.out.println("clase2.variable = " + clase2.getVariable());
		System.out.println("clase3.variable = " + clase3.getVariable());
		
		System.out.println();
				
		System.out.println("clase1.id = " + clase1.getId());
		System.out.println("clase2.id = " + clase2.getId());
		System.out.println("clase3.id = " + clase3.getId());
	}

}
