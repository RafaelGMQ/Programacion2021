package ev2.teoria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Excepciones {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Hola");
		
//		unchecked();
//		checked();
		
		metodo();
		
		System.out.println("Adiós");
	}
	
	static void metodo() throws FileNotFoundException {
		
		checked();
	}
	
	static void unchecked() {
		
		System.out.println("Hola");
		
		int numero = 0;
		int numero2 = 0;
		int numero3 = 0;
		
		try {
			
			numero = 50;
			numero2 = 5 / 0;
			numero3 = 30;
			
		} catch(ArithmeticException exception) {
			
			exception.printStackTrace();
			
//			System.out.println("No pueden hacerse divisiones entre 0");
		}
		
		System.out.println(numero);
		System.out.println(numero2);
		System.out.println(numero3);
		
		
		System.out.println("Adiós");
	}

	static void checked() throws FileNotFoundException {
		
		File file = new File("C:\\Users\\Rafa\\Downloads\\fichero.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
	}
}
