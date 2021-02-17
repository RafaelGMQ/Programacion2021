package ev2.teoria;

public class ClaseString {

	public static void main(String[] args) {
		
		String nombreProfesor = "Rafael";
		String quijote = "En un lugar de la Mancha";
		
//		System.out.println(nombreProfesor);

//		longitudPalabra(nombreProfesor);
//		longitudPalabra("hola");
//		longitudPalabra("adiós");
//		longitudPalabra("perro");
//		longitudPalabra("gato");
//		longitudPalabra("mesa");
		
		
//		char variable = caracterDeLaPosicion(nombreProfesor, 0);
//		System.out.println(variable);
//		System.out.println(caracterDeLaPosicion(nombreProfesor, 2));
		
		
//		Scanner scanner = new Scanner(System.in);
//		String palabra = scanner.next();
//		System.out.println(palabra);
//		boolean condicion = nombreProfesor.equalsIgnoreCase(palabra);
//		System.out.println(condicion);
		
		
//		System.out.println(nombreProfesor.indexOf('a'));
//		System.out.println(nombreProfesor.indexOf('a', 3));
//		System.out.println(quijote.indexOf("Mancha", 10));
		
		
//		String substring = nombreProfesor.substring(2, 5);
//		System.out.println(substring);
//		System.out.println(nombreProfesor.substring(3));
		
		
//		System.out.println(nombreProfesor.toLowerCase());
//		System.out.println(quijote.substring(0, 6) + quijote.substring(6, 11).toUpperCase() + quijote.substring(11));
		
		
//		String frase = "   El ciclo de ejecución...  ";
//		System.out.println(frase.trim());
		
		
//		System.out.println(quijote);
//		System.out.println(quijote.replace('a', '@'));
//		System.out.println(quijote.replace("lugar", "sitio"));
		
		
//		String texto = "Hola, tengo 1 hermano y 3 hijos";
//		System.out.println(texto);
//		String[] array = texto.split("tengo");
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		String lista = "peras, manzanas,naranjas, kiwis";
//		String[] listaCompra = lista.split(",");
//		listaCompra[0] = listaCompra[0].trim();
//		listaCompra[1] = listaCompra[1].trim();
//		listaCompra[2] = listaCompra[2].trim();
//		listaCompra[3] = listaCompra[3].trim();
//		System.out.println(listaCompra[0]);
//		System.out.println(listaCompra[1]);
//		System.out.println(listaCompra[2]);
//		System.out.println(listaCompra[3]);
		
		
//		System.out.println(quijote);
		char[] arrayQuijote = quijote.toCharArray();
		System.out.println(arrayQuijote[0]);
		System.out.println(arrayQuijote[1]);
		System.out.println(arrayQuijote[2]);
		System.out.println(arrayQuijote[3]);
		System.out.println(arrayQuijote[4]);
		System.out.println(arrayQuijote[5]);
		System.out.println(arrayQuijote[6]);
		System.out.println(arrayQuijote[7]);
		System.out.println("...");
		
		
	}
	
	static void longitudPalabra(String palabra) {
		
		System.out.println("La longitud de \"" + palabra + "\" es: " + palabra.length() + " caracteres");
	}
	
	static char caracterDeLaPosicion(String palabra, int posicion) {
		
		char retorno = palabra.charAt(posicion);
		return retorno;
	}
}
