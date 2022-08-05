package JavaNotesForProfessional.ArraysCollectionsStreams;

public class InitializingGenericArrays<T> {
	
	private T[] a;
	
	
	
	public InitializingGenericArrays() {
		a = (T[]) new Object[5];
	}
	
	public T[] printResult() {
		return a;
	}

}
