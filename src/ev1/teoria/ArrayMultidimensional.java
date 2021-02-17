package ev1.teoria;

public class ArrayMultidimensional {

	public static void main(String[] args) {

		// Array 1 dimension
		int[] array1D = new int [10];
		int[] array1DBis = {1, 34, 3};
		
		// Array 2 dimensiones
		int[][] array2D = new int [3][3];
		int[][] array2DBis = {{10, 15}, {2, 3, 4, 5}};
		System.out.println(array2DBis[0][0]);
		System.out.println(array2DBis[1][1]);
		
		// Array 4 dimensiones
		int[][][][] array4D = new int [10][10][10][10];
		
		// Array 7 dimensiones
		int[][][][][][][] array7D = new int [10][20][2][34][1][10][23];
	}

}
