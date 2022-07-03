package ClienteNewKnoledge;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClienteNewKnoledge {

	private String nome;
	private int idade;
	private String endereco;
	
	private List<Produto> produtos = new ArrayList<Produto>();
	

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public ClienteNewKnoledge(String nome, int idade, String endereco) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}

	public ClienteNewKnoledge() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(endereco, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteNewKnoledge other = (ClienteNewKnoledge) obj;
		return Objects.equals(endereco, other.endereco) && idade == other.idade && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "ClienteNewKnoledge [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
