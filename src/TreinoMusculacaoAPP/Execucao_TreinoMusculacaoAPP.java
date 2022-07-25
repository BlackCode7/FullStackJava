package TreinoMusculacaoAPP;

public class Execucao_TreinoMusculacaoAPP {

	public static void main(String[] args) {
		
		Exercicio exercicio1 = new Exercicio();
		exercicio1.setCargaKgExercicio((long) 20);
		exercicio1.setIdExercicio((long) 1);
		exercicio1.setNomeExercicio("Peito");
		exercicio1.setNumeroRepeticao((long)4);
		exercicio1.setNumeroSerie((long)3);
		exercicio1.getCargaGeralTrabalho();

		Exercicio exercicio2 = new Exercicio();
		exercicio2.setCargaKgExercicio((long) 30);
		exercicio2.setIdExercicio((long) 2);
		exercicio2.setNomeExercicio("Perna");
		exercicio2.setNumeroRepeticao((long)14);
		exercicio2.setNumeroSerie((long)3);
		exercicio2.getCargaGeralTrabalho();
		
		Exercicio exercicio3 = new Exercicio();
		exercicio3.setCargaKgExercicio((long) 80);
		exercicio3.setIdExercicio((long) 3);
		exercicio3.setNomeExercicio("Costa");
		exercicio3.setNumeroRepeticao((long)15);
		exercicio3.setNumeroSerie((long)3);
		exercicio3.getCargaGeralTrabalho();
		//System.out.println(" Exercícios treinado =  "+exercicio1 +"/// "+ exercicio2 + " /// "+ exercicio3);
		
		Serie serie = new Serie();
		serie.setIdSerie((long) 1);
		serie.setNomeSerie("Peito");
		serie.getListExercicio().add(exercicio1);
		serie.getListExercicio().add(exercicio2);
		serie.getListExercicio().add(exercicio3);
		//System.out.println(" Exercicios na Serie >>> "+serie);
		//System.out.println(" Exercicios na Serie >>> "+serie.getListExercicio().add(exercicio1));
		
		Usuario user1 = new Usuario();
		user1.setIdUser((long)1);
		user1.setNomeUser("Carlos");
		user1.getListSerie().add(serie);
		
		System.out.println(" Usuario_1 /user1.getListSerie()/ /// " + user1.getListSerie() );
		
		System.out.println();
		
		//funcaoTogetterUserSerie( user1, serie );
		
	}
	
	public static void funcaoTogetterUserSerie( Usuario user, Serie serie ) {
		
		for( Exercicio exercico: serie.getListExercicio() ) {
			System.out.println(exercico);
		}
		
	}

}
