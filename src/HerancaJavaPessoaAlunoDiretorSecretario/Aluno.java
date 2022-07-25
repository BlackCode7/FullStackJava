package HerancaJavaPessoaAlunoDiretorSecretario;

public class Aluno extends Pessoa{	
	
	private String nomeAluno;
	private String dataMatricula;
	private String serieMatriculado;
	private String disciplina;
		

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + super.idade + ", dataNascim=" + super.dataNascim + ", registroGeral="
				+ super.registroGeral + ", numeroCPF=" + super.numeroCPF + ", nomeMAE=" + super.nomeMAE + ", nomePAI=" + super.nomePAI
				+ ", nomeAluno=" + nomeAluno + ", dataMatricula=" + dataMatricula + ", serieMatriculado="
				+ serieMatriculado + ", disciplina=" + disciplina + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		super.nome = nome;
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

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
}
