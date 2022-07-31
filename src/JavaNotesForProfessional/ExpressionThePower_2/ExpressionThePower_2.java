package JavaNotesForProfessional.ExpressionThePower_2;

public class ExpressionThePower_2 {	

	private static int valor = 22;

	public static void main(String[] args) {
		
		int num1 = 23;
		
		System.out.println(pow2(num1));		

	}
	
	public static int pow2( int exp ) {
		return valor << exp;
	}

}
