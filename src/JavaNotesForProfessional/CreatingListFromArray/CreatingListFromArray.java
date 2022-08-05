package JavaNotesForProfessional.CreatingListFromArray;

import java.util.Arrays;
import java.util.List;

public class CreatingListFromArray {

	public static void main(String[] args) {

		/*
		 * O método Arrays.asList() pode ser usado para retornar uma lista de 
		 * tamanho fixo contendo os elementos da matriz dada. A Lista resultante 
		 * será do mesmo tipo de parâmetro que o tipo de base da matriz.
		 */
		
		String[] stringArray = { "CasaTargeryan", "CasaStark", "CasaLanisters" };
		List<String> stringList = Arrays.asList(stringArray);
		
		if( stringArray.length > 0 ) {
			
			for(String list: stringList ) {
				System.out.println(list);
			}
			
		}
		

	}

}
