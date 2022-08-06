package TratamentoErrosExcecoesJava;

public class TratamentoErrosExcecoesJava {

	public static void main(String[] args) {
		// Estrutura do tratamento de exceções
		
		/*
		 * ERROS MAIS COMUNS EM JAVA
		 * 
		 * NullPointerException - quando existe variavel nula
		 * 
		 * NumberFormatException - quando tenta converter string em numero mas a string esta vazia
		 * 
		 * FileNotFoundException - quando tenta carregar um arquivo, mas o caminho do arquivo não foi encontrado
		 * 
		 * ClassCastException - quando tenta converter um objeto em outro, mas não sao do memso tipo ou relação
		 * 
		 * ClassNotFoundException - quando tenta carregar uma classe que não foi encontrada
		 * 
		 */
		
		try {
			
			// Bloco de comandos para executar
			// Aqui dentro fica todo o código de regra de negócios da aplicação
			
		}catch (Exception e) {
			
			// Onde mostra os erros
			e.printStackTrace();	
			
		}

	}

}
