package Moto;

public class FullStackJavaMoto {
	
	public String marcamoto;
	public int capacidadeCombustivel;
	public int quantidadeAcentos;
	public int velocidade;
	public FullStackJavaMoto(String marcamoto, int capacidadeCombustivel, int quantidadeAcentos, int velocidade) {
		super();
		this.marcamoto = marcamoto;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.quantidadeAcentos = quantidadeAcentos;
		this.velocidade = velocidade;
	}
	public FullStackJavaMoto() {
		super();
	}
	public String getMarcamoto() {
		return marcamoto;
	}
	public void setMarcamoto(String marcamoto) {
		this.marcamoto = marcamoto;
	}
	public int getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}
	public void setCapacidadeCombustivel(int capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}
	public int getQuantidadeAcentos() {
		return quantidadeAcentos;
	}
	public void setQuantidadeAcentos(int quantidadeAcentos) {
		this.quantidadeAcentos = quantidadeAcentos;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

}
