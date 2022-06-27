package Geladeira;

public class FullStackJavaGeladeira {
	
	public String marca;
	public int capacidadeArmazenamento;
	public int voltagem;
	public int divisaoCompartimento;
	public FullStackJavaGeladeira(String marca, int capacidadeArmazenamento, int voltagem, int divisaoCompartimento) {
		super();
		this.marca = marca;
		this.capacidadeArmazenamento = capacidadeArmazenamento;
		this.voltagem = voltagem;
		this.divisaoCompartimento = divisaoCompartimento;
	}
	public FullStackJavaGeladeira() {
		super();
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCapacidadeArmazenamento() {
		return capacidadeArmazenamento;
	}
	public void setCapacidadeArmazenamento(int capacidadeArmazenamento) {
		this.capacidadeArmazenamento = capacidadeArmazenamento;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public int getDivisaoCompartimento() {
		return divisaoCompartimento;
	}
	public void setDivisaoCompartimento(int divisaoCompartimento) {
		this.divisaoCompartimento = divisaoCompartimento;
	}	

}
