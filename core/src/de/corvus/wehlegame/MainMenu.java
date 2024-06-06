package de.corvus.wehlegame;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;


public class MainMenu extends ScreenAdapter{
	
	SpriteBatch batch;
	Texture img;
	
	public MainMenu() {
		batch = new SpriteBatch();
		img = new Texture("DEV160x160.png");
	}
	
	

	@Override
	public void render(float delta) {
		ScreenUtils.clear(0, 0, 0, 1);
		
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose() {
		batch.dispose();
		img.dispose();
	}
	
	@Override
	public void hide() {
		this.dispose();
		
	}
	
	
}
