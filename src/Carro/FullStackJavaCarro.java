package Carro;

public class FullStackJavaCarro {
	
	public String cor;
	public int assentos;
	public int velocidade;
	public boolean importado;
	public double valor;
	public FullStackJavaCarro(String cor, int assentos, int velocidade, boolean importado, double valor) {
		super();
		this.cor = cor;
		this.assentos = assentos;
		this.velocidade = velocidade;
		this.importado = importado;
		this.valor = valor;
	}
	public FullStackJavaCarro() {
		super();
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAssentos() {
		return assentos;
	}
	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public boolean isImportado() {
		return importado;
	}
	public void setImportado(boolean importado) {
		this.importado = importado;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

}
