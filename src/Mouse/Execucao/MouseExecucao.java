package Mouse.Execucao;

import javax.swing.JOptionPane;

import Barco.FullStackJavaBarco;
import Moto.FullStackJavaMoto;
import Mouse.FullStackJavaMouse;
import cursojava.classes.Aluno;

public class MouseExecucao {

	public static void main(String[] args) {		
	
		
		/*nome idade dataNascimento*/
		/*String nome = JOptionPane.showInputDialog("Qual o nome no aluno? ");
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
		/*aluno1.setBota1(Double.valueOf(bota1));
		aluno1.setBota2(Double.valueOf(bota2));
		aluno1.setBota3(Double.valueOf(bota3));
		aluno1.setBota4(Double.valueOf(bota4));
		aluno1.getMedianota();
		System.out.println("************** Alunos *************************************************");
		System.out.println("nome do aluno1: " + aluno1.getNome());
		System.out.println("idade do aluno1: " + aluno1.getIdade());
		System.out.println("data nascimento aluno1: " + aluno1.getDataNascimento());
		System.out.println("Média do Aluno1 : " + aluno1.getMedianota());
		System.out.println("Resultado : " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));	*/
		
		/* Uso do toString() para facilitar a saída de dados 
		System.out.println( aluno1.toString() + " Numeração do objeto na memória ( 3c22fc4c )" ); // tostring() mostra a numeração do objeto na memória
		System.out.println( "Média do Aluno: " + aluno1.getMedianota() );
		System.out.println( "Resultado = " + aluno1.getAlunoAprovado() );*/
		
		
		/* FullStackJavaMoto 
		FullStackJavaMoto moto = new FullStackJavaMoto();
		moto.setMarcamoto("Ducati");
		moto.setCapacidadeCombustivel(20);
		moto.setQuantidadeAcentos(2);
		moto.setVelocidade(600);
		System.out.println("Marca da moto: " + moto.getMarcamoto());
		System.out.println("Capacidade combústivel : " + moto.getCapacidadeCombustivel());
		System.out.println("Acentos da moto : " + moto.getQuantidadeAcentos());
		System.out.println("Velocidade : " + moto.getVelocidade());*/
		
		
		/*
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
		System.out.println("Tipo de embarcação : "+barco.getTipoBarco());*/
		
		/*
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
		
		System.out.println("Nome da marca de maouse : " + mouse.getMarcaMouse());*/
		
		/* Equals() and hasCode() usado para diferenciar um objetos de outro objeto */
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Anderson");
		
		Aluno aluno2 = new Aluno();
		aluno1.setNome("Anderson");
		
		if ( aluno1.equals(aluno2) ) {
			System.out.println(" Alunos são iguais ");
		}else {
			System.out.println("Alunos diferentes");
		}

	}

}
