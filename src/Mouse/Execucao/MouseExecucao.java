package Mouse.Execucao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import constantesJava.StatusAluno;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class MouseExecucao {

	public static void main(String[] args) {

		/* Eu preciso de uma lista com todos os alunos, depois preciso separa 
		 * dentro da lista os aluno aprovados, separar alunos em recuperação, 
		 * separar alunos reprovados */
		
		/* Percorrendo o nome do aluno */
		List<Aluno> alunoS = new ArrayList<Aluno>();
		
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		
		

		for (int qtd = 1; qtd <= 5; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno" + qtd + "? ");
			Aluno aluno = new Aluno();
			aluno.setNome(nome);
			int escolha = JOptionPane.showConfirmDialog(null, " Qual disciplina deseja remover? ");
			if (escolha == 0) {
				
				int continuarRemover = 0;
				int posicao = 1;
				
				/* Using While */
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog(null, " qual disciplina 1, 2, 3 ou 4? ");
					aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, " Continuar a remover? ");
				}
			}
			alunoS.add(aluno);
		}

		/* Separação de listas de alunos aprovados, recuperação, reprovados */
		for (Aluno aluno : alunoS) {			
			if( aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO) ) {
				alunosAprovados.add(aluno);
			}
			else if( aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO) ) {
				alunosRecuperacao.add(aluno);
			}
			else {
				if( aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO) ) {
					alunosReprovados.add(aluno);
				}
			}			
		}
		
		/* Processando a lista de alunos */
		for ( Aluno aluno: alunosAprovados ) {
			System.out.println( "---------------- Lista de Alunos Aprovados ---------------------" );
			System.out.println( aluno.getAlunoAprovado2()+ " Media: " + aluno.getMedianota());
		}
		

		/* Processando a lista de alunos */
		for ( Aluno aluno: alunosRecuperacao ) {
			System.out.println( "---------------- Lista de Alunos Recuperação ---------------------" );
			System.out.println( aluno.getAlunoAprovado2() + " Media: " + aluno.getMedianota() );
		}
		
		
		/* Processando a lista de alunos */
		for ( Aluno aluno: alunosReprovados ) {
			System.out.println( "---------------- Lista de Alunos Reprovados ---------------------" );
			System.out.println( aluno.getAlunoAprovado2() + "Media: " + aluno.getMedianota() );
		}
		
	}

}
