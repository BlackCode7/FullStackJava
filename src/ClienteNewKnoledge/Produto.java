package ClienteNewKnoledge;

import java.util.Objects;

public class Produto {

	private int id;
	private String nomeproduto;

	public Produto(int id, String nomeproduto) {
		super();
		this.id = id;
		this.nomeproduto = nomeproduto;
	}

	public Produto() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nomeproduto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return id == other.id && Objects.equals(nomeproduto, other.nomeproduto);
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nomeproduto=" + nomeproduto + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}

}
