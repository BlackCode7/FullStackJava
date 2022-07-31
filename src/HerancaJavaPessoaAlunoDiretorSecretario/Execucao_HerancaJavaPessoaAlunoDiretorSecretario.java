package HerancaJavaPessoaAlunoDiretorSecretario;

import javax.swing.JOptionPane;

import HerancaJavaPessoaAlunoDiretorSecretario.classesAuxiliares.FuncaoAutenticacao;
import HerancaJavaPessoaAlunoDiretorSecretario.interfaces.PermitirAcesso;

public class Execucao_HerancaJavaPessoaAlunoDiretorSecretario {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Diretor diretor = new Diretor();
		//Secretario secretario = new Secretario();
		
		String login = JOptionPane.showInputDialog("Informe login: ");
		String senha = JOptionPane.showInputDialog("Informe senha: ");
		
		//FuncaoAutenticacao acess = new FuncaoAutenticacao();
		
		PermitirAcesso secretario = new Secretario(login, senha);
		
		if( secretario.autenticar() ) { 
			aluno.setNomeAluno("Ander");
			aluno.setNomeMAE("Maria");
			aluno.setNomePAI("Adil");
			aluno.setDataMatricula("07/07/1980");
			aluno.setIdade(12);
			aluno.pessoaMaiorIdade();
			
			diretor.setNome("Carlos");
			diretor.setRegistroGeral("22125");
			diretor.setIdade(52);
			
			((Secretario) secretario).setNome("Andre");
			((Secretario) secretario).setRegistro(3235545);
			((Secretario) secretario).setIdade(32);
			
			System.out.println("Idade Aluno: " + aluno.getIdade()+" maoir idade? "+ aluno.msgMaoirIdade());
			System.out.println("Idade Diretor: " + diretor.getIdade()+" maoir idade? "+ diretor.pessoaMaiorIdade());
			System.out.println("Idade Secretário: " + ((Secretario) secretario).getIdade()+" maoir idade? "+ ((Secretario) secretario).pessoaMaiorIdade());
			
			System.out.println("salario aluno: " + aluno.salario());
			System.out.println("salario diretor: " + diretor.salario());
			System.out.println("salario Secretário: " + ((Secretario) secretario).salario());
			
			Pessoa pessoa = new Aluno();
			pessoa = (Pessoa) secretario;
			
			teste(aluno);
			teste(diretor);
			teste((Pessoa) secretario);
		}
		else {
			System.out.println("Você não tem um login e senha!!!");
		}
				
	}
	
	public static void teste(Pessoa pessoa ) {
		System.out.println("Nome pessoa: " + pessoa.getNome() 
		+ " Salario " + pessoa.salario() );		
	}

}
 















