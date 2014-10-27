package com.hohman.shootergame;

import java.util.ArrayList;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class Gamestart implements Screen {
	TextureRegion gametitle;
	SpriteBatch batch;
	OrthographicCamera cam;
	ShapeRenderer sr;
	
	
	List<MovingAstroid> astroids=new ArrayList<MovingAstroid>();
	
	@Override
	public void render(float delta) {
		cam.position.set(512, 768/2, 0);
		cam.update();
		batch.setProjectionMatrix(cam.combined);

		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(gametitle, 0, 0);
		
		//draw astroids
		for(MovingAstroid a : astroids){
			a.render(batch, delta);
			
		}
		
		batch.end();
		if(Gdx.input.isButtonPressed(Buttons.LEFT)){
			float x,y;
			x=Gdx.input.getX();
			y=Gdx.input.getY();
			System.out.println(""+x+","+y);
			sr.setProjectionMatrix(cam.combined);
			sr.begin(ShapeType.Line);
			sr.setColor(200, 0, 0, .5f);
			sr.line(115, 124, x, 768-y);
			sr.line(906, 107, x, 768-y);
			sr.line(906, 649, x, 768-y);
			sr.line(110, 651, x, 768-y);
			sr.end();
		}
		
		
		if(Gdx.input.isKeyPressed(Keys.SPACE)){
			MovingAstroid a = new MovingAstroid();// put random times
			astroids.add(a);
			
		}
			
				
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		
		cam=new OrthographicCamera(1024, 768);
		// TODO Auto-generated method stub
		batch=new SpriteBatch();
		batch.getProjectionMatrix().setToOrtho2D(0, 0, 1024, 768);
		gametitle=new TextureRegion(new Texture("gamestartscreen.png"),0,0,1024,768);
		sr=new ShapeRenderer();
		
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
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
