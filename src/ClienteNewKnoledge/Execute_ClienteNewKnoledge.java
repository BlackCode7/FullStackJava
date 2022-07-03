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
	
		Produto produto1 = new Produto();
		produto1.setNomeproduto("Carro");
		produto1.setId(Integer.valueOf(32));
		
		Produto produto2 = new Produto();
		produto2.setNomeproduto("Carro2");
		produto2.setId(Integer.valueOf(322));
				
		/* Juntando os dois objetos */		
		cliente1.getProdutos().add(produto1);
		cliente1.getProdutos().add(produto2);
		
		System.out.println("Resultados de clientes: " + cliente1);
		//System.out.println("Resultados Produtos: " + cliente1.getProdutos(produto1));

	}

}
