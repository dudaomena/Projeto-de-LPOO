package componentesjogo;
/////////////////////////////

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
////////////////////////////
import javax.swing.JPanel;


public class JanelaPrincipal{
	
	public static void main (String[]agrs) {
		//Janela Principal
		JFrame janela = new JFrame();
        janela.setTitle("Crônicas de Arcana");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(1024, 728);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);
        janela.getContentPane().setBackground(Color.BLACK);
        
        //Imagem de fundo tela inicial
        ImagemTelaInicial imagemTelaInicial = new ImagemTelaInicial();
        janela.add(imagemTelaInicial);
        janela.setVisible(true);;
        
        // Botão Iniciar
        JButton botaoIniciar = new JButton("Iniciar");
        botaoIniciar.setPreferredSize(new Dimension(200, 50));
        botaoIniciar.setBackground(Color.WHITE);
        botaoIniciar.setForeground(Color.BLACK);
        botaoIniciar.setFocusPainted(false);

        botaoIniciar.addActionListener(e -> {
            System.out.println("Jogo iniciado!");
        });

        janela.setLayout(null);
        botaoIniciar.setBounds((janela.getWidth() - 200) / 2, 400, 200, 50);
        janela.add(botaoIniciar);
	}
}

	class ImagemTelaInicial extends JPanel{
		private static final long serialVersionUID = 1L;
		
	    private Image imagemTelaInicial;
	    
	    public ImagemTelaInicial() {
	    	imagemTelaInicial = new ImageIcon("ImagensArcana/TelaInicial.png").getImage(); 
	     }
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	    	Graphics2D graficos = (Graphics2D) g;
	    	graficos.drawImage(imagemTelaInicial, 0, 0, getWidth(), getHeight(), null);
	    }
}


    	    
