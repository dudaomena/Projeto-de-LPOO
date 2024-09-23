package jogo;

import javax.swing.JFrame;
import jogo.Modelo.Base;


public class Arcana extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public Arcana() {
		add(new Base());
		setTitle("Crônica de Arcana");
		setSize(1024,728);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);
	}
	
	public static void main (String []args) {
		new Arcana();
	}

}


