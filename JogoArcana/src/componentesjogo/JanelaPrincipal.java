package componentesjogo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaPrincipal {
    
    public static void main(String[] args) {
        // Interface janela principal
        JFrame janela = new JFrame();
        janela.setTitle("Crônicas de Arcana");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(1024, 728);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);

        // Interface imagem de fundo tela inicial
        ImagemTelaInicial imagemTelaInicial = new ImagemTelaInicial();
        imagemTelaInicial.setLayout(null); 
        janela.add(imagemTelaInicial);

        // Interface Botão Iniciar
        BotaoIniciar botaoIniciar = new BotaoIniciar("INICIAR");
        botaoIniciar.setBounds((janela.getWidth() - 150) / 2, 550, 150, 50);
        botaoIniciar.addActionListener(e -> {
            System.out.println("Jogo iniciado!");
        });
        imagemTelaInicial.add(botaoIniciar);
        janela.setVisible(true);
    }
}

//Classe tela inicial
class ImagemTelaInicial extends JPanel {
    private static final long serialVersionUID = 1L;
    private Image imagemTelaInicial;

    public ImagemTelaInicial() {
        imagemTelaInicial = new ImageIcon("ImagensArcana/TelaInicial.png").getImage(); 
        setPreferredSize(new Dimension(1024, 728));
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(imagemTelaInicial, 0, 0, getWidth(), getHeight(), null);
    }
}

//Classe botão inicial
class BotaoIniciar extends JButton {
    private static final long serialVersionUID = 1L;

    public BotaoIniciar(String texto) {
        super(texto);
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
        setBackground(new Color(47, 79, 79));
        setForeground(new Color(255, 255, 255));
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isPressed()) {
            g.setColor(new Color(200, 200, 200));
        } else {
            g.setColor(getBackground());
        }
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 30, 30);

        super.paintComponent(g);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(150, 50);
    }
}

