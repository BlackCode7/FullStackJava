package ArrayVetor;

public class CalculandoValoresParArmazenarArray {

	public static void main(String[] args) {

		final int ARRAY_LENGTH = 10; // declara constante ÿ
		int[] array = new int[ARRAY_LENGTH]; // cria o arrayÿ

		calculaValorCadaElementoDoArray(array);
		
	}

	public static void calculaValorCadaElementoDoArray(int[] array) {
		// calcula valor de cada elemento do array
		for (int counter = 0; counter < array.length; counter++) {
			array[counter] = 2 + 2 * counter;
		}	
		System.out.printf("%s%8s%n", "Index", "Value"); // títulos de coluna		
		// calcula valor de cada elemento do array
		for (int counter = 0; counter < array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]); //array[counter] = 2 + 2 * counter;
		}
	}

}
