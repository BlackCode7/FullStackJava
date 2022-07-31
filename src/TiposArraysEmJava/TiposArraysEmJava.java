package TiposArraysEmJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import HerancaJavaPessoaAlunoDiretorSecretario.Aluno;

public class TiposArraysEmJava {

	public static void main(String[] args) {
		
		// Type of Arrays in java = ( objects/int/long/bytes/String ) 
		// Formas de instanciar um Array Every array, 
		// when being created, needs a set length specified. This is either done when creating an
		// empty array (new int[3]) or implied when specifying values ({1, 2, 3}).

		/* Arrays type int */
		int[] number1 = new int[7];
		int[] number2 = {1,2,3,4,5,6,7};
		int[] number3 = new int[] {1,2,3,4,5,6,7};
		int[][] number4 = {{1,2}, {1,2,3,4,5,6,7}};
		int[][] number5 = new int[5][];
		int[][] number6 = new int[5][4];
		
		System.out.println(number1.length);
		System.out.println("AQUI "+number2);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		System.out.println(number6);
		System.out.println();
		for(int num: number1 ) {
			System.out.println("Array in loop for >>> " + num);
		}
		
		System.out.println();
		/* Arrays type float and type double*/
		float[] numberFloat = new float[5];
		double[] numberDouble = new double[] {4.32, 332.432423, 0.432, 10.0};
		
		System.out.println("numberFloat : " + numberFloat);
		System.out.println("numberDouble : " + numberDouble);
		System.out.println("numberDouble in position 3 : " + numberDouble[3]);
		System.out.println();
		
		/* Arrays type String */
		// Array of five 64-bit floating point numbers
		String[] theory = new String[] {"a", "b", "c"};
		for(String stringArray: theory) {
			System.out.println(stringArray);
		}
		
		// Array of three strings (reference type).
		// Array of three Objects (reference type).
		System.out.println();
		Object[] dArt = new Object[] { new Object(), "We love Stack Overflow.", new Integer(3) };
		System.out.println("Array of String and Object : " + dArt);

		System.out.println();
		Aluno[] userClasse = new Aluno[5]; 
		System.out.println(userClasse);
		
		System.out.println();
		Integer[] initial = { 127, Integer.valueOf( 42 ) };
		List<Integer> toList = Arrays.asList( initial ); // Fixed size!
		
		//Java doesn't allow you to create an array of a parameterized type
		Integer[] fromCollection = toList.toArray( new Integer[toList.size()] );
		//List<String>[] list = new ArrayList<String>[2]; 
		
		// Streams - JDK 8+
		Stream<Integer> toStream = Arrays.stream( initial );
		Integer[] fromStream = toStream.toArray( Integer[]::new );


		System.out.println(fromStream);
		System.out.println(toList);
		System.out.println(fromCollection);
		

	}

}
