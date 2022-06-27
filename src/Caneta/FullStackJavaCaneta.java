package Caneta;

public class FullStackJavaCaneta {
	
	String marcaCaneta;
	boolean pontaFina;
	boolean clipePrendedor;
	String cor;
	public FullStackJavaCaneta(String marcaCaneta, boolean pontaFina, boolean clipePrendedor, String cor) {
		super();
		this.marcaCaneta = marcaCaneta;
		this.pontaFina = pontaFina;
		this.clipePrendedor = clipePrendedor;
		this.cor = cor;
	}
	public FullStackJavaCaneta() {
		super();
	}
	public String getMarcaCaneta() {
		return marcaCaneta;
	}
	public void setMarcaCaneta(String marcaCaneta) {
		this.marcaCaneta = marcaCaneta;
	}
	public boolean isPontaFina() {
		return pontaFina;
	}
	public void setPontaFina(boolean pontaFina) {
		this.pontaFina = pontaFina;
	}
	public boolean isClipePrendedor() {
		return clipePrendedor;
	}
	public void setClipePrendedor(boolean clipePrendedor) {
		this.clipePrendedor = clipePrendedor;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}
