package ClienteNewKnoledge;

import javax.swing.JOptionPane;

public class Execute_ClienteNewKnoledge {

	public static void main(String[] args) {
	
		String nome = JOptionPane.showInputDialog("Qual o nome do cliente? ");
		String idade = JOptionPane.showInputDialog("Qual a idade do cliente? ");
		String endereco = JOptionPane.showInputDialog("Qual o endereço do cliente? ");
		//String produtoA = JOptionPane.showInputDialog("Nome produto? ");
		//String produtoAID = JOptionPane.showInputDialog("Nome produto? ");
				
		ClienteNewKnoledge cliente1 = new ClienteNewKnoledge();
		cliente1.setNome(nome);		
		cliente1.setIdade(Integer.valueOf(idade));
		cliente1.setEndereco(endereco);		
	
		for( int pos = 1; pos <= 4; pos++) {
			String nomeProduto = JOptionPane.showInputDialog("Nome do produto "+ pos +" ?");
			String idProduto = JOptionPane.showInputDialog("Nome do produto "+ pos +" ?");
			
			Produto produto = new Produto();
			produto.setNomeproduto(nomeProduto);
			produto.setId(Integer.valueOf(idProduto));
			
			cliente1.getProdutos().add(produto);
			
		}
		
	
		
		System.out.println("Resultados de clientes: " + cliente1);
		//System.out.println("Resultados Produtos: " + cliente1.getProdutos(produto1));

	}

}
