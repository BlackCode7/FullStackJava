package ArrayVetor;

public class SomandoElementosDeumArray {

	public static void main(String[] args) {

		int[] array = {23, 45, 21, 76, 66, 43, 899};
		int total = 0;
		
		somaElementosDoArray(array, total);

	}

	/* Somando elementos de um array */
	public static void somaElementosDoArray(int[] array, int total) {
		for( int counter=0; counter<array.length; counter++ ) {
			total += array[counter];
		}
		System.out.printf(" Total of array elements: %d%n ", total);
	}

}
