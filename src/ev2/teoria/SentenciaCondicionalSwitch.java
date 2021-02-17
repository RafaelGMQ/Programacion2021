package ev2.teoria;

public class SentenciaCondicionalSwitch {

	public static void main(String[] args) {

		int edad = 1;
		
		switch(edad) {
		
			case 1:
				System.out.println("¡Feliz primer cumpleaños!");
				break;
				
			case 2:
				System.out.println("¡Felices 2 años!");
				System.out.println("¡Ya puedes hablar!");
				break;
			// ...
			
			case 18:
				System.out.println("¡Feliz mayoría de edad!");
				break;
			
			default:
				System.out.println("¡Felices " + edad + " años!");
		}
		
	}

}
