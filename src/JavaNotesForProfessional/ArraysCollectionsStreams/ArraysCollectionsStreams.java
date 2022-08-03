package JavaNotesForProfessional.ArraysCollectionsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArraysCollectionsStreams {

	public static void main(String[] args) {

		// Auto-boxing happening for int 127 here
		Integer[] initial = { 127, Integer.valueOf( 42 ) };
		List<Integer> toList = Arrays.asList( initial ); // Fixed size!		
		System.out.println(toList);
		
		Integer[] fromCollection = toList.toArray( new Integer[toList.size()] );
		System.out.println(fromCollection);
		System.out.println(toList.toArray( new Integer[toList.size()] ));
		
		// Streams - JDK 8+
		Stream<Integer> toStream = Arrays.stream( initial );
				
		Integer[] fromStream = toStream.toArray( Integer[]::new );
		System.out.println(fromStream);



	}

}
