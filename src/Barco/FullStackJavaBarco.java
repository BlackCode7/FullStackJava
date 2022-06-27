package Barco;

public class FullStackJavaBarco {
	
	String tipoBarco;
	int quantidadeTripulantes;
	int quantidadeAcentos;
	int velocidade;
	public FullStackJavaBarco(String tipoBarco, int quantidadeTripulantes, int quantidadeAcentos, int velocidade) {
		super();
		this.tipoBarco = tipoBarco;
		this.quantidadeTripulantes = quantidadeTripulantes;
		this.quantidadeAcentos = quantidadeAcentos;
		this.velocidade = velocidade;
	}
	public FullStackJavaBarco() {
		super();
	}
	public String getTipoBarco() {
		return tipoBarco;
	}
	public void setTipoBarco(String tipoBarco) {
		this.tipoBarco = tipoBarco;
	}
	public int getQuantidadeTripulantes() {
		return quantidadeTripulantes;
	}
	public void setQuantidadeTripulantes(int quantidadeTripulantes) {
		this.quantidadeTripulantes = quantidadeTripulantes;
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
