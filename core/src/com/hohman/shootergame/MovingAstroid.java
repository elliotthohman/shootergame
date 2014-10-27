package com.hohman.shootergame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MovingAstroid {
	float x, y;
	float s;
	float d;
	static TextureRegion astroid=new TextureRegion(new Texture("astroid1x.png"),0,0,100,100);

	public MovingAstroid (){
		x=(float)Math.random()*1024;
		y=(float)Math.random()*768;
		d=100000;
		s=25000;//pixels per second
	}
	
	public void render(SpriteBatch batch, float delta){
		
	}
	
}
