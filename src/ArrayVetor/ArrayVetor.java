package ArrayVetor;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		
		
		// Setting very dinamic insertion of arrays
		String posicoes = JOptionPane.showInputDialog("Digite o numero de arays desejado:  ");
		// Array sempre deve ter uma quantidade de posições definidas
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		if( notas != null ) {
			for ( int pos = 0; pos < notas.length; pos++ ) {
				String valor = JOptionPane.showInputDialog( "Qual o valor da posição = " + pos);
				notas[pos] = Double.valueOf(valor);
				System.out.println(notas[pos]);
			}
			for ( int pos = 0; pos < notas.length; pos++ ) {
				System.out.println("Nota " + pos+1 +" é = "+ notas[pos]);
			}
		}
		
		
		/* podemos ter todos os tipos de dados e objetos 
		notas[0] = 9.8;
		notas[1] = 90.4;
		notas[2] = 2.3;*/
		
		//System.out.println(notas);
		//Access value in nota
		//System.out.println(notas[0]);
		//System.out.println(notas[1]);
		//System.out.println(notas[2]);
		//Access value out of Array - Error -> ArrayIndexOutOfBoundsException
		//System.out.println(notas[3]);
		
		/* Access using for(){} */
		//for(double x: notas) {
		//	System.out.println("Arrays in for loop: " + x);
		//}
		//for(int pos = 0; pos < notas.length; pos++) {
		//	System.out.println("Notas " + pos + " é = " + notas[pos]);
		//}
		
	}

}
