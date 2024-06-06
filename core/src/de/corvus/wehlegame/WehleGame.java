package de.corvus.wehlegame;

import com.badlogic.gdx.Game;


public class WehleGame extends Game {
	
	public static WehleGame INSTANCE;
	
	public WehleGame() {
		INSTANCE = this;
	}
	
	
	@Override
	public void create () {
		setScreen(new GameScreen());
	}

	
	
	@Override
	public void dispose () {
		
	}
}
