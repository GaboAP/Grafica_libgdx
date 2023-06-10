package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

public class Drop extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private Stage escenario;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		Actores actor=new Actores();
		actor.setPosition(385,10);
		escenario=new Stage();
		escenario.addActor(actor);
		img= new Texture("Octavius.jpg");
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		escenario.act();
		escenario.draw();
		/*batch.begin();
		batch.draw(img, 0, 0);
		batch.end();*/
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
