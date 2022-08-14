package Mouse.Execucao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import constantesJava.StatusAluno;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class MouseExecucao {

	public static void main(String[] args) throws FileNotFoundException {
		/* Eu preciso de uma lista com todos os alunos, depois preciso separa 
		 * dentro da lista os aluno aprovados, separar alunos em recuperação, 
		 * separar alunos reprovados */		
		/* Percorrendo o nome do aluno 
				
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();*/
		
		/* Separando as listas com HashMap o hashmap é uma lista que dentro dela
		 * EXISTE uma chave que identifica um valor*/
		
		/* Validação simples de usuários */
		
		try {
			
			//File fil = new File("arquivo.txt");
			
			//Scanner scanner = new Scanner(fil);
			
			
			String login = JOptionPane.showInputDialog("Qual o seu login? ");
			String senha = JOptionPane.showInputDialog("Qual a sua senha? ");
			
			if( login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) { //Validação de permissão de acesso

				HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
				
				List<Aluno> alunos = new ArrayList<Aluno>();
						
				for (int qtd = 1; qtd <= 5; qtd++) {
					
					String nome = JOptionPane.showInputDialog("Qual o nome do aluno" + qtd + "? ");
					
					Aluno aluno1 = new Aluno();//null;//
					aluno1.setNome(nome);
					
					for ( int pos = 1; pos <= 1; pos++ ) {
						
						String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
						String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
						Disciplina disciplina = new Disciplina();
						disciplina.setDisciplina1(nomeDisciplina);
						disciplina.setNota1(Double.valueOf(notaDisciplina));
						
						aluno1.getDisciplinas().add(disciplina);				
					}
					
					int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover disciplina? ");
					if( escolha == 0 ) {
						int continuarRemover = 0;
						int posicao = 1;
						
						while( continuarRemover == 0 ) {
							String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina quer remover 1,2,3 ou 4 ?");
							aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
							posicao ++ ;
							continuarRemover = JOptionPane.showConfirmDialog(null, " Continuar removendo ? ");
						}
					}
					
					alunos.add(aluno1);
				}
				
				maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
				maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
				maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

				/* Separação de listas de alunos aprovados, recuperação, reprovados */
				for (Aluno aluno : alunos) {			
					if( aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO) ) {
						maps.get(StatusAluno.APROVADO).add(aluno);
					}
					else if( aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO) ) {
						maps.get(StatusAluno.RECUPERACAO).add(aluno);
					}
					else {
						if( aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO) ) {
							maps.get(StatusAluno.REPROVADO).add(aluno);
						}
					}			
				}				
				
				/* Processando a lista de alunos */
				for ( Aluno aluno: maps.get(StatusAluno.APROVADO) ) {
					System.out.println( "---------------- Lista de Alunos Aprovados ---------------------" );
					System.out.println( aluno.getAlunoAprovado2()+ " Media: " + aluno.getMedianota());
				}
				
				/* Processando a lista de alunos */
				for ( Aluno aluno: maps.get(StatusAluno.RECUPERACAO) ) {
					System.out.println( "---------------- Lista de Alunos Recuperação ---------------------" );
					System.out.println( aluno.getAlunoAprovado2() + " Media: " + aluno.getMedianota() );
				}
						
				/* Processando a lista de alunos */
				for ( Aluno aluno: maps.get(StatusAluno.REPROVADO) ) {
					System.out.println( "---------------- Lista de Alunos Reprovados ---------------------" );
					System.out.println( aluno.getAlunoAprovado2() + "Media: " + aluno.getMedianota() );
				}
			}
		}catch (NumberFormatException e) {
			
			StringBuilder saida = new StringBuilder();
			

			e.printStackTrace();
			
			// Mensagem do erro ou causa
			System.out.println("Pegando o erro >>> " + e.getMessage());
			
			// Retorna um array - é utilizado com for(){}
			System.out.println(e.getStackTrace());
			for( int pos=0; pos < e.getStackTrace().length; pos++ ) {
				saida.append(e.getStackTrace()[pos].getClassName());
				saida.append(e.getStackTrace()[pos].getMethodName());
				saida.append(e.getStackTrace()[pos].getLineNumber());
			}
			
			JOptionPane.showMessageDialog(null, "Erros foram encontrados no processamento!" + saida.toString());
			
		}catch( NullPointerException e ) {
			System.out.println("Capturando o NullPointerException : " + e.getClass());
		}catch( IndexOutOfBoundsException e ) {
			System.out.println(" Capturando erro IndexOutOfBoundsException : " + e.getClass());
			
			for( int pos=0; pos < e.getStackTrace().length; pos++ ) {
				System.out.println(e.getStackTrace()[pos].getLineNumber());
			}
			
		}
		
		
	}

}
