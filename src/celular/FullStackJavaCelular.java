package celular;

public class FullStackJavaCelular {
	
	public String marca;
	public boolean acessoInternet;
	public boolean processador;
	public boolean capaProtecao;
	public String codigoSeguranca;
	public String dispositivoSom;
	public boolean possuiLanterna;
	public boolean modoAviao;
	public FullStackJavaCelular(String marca, boolean acessoInternet, boolean processador, boolean capaProtecao,
			String codigoSeguranca, String dispositivoSom, boolean possuiLanterna, boolean modoAviao) {
		super();
		this.marca = marca;
		this.acessoInternet = acessoInternet;
		this.processador = processador;
		this.capaProtecao = capaProtecao;
		this.codigoSeguranca = codigoSeguranca;
		this.dispositivoSom = dispositivoSom;
		this.possuiLanterna = possuiLanterna;
		this.modoAviao = modoAviao;
	}
	public FullStackJavaCelular() {
		super();
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isAcessoInternet() {
		return acessoInternet;
	}
	public void setAcessoInternet(boolean acessoInternet) {
		this.acessoInternet = acessoInternet;
	}
	public boolean isProcessador() {
		return processador;
	}
	public void setProcessador(boolean processador) {
		this.processador = processador;
	}
	public boolean isCapaProtecao() {
		return capaProtecao;
	}
	public void setCapaProtecao(boolean capaProtecao) {
		this.capaProtecao = capaProtecao;
	}
	public String getCodigoSeguranca() {
		return codigoSeguranca;
	}
	public void setCodigoSeguranca(String codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}
	public String getDispositivoSom() {
		return dispositivoSom;
	}
	public void setDispositivoSom(String dispositivoSom) {
		this.dispositivoSom = dispositivoSom;
	}
	public boolean isPossuiLanterna() {
		return possuiLanterna;
	}
	public void setPossuiLanterna(boolean possuiLanterna) {
		this.possuiLanterna = possuiLanterna;
	}
	public boolean isModoAviao() {
		return modoAviao;
	}
	public void setModoAviao(boolean modoAviao) {
		this.modoAviao = modoAviao;
	}
}
