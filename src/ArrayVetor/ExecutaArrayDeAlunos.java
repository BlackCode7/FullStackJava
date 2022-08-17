package ArrayVetor;


import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ExecutaArrayDeAlunos {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Alexx");
		aluno.setNomeEscola("JdevTreinamentos");
		
		Disciplina disciplina = new Disciplina();		
		disciplina.setDisciplina1("Curso java");		
		double[] nota = { 1.90, 2.99, 3.3, 4.34 };
		disciplina.setNota1( nota );		
		/* Amarrando aluno com disciplina*/
		aluno.getDisciplinas().add(disciplina);
		
		double[] nota2 = { 1.93, 9.99, 9.3, 9.34 };
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina1("Logica");
		disciplina2.setNota1(nota2);
		
		aluno.getDisciplinas().add(disciplina2);

	}

}
