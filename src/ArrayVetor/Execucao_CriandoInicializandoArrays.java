package ArrayVetor;

public class Execucao_CriandoInicializandoArrays {

	public static void main(String[] args) {

		int[] array = new int[10];
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int number=0; number < array.length; number++ ) {
			System.out.printf(" %5d%8d%n ", number, array[number]);
		}

	}

}
