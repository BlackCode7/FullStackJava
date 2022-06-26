package executavel;

import cursojava.classes.Aluno;

public class Execucao {
	
	/* Classe usada pra executar e chamar os objetos de outras classes */

	public static void main(String[] args) {
		
		/* Instânciando um objeto aluno */
		Aluno aluno1 = new Aluno();
		aluno1.getClass();

		Aluno aluno2 = new Aluno();
		aluno1.getClass();
		
		Aluno aluno3 = new Aluno( "Carlos", 32, "20-02-1980" );
		aluno1.getClass();
		
		Aluno aluno4 = new Aluno( "Anderson", 12, "12-12-2010", "", "8878777887-9", "Maria", "Carlos", "20-10-2015", "SantaTereza", "1121254" );
		aluno1.getClass();
		
	}

}
