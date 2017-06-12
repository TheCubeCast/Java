// The main menu GameState.

package com.neet.DiamondHunter.GameState;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import com.neet.DiamondHunter.Manager.Content;
import com.neet.DiamondHunter.Manager.GameStateManager;
import com.neet.DiamondHunter.Manager.JukeBox;
import com.neet.DiamondHunter.Manager.Keys;

public class MenuState extends GameState {
	
	private BufferedImage bg;
	private BufferedImage diamond;
	
	private int currentOption = 0;
	private String[] options = {
		"START",
		"OPTIONS",
		"QUIT"
	};
	
	
	
	public MenuState(GameStateManager gsm) {
		super(gsm);
	}
	
	public void init() {
		bg = Content.MENUBG[0][0];
		diamond = Content.DIAMOND[0][0];
		JukeBox.load("/SFX/collect.wav", "collect");
		JukeBox.load("/SFX/menuoption.wav", "menuoption");
		JukeBox.load("/Music/menuBack.mp3", "MenuBackground");
		JukeBox.loop("MenuBackground");
	}
	
	public void update() {
		handleInput();
	}
	
	public void draw(Graphics2D g) {
		
		g.drawImage(bg, 0, 0, null);
		
		Content.drawString(g, options[0], 140, 90);
		Content.drawString(g, options[1], 140, 100);
		Content.drawString(g, options[2], 140, 110);
		
		if(currentOption == 0) g.drawImage(diamond, 123, 87, null);
		else if(currentOption == 1) g.drawImage(diamond, 123, 97, null);
		else if(currentOption == 2) g.drawImage(diamond, 123, 107, null);
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
	}
	
	private void selectOption() {
		if(currentOption == 0) {
			JukeBox.stop("MenuBackground");
			gsm.setState(GameStateManager.PLAY);
		}
		if(currentOption == 0) {
			JukeBox.stop("MenuBackground");
			gsm.setState(GameStateManager.OPTIONS);
		}
		if(currentOption == 1) {
			System.exit(0);
		}
	}
	
}
