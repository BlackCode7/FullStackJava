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
	
	public Aluno(){}
	public Aluno(String nomePadrao, int idadePadrao, String dataNascPadrao){
		nome = nomePadrao;
		idade = idadePadrao;
		dataNascimento = dataNascPadrao;
	}
	public Aluno(String nomePadrao, int idadePadrao, String dataNascPadrao, String registrogeralPadrao, String numeroCPFPadrao, String nomeMaePadrao, String nomePaiPadrao, String datamatriculaPadrao, String nomeEscolaPadrao, String seriematriculadoPadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
		dataNascimento = dataNascPadrao;
		registrogeral = registrogeralPadrao ;
		numeroCPF = numeroCPFPadrao;
		nomeMae = nomeMaePadrao ;
		nomePai = nomePaiPadrao ;
		datamatricula = datamatriculaPadrao;
		nomeEscola = nomeEscolaPadrao ;
		seriematriculado = seriematriculadoPadrao ;
	}
}
