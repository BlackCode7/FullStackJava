package Mouse.Execucao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class MouseExecucao {

	public static void main(String[] args) {
		
		/* Percorrendo o nome do aluno */
		List<Aluno> alunos = new ArrayList<Aluno>();
		for( int qtd = 1; qtd <= 2; qtd++ ) {
			
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno" + qtd + "? ");		
			Aluno aluno1 = new Aluno();
			aluno1.setNome(nome);
			int escolha = JOptionPane.showConfirmDialog(null, " Qual disciplina deseja remover? ");
			if( escolha == 0 ) {			
				int continuarRemover = 0;
				int posicao = 1;			
				/* Using While */
				while( continuarRemover == 0 ) {
					String disciplinaRemover = JOptionPane.showInputDialog(null, " qual disciplina 1, 2, 3 ou 4? ");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);				
					posicao ++;
					continuarRemover = JOptionPane.showConfirmDialog(null, " Continuar a remover? ");
				}			
			}			
			alunos.add(aluno1);			
		}		
		
		/* Percorrendo a lista de alunos */
		for (Aluno aluno : alunos) {			
			System.out.println(aluno);
			System.out.println("Média Aluno: " + aluno.getMedianota() );
			System.out.println("Resultado aluno: " + aluno.getAlunoAprovado() );
			System.out.println("#####################################################################");
		}

		
	}

}
