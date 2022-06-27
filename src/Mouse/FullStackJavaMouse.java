package Mouse;

public class FullStackJavaMouse {
	
	public String marcaMouse;
	public boolean analogico;
	public boolean luminoso;
	public boolean scrow;
	
	public FullStackJavaMouse(String marcaMouse, boolean analogico, boolean luminoso, boolean scrow) {
		super();
		this.marcaMouse = marcaMouse;
		this.analogico = analogico;
		this.luminoso = luminoso;
		this.scrow = scrow;
	}

	public String getMarcaMouse() {
		return marcaMouse;
	}

	public void setMarcaMouse(String marcaMouse) {
		this.marcaMouse = marcaMouse;
	}

	public boolean isAnalogico() {
		return analogico;
	}

	public void setAnalogico(boolean analogico) {
		this.analogico = analogico;
	}

	public boolean isLuminoso() {
		return luminoso;
	}

	public void setLuminoso(boolean luminoso) {
		this.luminoso = luminoso;
	}

	public boolean isScrow() {
		return scrow;
	}

	public void setScrow(boolean scrow) {
		this.scrow = scrow;
	}
	
}
