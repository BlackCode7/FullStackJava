package Mouse.Execucao;

import Barco.FullStackJavaBarco;
import Moto.FullStackJavaMoto;
import Mouse.FullStackJavaMouse;
import cursojava.classes.Aluno;

public class MouseExecucao {

	public static void main(String[] args) {		
		
		/* FullStackJavaMoto */
		FullStackJavaMoto moto = new FullStackJavaMoto();
		moto.setMarcamoto("Ducati");
		moto.setCapacidadeCombustivel(20);
		moto.setQuantidadeAcentos(2);
		moto.setVelocidade(600);
		System.out.println("Marca da moto: " + moto.getMarcamoto());
		System.out.println("Capacidade combústivel : " + moto.getCapacidadeCombustivel());
		System.out.println("Acentos da moto : " + moto.getQuantidadeAcentos());
		System.out.println("Velocidade : " + moto.getVelocidade());
		
		
		/*nome idade dataNascimento*/
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Carlos Clodo");
		aluno1.setIdade(35);
		aluno1.setDataNascimento("20-07-2007");
		/* Chamando o método de calculo do aluno */
		aluno1.setBota1(50.8);
		aluno1.setBota2(70.5);
		aluno1.setBota3(80.4);
		aluno1.setBota4(80.9);
		aluno1.getMedianota();
		System.out.println("************** Alunos *************************************************");
		System.out.println("nome do aluno1: " + aluno1.getNome());
		System.out.println("idade do aluno1: " + aluno1.getIdade());
		System.out.println("data nascimento aluno1: " + aluno1.getDataNascimento());
		System.out.println("Média do Aluno1 : " + aluno1.getMedianota());
		System.out.println("Resultado : " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		
		System.out.println();				
		FullStackJavaBarco barco = new FullStackJavaBarco();
		barco.setVelocidade(150);
		barco.setQuantidadeTripulantes(150);
		barco.setTipoBarco("Catamaram");
		barco.setQuantidadeAcentos(50);
		
		System.out.println("*************** Transporte marítmo ************************************");
		System.out.println("Velocidade média da embarcação : "+barco.getVelocidade()+ "nós por 1h.");
		System.out.println("Quantidade de atripulantes no barco : "+barco.getQuantidadeTripulantes());
		System.out.println("Quantidade de acentos : "+barco.getQuantidadeAcentos());
		System.out.println("Tipo de embarcação : "+barco.getTipoBarco());
		
		System.out.println();
		System.out.println("*************** Produto Mouse *****************************************");
		FullStackJavaMouse mouse = new FullStackJavaMouse("MouseGRD", true, true, false);
		//mouse.marcaMouse = "Hashime"; // certo 1º exemplo
		mouse.setMarcaMouse("GameTrunkate Mouse"); // certo 2º exemplo
		//mouse.analogico = true;
		mouse.setAnalogico(false);
		//mouse.luminoso = true;
		mouse.setLuminoso(true);
		//mouse.scrow = true;
		mouse.setScrow(true);
		
		System.out.println("Nome da marca de maouse : " + mouse.getMarcaMouse());
		
		

	}

}
