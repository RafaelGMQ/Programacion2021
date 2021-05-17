package ev2.examen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solucion {

	public static void main(String[] args) {

//		System.out.println(cartaAleatoria());
//		imprimirNumerosComprendidosEntre5Y83();
//		invertirString();
//		if(numerosEnOrdenDeMenorAMayorGenerico(5)) {
//			System.out.println("Los números han sido introducidos en orden");
//		} else {
//			System.out.println("Los números NO han sido introducidos en orden");
//		}
//		introduceNumerosHastaMultiploDe5();
//		System.out.println("El número de apariciones es: " + aparicionesPrimeraLetra());
//		imprimirMultiplosDeTresComprendidosEntreDosNumeros(9, 3);
//		System.out.println("El área es: " + areaRectangulo(4, 2));
//		System.out.println("fibonacci = " + fibonacci(10));
		System.out.println("Cantidad de \'t\' (mayúsculas o minúsculas) = " + numeroDeTes("Tomate"));
	}
	
	static String cartaAleatoria() {
		
		String[] numeros = {"As", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
		String[] palo = {"Oros", "Copas", "Espadas", "Bastos"};
		
		return numeros[(int)(Math.random() * numeros.length)] + " de " + palo[(int)(Math.random() * palo.length)];
	}
	
	static void imprimirNumerosComprendidosEntre5Y83() {
		
		for (int i = 5; i <= 83; i++) {
			
			System.out.println(i);
		}
	}
	
	static void invertirString() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor, introduzca un texto:");
		String texto = scanner.nextLine();
		
		System.out.println("La cadena invertida es:");
		
		for (int i = texto.length() - 1; i >= 0; i--) {
			
			System.out.print(texto.charAt(i));
		}
		
		System.out.println();
	}
	
	static boolean numerosEnOrdenDeMenorAMayor() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Por favor, introduzca un número: ");
		int numero1 = scanner.nextInt();
		System.out.print("Por favor, introduzca un número: ");
		int numero2 = scanner.nextInt();
		System.out.print("Por favor, introduzca un número: ");
		int numero3 = scanner.nextInt();
				
		return numero1 < numero2 && numero2 < numero3;
	}
	
	static boolean numerosEnOrdenDeMenorAMayorGenerico(int numeros) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean enOrden = true;
		int numeroAnterior = 0;
		
		System.out.println("Tiene que introducir " + numeros + " numeros:");
		
		for (int i = 0; i < numeros; i++) {
			
			System.out.print("Por favor, introduzca un número: ");
			int numero = scanner.nextInt();
			
			if(i > 0 && numeroAnterior > numero) {
				enOrden = false;
			}
			
			numeroAnterior = numero;
		}
		
		return enOrden;
	}
	
	static void introduceNumerosHastaMultiploDe5() {
		
		Scanner scanner = new Scanner(System.in);
		int numero = 0;
		
		do {
			
			System.out.print("Por favor, introduzca un número: ");
			
			try {
				
				numero = scanner.nextInt();
				
			} catch(InputMismatchException e) {
				
				System.out.println("Introduzca un valor numérico...");
				introduceNumerosHastaMultiploDe5();
				numero = 5;
			}
			
		} while(numero % 5 != 0);
	}
	
	static int aparicionesPrimeraLetra() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor, introduzca un texto:");
		String texto = scanner.nextLine();
		int contador = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			
			if(texto.charAt(0) == texto.charAt(i)) {
				
				contador++;
			}
		}
		
		return contador;
	}
	
	static void imprimirMultiplosDeTresComprendidosEntreDosNumeros(int numeroMenor, int numeroMayor) {
		
		if (numeroMenor > numeroMayor) {
			
			int auxiliar = numeroMenor;
			numeroMenor = numeroMayor;
			numeroMayor = auxiliar;
		}
		
		for (int i = numeroMenor; i <= numeroMayor; i++) {
			
			if ( i % 3 == 0 ) {
				
				System.out.println(i);
			}
		}
	}
	
	static double areaRectangulo(double base, double altura) {
		
		return base * altura;
	}
	
	static long fibonacci(int posicion) {
		
		if (posicion == 1) {
			
			return 0;
		}
		
		else if (posicion == 2) {
			
			return 1;
		}
		
		else {
			
			return fibonacci(posicion - 1) + fibonacci(posicion - 2);
		}
	}
	
	static int numeroDeTes(String texto) {
		
		int cantidadDeTes = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			
			if (texto.toLowerCase().charAt(i) == 't') {
				
				cantidadDeTes++;
			}
		}
		
		return cantidadDeTes;
	}
}
