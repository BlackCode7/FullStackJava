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

		for (int qtd = 1; qtd <= 2; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno" + qtd + "? ");
			Aluno aluno1 = new Aluno();
			aluno1.setNome(nome);
			int escolha = JOptionPane.showConfirmDialog(null, " Qual disciplina deseja remover? ");
			if (escolha == 0) {
				int continuarRemover = 0;
				int posicao = 1;
				/* Using While */
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog(null, " qual disciplina 1, 2, 3 ou 4? ");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, " Continuar a remover? ");
				}
			}
			alunos.add(aluno1);
		}

		
		/* Substituindo um aluno na lista */
		for( int pos=0; pos < alunos.size(); pos++ ) {
			
			Aluno aluno1 = alunos.get(pos);
			
			if( aluno1 .getNome().equalsIgnoreCase("Anderson") ) {
				Aluno troca = new Aluno();
				troca.setNome("Aluno trocado");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina1("Matemática");
				disciplina.setNota1(100);
				
				troca.getDisciplinas().add(disciplina);
				
				/* Aqui troca o aluno - pra isso precisa ter a posição do aluno na lista */
				alunos.set(pos, troca);
				aluno1 = alunos.get(pos);
				
			}
			
			Aluno aluno = alunos.get(pos);
			System.out.println("aluno " + aluno.getNome());
			System.out.println("Media do aluno " + aluno.getMedianota());
			System.out.println("Aluno aprovado ou não " + aluno.getAlunoAprovado2());
			System.out.println("-------------------------------------------------------");
			
			/* Percorrendo as disciplinas pelas posições das listas associadas ao aluno */
			for ( int posdis=0; posdis < aluno.getDisciplinas().size(); posdis++ ) {
				Disciplina disc = aluno.getDisciplinas().get(posdis);
				System.out.println( "Materia = " + disc.getDisciplina1() + " Nota =  " + disc.getNota1());
			}
			
		}

		
		/* Percorrendo lista pelas posições */
		for( int pos=0; pos < alunos.size(); pos++ ) {
			Aluno aluno = alunos.get(pos);
			System.out.println("aluno " + aluno.getNome());
			System.out.println("Media do aluno " + aluno.getMedianota());
			System.out.println("Aluno aprovado ou não " + aluno.getAlunoAprovado2());
			System.out.println("-------------------------------------------------------");
			
			/* Percorrendo as disciplinas pelas posições das listas associadas ao aluno */
			for ( int posdis=0; posdis < aluno.getDisciplinas().size(); posdis++ ) {
				Disciplina disc = aluno.getDisciplinas().get(posdis);
				System.out.println( "Materia = " + disc.getDisciplina1() + " Nota =  " + disc.getNota1());
			}
			
		}
		
		
		/* Pegando Alunos com disciplinas relacionadas usando for(){} / */
		for( Aluno aluno: alunos ) {
			System.out.println(aluno);
			System.out.println("Média Aluno: " + aluno.getMedianota());
			System.out.println("Resultado aluno: " + aluno.getAlunoAprovado());
			System.out.println("#####################################################################");
			for( Disciplina disciplina: aluno.getDisciplinas()){
				System.out.println( disciplina.getDisciplina1() );
			}
		}
		
		/* Procurando e removendo um aluno da lista */
		for ( Aluno aluno: alunos ) {
			if(aluno.getNome().equalsIgnoreCase("Anderson")) {
				alunos.remove(aluno);
				break;
			}else {				
				System.out.println(aluno);
				System.out.println("Média Aluno: " + aluno.getMedianota());
				System.out.println("Resultado aluno: " + aluno.getAlunoAprovado());
				System.out.println("#####################################################################");				
				break;
			}
		}

		/* Percorrendo a lista de alunos */ 
		/*
		 * for (Aluno aluno : alunos) {
			if (aluno.getNome().equalsIgnoreCase("Anderson")) {				
				alunos.remove(aluno);				
				System.out.println(aluno);
				System.out.println("Média Aluno: " + aluno.getMedianota());
				System.out.println("Resultado aluno: " + aluno.getAlunoAprovado());
				System.out.println("#####################################################################");				
				break;
			}
		}
		
		*/
		
		

	}

}
