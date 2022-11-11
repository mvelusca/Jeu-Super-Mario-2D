package christel.mario.game.objets;

import christel.mario.game.java.Main;

public class Objet {
	
	//*******VARIABLES*******//
	private int largeur, hauteur; //dimension de l'objet
	private int x, y; //position de l'objet
	
	
	//********CONSTRUCTEUR******//
	public Objet(int x, int y, int largeur, int hauteur) {
		this.x = x;
		this.y = y;
		this.largeur = largeur;
		this.hauteur = hauteur;
		
	}

	//********GETTERS AND SETTERS********//
	public int getLargeur() {
		return largeur;
	}


	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}


	public int getHauteur() {
		return hauteur;
	}


	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	//********METHODES**********//
	public void deplacement() {
		if(Main.scene.getxPos() >= 0) {
			this.x = this.x - Main.scene.getDx();
		}
	}

}
