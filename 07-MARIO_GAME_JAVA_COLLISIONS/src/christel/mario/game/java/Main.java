package christel.mario.game.java;

import javax.swing.*;

public class Main {
	
	public static Scene scene;

	public static void main(String[] args) {
		
		//creation de la fenetre de l'application
		JFrame fenetre = new JFrame("Mario Game");
		fenetre.setSize(700, 360);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//instanciation de l'objet scene
		scene = new Scene();
		
		fenetre.setContentPane(scene);//on associe la scene à la fenetre de l'appli
		fenetre.setVisible(true);

	}

}
