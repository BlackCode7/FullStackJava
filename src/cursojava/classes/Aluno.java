package cursojava.classes;

public class Aluno {
	
	String nome;
	int idade;
	String dataNascimento;
	String registrogeral;
	String numeroCPF;
	String nomeMae;
	String nomePai;
	String datamatricula;
	String nomeEscola;
	String seriematriculado;		
	
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
