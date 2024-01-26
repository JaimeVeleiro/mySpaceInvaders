package com.veleiro.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;

public class Main extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, navesEnemigas, naveAmiga, disparo, explosion;
	Batallon miBatallon;
	NaveAmiga miNave;



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

		miBatallon = new Batallon(altura, ancho, 4, explosion, navesEnemigas);

		NaveAmiga miJugador = new NaveAmiga(0.0f, 0.0f, 3.0f, 0.0f, true, naveAmiga, explosion);
		miNave = miJugador;
		/*ArrayList<Disparo> losDisparos = new ArrayList<Disparo>();
		spawDisparos();*/
	}

	/*private void spawDisparos(){
		Disparo unDisparo = new Disparo(5.0f, 5.0f, 0.0f, 0.0f, true);

		losDisparos.add(unDisparo);
	}*/

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);

		batch.begin();
		miBatallon.render(batch);
		//miNave.render(batch);
		batch.draw(miNave.gettNaveAmiga(), 0, 0);
		//batch.draw(naveAmiga, 23, 350);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		miNave.dispose();
		miBatallon.dispose();
	}
}