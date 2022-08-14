package BookPaulDeitel_ClassShape.Shapes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExecuteShapes {

	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog(
				"Digite 1 para desenhar o retangulo: " +
				"Digite 2 para desenhar o oval: ");
		int choice = Integer.parseInt(input); // Converte a entrad a do usuario
		
		Shapes panel = new Shapes(choice); // Cria um painel coma  entrada do usuario
		JFrame application = new JFrame(); //Cria um novo frame
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(300, 300);
		application.setVisible(true);

	}

}
