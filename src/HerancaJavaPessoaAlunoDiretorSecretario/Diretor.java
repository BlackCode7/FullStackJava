package HerancaJavaPessoaAlunoDiretorSecretario;

public class Diretor extends Pessoa {
		
	private int registroEducacao;
	private String tempoDirecao;
	private String titulacao;
	
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + "]";
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
	public String getDataNascim() {
		return dataNascim;
	}
	public void setDataNascim(String dataNascim) {
		this.dataNascim = dataNascim;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCPF() {
		return numeroCPF;
	}
	public void setNumeroCPF(String numeroCPF) {
		this.numeroCPF = numeroCPF;
	}
	public String getNomeMAE() {
		return nomeMAE;
	}
	public void setNomeMAE(String nomeMAE) {
		this.nomeMAE = nomeMAE;
	}
	public String getNomePAI() {
		return nomePAI;
	}
	public void setNomePAI(String nomePAI) {
		this.nomePAI = nomePAI;
	}
	public int getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(int registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public String getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(String tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

}
