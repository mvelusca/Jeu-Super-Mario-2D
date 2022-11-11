package christel.mario.game.personnage;

import java.awt.Image;

import javax.swing.ImageIcon;

import christel.mario.game.java.Main;

public class Mario extends Personnage{

	
	//**** VARIABLES ****//
	private Image imgMario;
	private ImageIcon icoMario;
	private boolean saut; // vrai si mario saute
	private int compteurSaut; // duree du saut et hauteur du saut
		
		
	//**** CONSTRUCTEUR	****//	
	public Mario(int x, int y) {

	super(x, y, 28, 50);		
	this.icoMario = new ImageIcon(getClass().getResource("/images/marioMarcheDroite.png"));
	this.imgMario = this.icoMario.getImage();
	
	this.saut = false;
	this.compteurSaut = 0;
	}

		
	//**** GETTERS ****//		
	public Image getImgMario() {return imgMario;}


	public boolean isSaut() {
		return saut;
	}
		
	//**** SETTERS ****//
	public void setSaut(boolean saut) {
		this.saut = saut;
	}		

	//**** METHODES ****//
	public Image saute() {
		
		ImageIcon ico;
		Image img;
		String str;
		
		this.compteurSaut++;
		//Montée du saut
		if(this.compteurSaut <= 35) {
			if(this.getY() > Main.scene.getHauteurPlafond()) {
				this.setY(this.getY() - 4);
			}else {
				this.compteurSaut = 36;
			}
			if(this.isVersDroite() == true) {
				str = "/images/marioSautDroite.png";
			}else {
				str = "/images/marioSautGauche.png";
			}
			//Retombée du saut
		}else if(this.getY() + this.getHauteur() < Main.scene.getySol()) {
			this.setY(this.getY() + 1);
			if(this.isVersDroite() == true) {
				str = "/images/marioSautDroite.png";
			}else {
				str = "/images/marioSautGauche.png";
			}
			//Saut terminé
		}else {
			if(this.isVersDroite() == true) {
				str = "/images/marioArretDroite.png";
			}else {
				str = "/images/marioArretGauche.png";
			}
			this.saut = false;
			this.compteurSaut = 0;
		}
		//Affichage de l'image de mario
		ico = new ImageIcon(getClass().getResource(str));
		img = ico.getImage();
		return img;
		
	}
	
	
}