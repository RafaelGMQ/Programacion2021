package ev1.teoria;

public class ConversionDeDatos {

	public static void main(String[] args) {

		// CONVERSION AUTOMATICA
		
		int variableInt = 10;
		long variableLong = variableInt;
		
//		System.out.println(variableShort);
		
		
		
		// CONVERSION EXPLICITA
		
		short variableShort = 128;
		byte variableByte = (byte) variableShort;
		
		System.out.println(variableByte);
	}

}
