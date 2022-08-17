package ArrayVetor;

public class JavaQuizCode {

	public static void main(String[] args) {

		int[][] daily = {{1,2}, {4,3,2}};
		int[][] coding = {{1,2,3}, {3,2}};
		
		int a = daily[1].length;
		int b = coding[0].length;
		
		int c = daily[a%b][1];
		
		System.out.println(c);

	}

}
