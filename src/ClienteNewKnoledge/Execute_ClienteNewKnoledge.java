package ClienteNewKnoledge;

import javax.swing.JOptionPane;

public class Execute_ClienteNewKnoledge {

	public static void main(String[] args) {
	
		String nome = JOptionPane.showInputDialog("Qual o nome do cliente? ");
		String idade = JOptionPane.showInputDialog("Qual a idade do cliente? ");
		String endereco = JOptionPane.showInputDialog("Qual o endereço do cliente? ");
				
		ClienteNewKnoledge cliente1 = new ClienteNewKnoledge();
		cliente1.setNome(nome);		
		cliente1.setIdade(Integer.valueOf(idade));
		cliente1.setEndereco(endereco);		
	
		for( int pos = 1; pos <= 10; pos++) {
			String nomeProduto = JOptionPane.showInputDialog("Nome do produto "+ pos +" ?");
			String idProduto = JOptionPane.showInputDialog("Nome do produto "+ pos +" ?");			
			
			Produto produto = new Produto();
			produto.setNomeproduto(nomeProduto);
			produto.setId(Integer.valueOf(idProduto).intValue());
			
			cliente1.getProdutos().add(produto);
			
		}
		
		/* Deletando um registro */
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover algum cliente?");
		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual produto deseja remolver 1, 2, 3");
			cliente1.getProdutos().remove(Integer.valueOf(disciplinaRemover).intValue() -1 );
		}
	
		
		
		
		/*int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover algum produto? ");
		if( escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual o produto 1, 2, 3, 4?");
			cliente1.getProdutos().remove(Integer.valueOf(disciplinaRemover).intValue());
		}*/
	
		
		System.out.println("Resultados de clientes: " + cliente1);
		//System.out.println("Resultados Produtos: " + cliente1.getProdutos(produto1));

	}

}
