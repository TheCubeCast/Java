// The main menu GameState.

package com.neet.DiamondHunter.GameState;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import com.neet.DiamondHunter.Main.GamePanel;
import com.neet.DiamondHunter.Manager.Content;
import com.neet.DiamondHunter.Manager.GameStateManager;
import com.neet.DiamondHunter.Manager.JukeBox;
import com.neet.DiamondHunter.Manager.Keys;


public class OptionsState extends GameState {
	
	private BufferedImage bg;
	private BufferedImage diamond;
	private BufferedImage rarrow;
	private BufferedImage larrow;
	
	private int currentOption = 0;
	private String[] options = {
		"Volume  " + "1",
		"BACK"
	};
	
	
	
	public OptionsState(GameStateManager gsm) {
		super(gsm);
	}
	
	public void init() {
		bg = Content.MENUBG[0][0];
		diamond = Content.DIAMOND[0][0];
		JukeBox.load("/SFX/collect.wav", "collect");
		JukeBox.load("/SFX/menuoption.wav", "menuoption");
		JukeBox.load("/Music/menuBack.mp3", "MenuBackground");
		try {
			rarrow = ImageIO.read(getClass().getResourceAsStream("/Sprites/rmarrow.png"));
			larrow = ImageIO.read(getClass().getResourceAsStream("/Sprites/lmarrow.png"));
			JukeBox.load("/Music/introsound.wav", "introsound");
			JukeBox.play("introsound");
<<<<<<< HEAD
		}
		
		catch(Exception e) {
=======
		} catch(Exception e) {
>>>>>>> 6706bb02c1f1b25e756b38145ba5743ba2ca7d75
			e.printStackTrace();
		}
	}
	
	public void update() {
		handleInput();
	}
	
	public void draw(Graphics2D g) {
		
		g.drawImage(bg, 0, 0, null);
		
			g.drawImage(larrow, GamePanel.WIDTH/10, 5*(GamePanel.HEIGHT/12), 50*GamePanel.SCALE, 50*GamePanel.SCALE, null);
			g.drawImage(rarrow, GamePanel.WIDTH/2, 6*(GamePanel.HEIGHT/16), 70*GamePanel.SCALE, 50*GamePanel.SCALE, null);
			
		
		Content.drawString(g, options[0], 140, 90);
		Content.drawString(g, options[1], 140, 100);
		g.drawImage(larrow, GamePanel.WIDTH/10, 5*(GamePanel.HEIGHT/12), 50*GamePanel.SCALE, 50*GamePanel.SCALE, null);
		g.drawImage(rarrow, GamePanel.WIDTH/2, 6*(GamePanel.HEIGHT/16), 70*GamePanel.SCALE, 50*GamePanel.SCALE, null);
		
		if(currentOption == 0) g.drawImage(diamond, 123, 87, null);
		else if(currentOption == 1) g.drawImage(diamond, 123, 97, null);
	}
	
	public void handleInput() {
		if(Keys.isPressed(Keys.DOWN) && currentOption < options.length - 1) {
			JukeBox.play("menuoption");
			currentOption++;
		}
		if(Keys.isPressed(Keys.UP) && currentOption > 0) {
			JukeBox.play("menuoption");
			currentOption--;
		}
		if(Keys.isPressed(Keys.ENTER)) {
			JukeBox.play("collect");
			selectOption();
		}
<<<<<<< HEAD
		
		
=======
>>>>>>> 6706bb02c1f1b25e756b38145ba5743ba2ca7d75
	}
	
	
	private void selectOption() {
		if(currentOption == 0) {
			gsm.setState(GameStateManager.OPTIONS);
		}
		if(currentOption == 1) {
			gsm.setState(GameStateManager.MENU);
		}
	}
	
}
