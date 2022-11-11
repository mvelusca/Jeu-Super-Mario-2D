package christel.mario.game.java;

import java.awt.*;

import javax.swing.*;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Scene extends JPanel{
	 private ImageIcon icoFond;
	 private Image imgFond1;
	 
	 private Image imgMario;
	 private ImageIcon icoMario;
	 
	 private int xFond1;

	//***********constructor********//
	public Scene() {
		super();
		
		this.xFond1 = -50;
		icoFond = new ImageIcon(getClass().getResource("/images/fondEcran.png"));
		this.imgFond1 = this.icoFond.getImage();
		icoMario = new ImageIcon(getClass().getResource("/images/marioMarcheDroite.png"));
		this.imgMario = this.icoMario.getImage();
	}
	
	///*******methodes****//
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		
		g2.drawImage(this.imgFond1, this.xFond1, 0, null); //dessin de l'image de fond
		g2.drawImage(imgMario, 300, 245, null);

		
	}
}
