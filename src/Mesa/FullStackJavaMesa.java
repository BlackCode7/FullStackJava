package Mesa;

public class FullStackJavaMesa {
	
	String marca;
	int medidas;
	int numAcentos;
	String tipomaterial;
	public FullStackJavaMesa(String marca, int medidas, int numAcentos, String tipomaterial) {
		super();
		this.marca = marca;
		this.medidas = medidas;
		this.numAcentos = numAcentos;
		this.tipomaterial = tipomaterial;
	}
	public FullStackJavaMesa() {
		super();
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getMedidas() {
		return medidas;
	}
	public void setMedidas(int medidas) {
		this.medidas = medidas;
	}
	public int getNumAcentos() {
		return numAcentos;
	}
	public void setNumAcentos(int numAcentos) {
		this.numAcentos = numAcentos;
	}
	public String getTipomaterial() {
		return tipomaterial;
	}
	public void setTipomaterial(String tipomaterial) {
		this.tipomaterial = tipomaterial;
	}

}
