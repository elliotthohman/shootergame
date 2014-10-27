package com.hohman.shootergame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class TitleScreen implements Screen {
	
	TextureRegion title;
	SpriteBatch batch;
	float totaltime;
	Game game;
	
	public TitleScreen(Game g){
		game=g;
	}

	
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(title, 0, 0);
		batch.end();
		totaltime=totaltime+delta;
		if(totaltime>1) {
			game.setScreen (new Gamestart());
		}
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		title=new TextureRegion(new Texture("shootergametitle.png"),0,0,1024,768);
		batch=new SpriteBatch();
		batch.getProjectionMatrix().setToOrtho2D(0, 0, 1024, 768);
		totaltime=0;
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		batch.dispose();
		title.getTexture().dispose();
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
