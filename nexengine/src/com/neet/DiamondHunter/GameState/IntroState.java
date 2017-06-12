// GameState that shows logo.

package com.neet.DiamondHunter.GameState;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import com.neet.DiamondHunter.Main.GamePanel;
import com.neet.DiamondHunter.Manager.GameStateManager;
import com.neet.DiamondHunter.Manager.JukeBox;
import com.neet.DiamondHunter.Manager.Keys;


public class IntroState extends GameState {
	
	private BufferedImage logo;
	private BufferedImage logo2;
	private BufferedImage logo3;
	
	private int alpha;
	private int ticks;
	
	private final int FADE_IN = 20;
	private final int LENGTH = 20;
	private final int FADE_OUT = 20;
	
	public IntroState(GameStateManager gsm) {
		super(gsm);
	}
	
	public void init() {
		ticks = 0;
		try {
			logo = ImageIO.read(getClass().getResourceAsStream("/Logo/cube2.png"));
			logo2 = ImageIO.read(getClass().getResourceAsStream("/Logo/logo.png"));
			logo3 = ImageIO.read(getClass().getResourceAsStream("/Logo/brought.png"));
			JukeBox.load("/Music/introsound.wav", "introsound");
			JukeBox.play("introsound");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		handleInput();
		ticks++;
		if(ticks < FADE_IN) {
			alpha = (int) (255 - 255 * (1.0 * ticks / FADE_IN));
			if(alpha < 0) alpha = 0;
		}
		if(ticks > FADE_IN + LENGTH) {
			alpha = (int) (255 * (1.0 * ticks - FADE_IN - LENGTH) / FADE_OUT);
			if(alpha > 255) alpha = 255;
		}
		if(ticks > FADE_IN + LENGTH + FADE_OUT) {
			gsm.setState(GameStateManager.MENU);
		}
	}
	
	public void draw(Graphics2D g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
		g.drawImage(logo, 25, 100, 100, 100, null);
		g.drawImage(logo2, 160, 90, 140, 100, null);
		g.drawImage(logo3, 80, 6, 160, 80, null);
		g.setColor(new Color(0, 0, 0, alpha));
		g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
	}
	
	public void handleInput() {
		if(Keys.isPressed(Keys.ENTER)) {
			gsm.setState(GameStateManager.MENU);
		}
	}
	
}