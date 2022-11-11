package christel.mario.game.java;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Main.scene.setDx(1);
		} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			Main.scene.setDx(-1);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Main.scene.setDx(0);
		
	}
	
	

}
