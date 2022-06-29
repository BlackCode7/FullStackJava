package cursojava.classes;

public class Aluno {
	
	/* Esses valores aqui são os atributo do objeto */
	public String nome;
	public int idade;
	public String dataNascimento;
	public String registrogeral;
	public String numeroCPF;
	public String nomeMae;
	public String nomePai;
	public String datamatricula;
	public String nomeEscola;
	public String seriematriculado;	
	
	public double bota1;
	public double bota2;
	public double bota3;
	public double bota4;
	
	public Aluno(){}
	public Aluno(String nomePadrao, int idadePadrao, String dataNascPadrao){
		this.nome = nomePadrao;
		this.idade = idadePadrao;
		this.dataNascimento = dataNascPadrao;
	}
	public Aluno(String nomePadrao, int idadePadrao, String dataNascPadrao, String registrogeralPadrao, String numeroCPFPadrao, String nomeMaePadrao, String nomePaiPadrao, String datamatriculaPadrao, String nomeEscolaPadrao, String seriematriculadoPadrao) {
		this.nome = nomePadrao;
		this.idade = idadePadrao;
		this.dataNascimento = dataNascPadrao;
		this.registrogeral = registrogeralPadrao ;
		this.numeroCPF = numeroCPFPadrao;
		this.nomeMae = nomeMaePadrao ;
		this.nomePai = nomePaiPadrao ;
		this.datamatricula = datamatriculaPadrao;
		this.nomeEscola = nomeEscolaPadrao ;
		this.seriematriculado = seriematriculadoPadrao ;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistrogeral() {
		return registrogeral;
	}
	public void setRegistrogeral(String registrogeral) {
		this.registrogeral = registrogeral;
	}
	public String getNumeroCPF() {
		return numeroCPF;
	}
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getDatamatricula() {
		return datamatricula;
	}
	public void setDatamatricula(String datamatricula) {
		this.datamatricula = datamatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSeriematriculado() {
		return seriematriculado;
	}
	public void setSeriematriculado(String seriematriculado) {
		this.seriematriculado = seriematriculado;
	}
	public double getBota1() {
		return bota1;
	}
	public void setBota1(double bota1) {
		this.bota1 = bota1;
	}
	public double getBota2() {
		return bota2;
	}
	public void setBota2(double bota2) {
		this.bota2 = bota2;
	}
	public double getBota3() {
		return bota3;
	}
	public void setBota3(double bota3) {
		this.bota3 = bota3;
	}
	public double getBota4() {
		return bota4;
	}
	public void setBota4(double bota4) {
		this.bota4 = bota4;
	}

	/* Métodos de calculo de médias */
	public double getMedianota() {
		return (bota1 + bota2 + bota3 + bota4)/4;
	}

}
