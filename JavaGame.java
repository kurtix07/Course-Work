package JavaGame;

import javax.swing.JFrame;

public class JavaGame extends JFrame {
	
	public JavaGame() {
		setTitle("Java Game");
		setSize(500, 500);
		setResizable(false);
		setVisible(true);
		//setDefaultCloseOperation();	
	}
	
	public static void main(String [] args) {
		new JavaGame();
	}
	
}