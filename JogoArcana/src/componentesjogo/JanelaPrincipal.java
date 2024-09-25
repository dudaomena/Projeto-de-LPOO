package componentesjogo;
/////////////////////////////

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
////////////////////////////

public class JanelaPrincipal{
	

	public static void main (String[]agrs) {
		
		JFrame janela = new JFrame();
        janela.setTitle("Crônicas de Arcana");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(1024, 728);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);
        janela.getContentPane().setBackground(new Color(0, 0, 0));
        janela.setLayout(null);
		
		
		ImagemContainerTitulo containertitulo = new ImagemContainerTitulo();
	    	containertitulo.setBounds(10, 10, 990, 150);
	    	
	        
	        janela.add(containertitulo);
	        janela.setVisible(true);
	}
}

class ImagemContainerTitulo extends JLabel {

    private Image imagemDeFundo;

    public ImagemContainerTitulo() {
        imagemDeFundo = new ImageIcon(".png").getImage(); 
     }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagemDeFundo, 0, 0, getWidth(), getHeight(), this);
    }
}

