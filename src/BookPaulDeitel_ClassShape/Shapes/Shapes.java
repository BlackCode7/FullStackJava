package BookPaulDeitel_ClassShape.Shapes;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Shapes extends JPanel{

	private int choice; // Escolha do usuario
	
	//Construtor pega a escolha do usuario
	public Shapes( int userChoice ) {
		choice = userChoice;
	}
	
	public void paintComponent( Graphics g ) {
		super.paintComponent(g);
		
		for( int i = 0; i < 10; i++ ) {
			switch (choice) 
			{
			case 1:
				g.drawRect(10 + i*10, 10+1*10, 50+i*10, 50+i*10);
				break;
			case 2:
				g.drawOval(10 + i*10, 10+1*10, 50+i*10, 50+i*10);
				break;
			}
		}
	}
	
	
}
