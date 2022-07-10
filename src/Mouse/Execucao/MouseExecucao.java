package Mouse.Execucao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Barco.FullStackJavaBarco;
import Moto.FullStackJavaMoto;
import Mouse.FullStackJavaMouse;
import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class MouseExecucao {

	public static void main(String[] args) {		
	
		
		/*nome idade dataNascimento*/
		String nome = JOptionPane.showInputDialog("Qual o nome no aluno? ");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno? ");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento? ");
		
		String bota1 = JOptionPane.showInputDialog("Digite nota 1? ");
		String bota2 = JOptionPane.showInputDialog("Digite nota 2? ");
		String bota3 = JOptionPane.showInputDialog("Digite nota 3? ");
		String bota4 = JOptionPane.showInputDialog("Digite nota 4? ");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); // convertendo string para inteiro
		aluno1.setDataNascimento(dataNascimento);
		
		/* Chamando o método de calculo do aluno */
		aluno1.setBota1(Double.valueOf(bota1));
		aluno1.setBota2(Double.valueOf(bota2));
		aluno1.setBota3(Double.valueOf(bota3));
		aluno1.setBota4(Double.valueOf(bota4));
		aluno1.getMedianota();
		System.out.println("************** Alunos *************************************************");
		System.out.println("nome do aluno1: " + aluno1.getNome());
		System.out.println("idade do aluno1: " + aluno1.getIdade());
		System.out.println("data nascimento aluno1: " + aluno1.getDataNascimento());
		System.out.println("Média do Aluno1 : " + aluno1.getMedianota());
		System.out.println("Resultado : " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));	
		
		/* Uso do toString() para facilitar a saída de dados */
		System.out.println( aluno1.toString() + " Numeração do objeto na memória ( 3c22fc4c )" ); // tostring() mostra a numeração do objeto na memória
		System.out.println( "Média do Aluno: " + aluno1.getMedianota() );
		System.out.println( "Resultado = " + aluno1.getAlunoAprovado() );
		
		/* Lista generica */
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina1("Algoritmos");
		disciplina1.setNota1(50);
		/* Ligando o aluno com a disciplina */
		aluno1.getDisciplinas().add(disciplina1);
		
		/* Outra disciplina */
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina1("Matemática");
		disciplina2.setNota1(10);
		aluno1.getDisciplinas().add(disciplina2);
		
		System.out.println("Media do Aluno: " + aluno1.getMedianota());
		System.out.println("Resultado das provas: " + aluno1.getAlunoAprovado());
		
		
		
		//
		
		
		/* Equals() and hasCode() usado para diferenciar um objetos de outro objeto */
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Anderson");
		
		Aluno aluno4 = new Aluno();
		aluno4.setNome("Anderson");
		
		if ( aluno1.equals(aluno3) ) {
			System.out.println(" Alunos são iguais ");
		}else {
			System.out.println("Alunos diferentes");
		}

	}

}
