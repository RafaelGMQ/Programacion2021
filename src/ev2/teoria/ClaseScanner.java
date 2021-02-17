package ev2.teoria;

import java.util.Scanner;

public class ClaseScanner {

	public static void main(String[] args) {

//		System.out.println("Introduzca una frase:");
		System.out.println("Introduzca un número:");
		
		Scanner scanner = new Scanner(System.in);
		double numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			
			System.out.println("El número introducido es par");
			
		} else {
			
			System.out.println("El número introducido es impar");
		}
		
		scanner.close();
		
		
		
//		String texto = scanner.nextLine();
		
//		System.out.println("La frase que has escrito tiene tamaño: " + texto.length());
	}

}
