package Aviao;

public class FullStackJavaAviao {
	
	public int quantidadeCombustivel;
	public int quantidadeAcentos;
	public boolean servicoBordo;
	public String itinerarioDeVoo;
	public FullStackJavaAviao(int quantidadeCombustivel, int quantidadeAcentos, boolean servicoBordo,
			String itinerarioDeVoo) {
		super();
		this.quantidadeCombustivel = quantidadeCombustivel;
		this.quantidadeAcentos = quantidadeAcentos;
		this.servicoBordo = servicoBordo;
		this.itinerarioDeVoo = itinerarioDeVoo;
	}
	public FullStackJavaAviao() {
		super();
	}
	public int getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	public void setQuantidadeCombustivel(int quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	public int getQuantidadeAcentos() {
		return quantidadeAcentos;
	}
	public void setQuantidadeAcentos(int quantidadeAcentos) {
		this.quantidadeAcentos = quantidadeAcentos;
	}
	public boolean isServicoBordo() {
		return servicoBordo;
	}
	public void setServicoBordo(boolean servicoBordo) {
		this.servicoBordo = servicoBordo;
	}
	public String getItinerarioDeVoo() {
		return itinerarioDeVoo;
	}
	public void setItinerarioDeVoo(String itinerarioDeVoo) {
		this.itinerarioDeVoo = itinerarioDeVoo;
	}

}
