package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

public class Drop extends Game {
	SpriteBatch batch;
	Texture img;
	private Stage escenario;

	private GameScreen gameScreen;

	@Override
	public void create() {
		gameScreen = new GameScreen();
		// Set the initial screen
		setScreen(gameScreen);
	}

	@Override
	public void render() {
		super.render();
		// Additional rendering logic if needed
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
