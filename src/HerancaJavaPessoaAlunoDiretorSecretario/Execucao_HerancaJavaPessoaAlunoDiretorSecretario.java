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
		aluno.setIdade(12);
		aluno.pessoaMaiorIdade();
		
		diretor.setNome("Carlos");
		diretor.setRegistroGeral("22125");
		diretor.setIdade(52);
		
		secretario.setNome("Andre");
		secretario.setRegistro(3235545);
		secretario.setIdade(32);
		
		System.out.println("Idade Aluno: " + aluno.getIdade()+" maoir idade? "+ aluno.msgMaoirIdade());
		System.out.println("Idade Diretor: " + diretor.getIdade()+" maoir idade? "+ diretor.pessoaMaiorIdade());
		System.out.println("Idade Secretário: " + secretario.getIdade()+" maoir idade? "+ secretario.pessoaMaiorIdade());
		
		System.out.println("salario aluno: " + aluno.salario());
		System.out.println("salario diretor: " + diretor.salario());
		System.out.println("salario Secretário: " + secretario.salario());
		
		
	}

}
 