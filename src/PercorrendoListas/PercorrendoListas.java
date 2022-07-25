package PercorrendoListas;

public class PercorrendoListas {

	public static void main(String[] args) {
		
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70 };
		
		percorreListaPrintNumberJumpLine(numbers);

	}

	public static void percorreListaPrintNumberJumpLine(int[] numbers) {
		
		for ( int x: numbers ) {
			if( x == 70 ) {
				break;
			}
			System.out.println(x);
			System.out.println("\n");
		}
	}

}
