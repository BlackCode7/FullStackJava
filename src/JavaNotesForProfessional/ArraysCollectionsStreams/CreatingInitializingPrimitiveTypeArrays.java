package JavaNotesForProfessional.ArraysCollectionsStreams;

public class CreatingInitializingPrimitiveTypeArrays {

	public static void main(String[] args) {

		int[] array1 = { 1,2,3,4,5,6,7 };		
		int[] array2 = new int[1];		
		int[] array3 = null;		
		int[][] a = new int[2][3];
		
		String[] array6 = new String[] { "Laurel", "Hardy" }; 
		String[] array7 = { "Laurel", "Hardy" }; 
		
		Object[] array10 = { new Object(), new Object() };

		System.out.println(array7[1]);
		System.out.println(array6[0]);
		System.out.println(a);
		System.out.println(array3);
		System.out.println(array2);
		System.out.println(array1);
		
		for(Object stringArray: array10) {
			System.out.println("ForArray > " + stringArray);
		}

	}

}
