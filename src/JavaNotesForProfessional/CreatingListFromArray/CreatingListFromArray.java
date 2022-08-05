package JavaNotesForProfessional.CreatingListFromArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CreatingListFromArray {

	public static void main(String[] args) {

		/*
		 * O método Arrays.asList() pode ser usado para retornar uma lista de 
		 * tamanho fixo contendo os elementos da matriz dada. A Lista resultante 
		 * será do mesmo tipo de parâmetro que o tipo de base da matriz.
		 */
		
		String[] stringArray = { "CasaTargeryan", "CasaStark", "CasaLanisters", "CasaBolton", "CasaMormont", "CasaGreyjoy", "CasaFrey", "CasaTully" };
		List<String> stringList = Arrays.asList(stringArray);
		
		if( stringArray.length > 3 && stringArray.length <= 10) {			
			for(String list: stringList ) {
				System.out.println(list);
			}			
		} else {
			System.out.println("Array não contem elementos suficientes!");
		}
		
		/*
		 * Em Java SE 7 e posteriores, um par de colchetes de ângulo <> (conjunto vazio 
		 * de argumentos do tipo) pode ser usado, que é chamado de Diamante. O compilador 
		 * pode determinar o tipo de argumentos a partir do contexto. Isto significa que a 
		 * informação do tipo pode ser deixado de fora ao chamar o construtor do ArrayList e 
		 * ele será inferido automaticamente durante a compilação. Isto é chamado Type Inference, 
		 * que faz parte dos genéricos Java
		 */
		
		// Using Arrays.asList()
		String[] stringArray2 = {"foo", "bar", "baz"};
		List<String> stringList2 = new ArrayList<>(Arrays.asList(stringArray2));		
		for ( String tes: stringList2) {
			System.out.println(tes);
		}		
		System.out.println("ATE AQUI _ 1 : " + stringList2);
		
		// Using ArrayList.addAll()
		String[] stringArray3 = {"foo3", "bar3", "baz3"};
		ArrayList<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(stringArray3));// verifica se o objeto é um array de strings		
		System.out.println( list.addAll(Arrays.asList(stringArray3)) ); // Verificando se o objeto é uma lista
		
		// Using Collections.addAll()
		String[] stringArray4 = {"foo4", "bar4", "baz4"};
		ArrayList<String> list4 = new ArrayList<>();
		Collections.addAll(list4, stringArray4); // usando o collections
		System.out.println( Collections.addAll(list4, stringArray4) ); // Verificando se o objeto é uma lista
		
		// Using Streams
		int[] ints = {1, 2, 3}; //Excelente para mostrar todos os itens da lista
		List<Integer> list5 = Arrays.stream(ints).boxed().collect(Collectors.toList());
		System.out.println("Using stream : "+list5);
		
		String[] stringArray5 = {"which", "is an", "instance of", "Arrays$ArrayList"};
		List<Object> list51 = Arrays.stream(stringArray5).collect(Collectors.toList());
		System.out.println("usind of the stream > "+list51);


		

	}

}
