package HerancaJavaPessoaAlunoDiretorSecretario;

public class Execucao_HerancaJavaPessoaAlunoDiretorSecretario {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Diretor diretor = new Diretor();
		Secretario secretario = new Secretario();
		
		aluno.setNomeAluno("Ander");
		aluno.setNomeMAE("Maria");
		aluno.setNomePAI("Adil");
		aluno.setDataMatricula("07/07/1980");
		
		diretor.setNome("Carlos");
		diretor.setRegistroGeral("22125");
		
		secretario.setNome("Andre");
		secretario.setRegistro(3235545);

	}

}
