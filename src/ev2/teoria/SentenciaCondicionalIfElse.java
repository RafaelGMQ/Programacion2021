package ev2.teoria;

public class SentenciaCondicionalIfElse {

	public static void main(String[] args) {

		int edad = 13;
		boolean permisoPadres = true;
		String pcr = "negativa";
		
		if( (edad >= 18 || permisoPadres == true) && pcr.equals("negativa") ) {
			
			System.out.println("Puede ir a la excursión");
			
		} else {
			
			System.out.println("No puede ir a la excursión");
		}

	}

}
