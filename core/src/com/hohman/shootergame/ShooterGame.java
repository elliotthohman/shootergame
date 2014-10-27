package com.hohman.shootergame;

import com.badlogic.gdx.Game;

public class ShooterGame extends Game {
	
	@Override
	public void create() {
		// TODO Auto-generated method stub
		setScreen (new TitleScreen(this));
	}
	
}
