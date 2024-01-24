package com.veleiro.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, navesEnemigas, naveAmiga, disparo, explosion;
	Batallon miBatallon;



	@Override
	public void create () {
		int altura = Gdx.graphics.getHeight();
		int ancho = Gdx.graphics.getWidth();
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		navesEnemigas = new Texture("green.png");
		naveAmiga = new Texture("player.png");
		disparo = new Texture("disparo.png");
		explosion = new Texture("explosion.png");

		miBatallon = new Batallon(altura, 4, explosion, navesEnemigas);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		batch.begin();
		//miBatallon.render(batch);
		//naveAmiga.render(batch);
		batch.draw(naveAmiga, 100, 350);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		//naveAmiga.dispose();
		miBatallon.dispose();
	}
}
