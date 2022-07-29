package HerancaJavaPessoaAlunoDiretorSecretario;

public class Pessoa {
	
	protected String nome;
	protected int idade;
	protected String dataNascim;
	protected String registroGeral;
	protected String numeroCPF;
	protected String nomeMAE;
	protected String nomePAI;	
	
	public Pessoa() {
		super();
	}	
	
	public boolean pessoaMaiorIdade() {
		return idade >= 18;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", dataNascim=" + dataNascim + ", registroGeral="
				+ registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMAE=" + nomeMAE + ", nomePAI=" + nomePAI + "]";
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

}
