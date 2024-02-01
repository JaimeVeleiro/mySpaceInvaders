package com.veleiro.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.util.ArrayList;

public class Main extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, navesEnemigas, naveAmiga, disparo, explosion;
	Batallon miBatallon;
	NaveAmiga miNave;
	ArrayList<DisparoAmigo> misDisparos;

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


		miNave = new NaveAmiga(0.0f, 0.0f, 6.0f, 0.0f, naveAmiga, true, explosion);

		misDisparos = new ArrayList<>();

		spawnDisparos();
	}

	private void spawnDisparos(){
		/*Disparo unDisparo = new Disparo(5.0f, 5.0f, 0.0f, 0.0f, true);

		losDisparos.add(unDisparo);*/


		DisparoAmigo unDisparo = new DisparoAmigo((miNave.getPosX() + 20), (miNave.getPosY() + 20), 0, 9.0f, disparo, true);
		misDisparos.add(unDisparo);

	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);

		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
			miNave.setPosX(miNave.getPosX() + miNave.getVelX());
		}

		if (Gdx.input.isKeyPressed(Input.Keys.LEFT)){
			miNave.setPosX(miNave.getPosX() - miNave.getVelX());
		}

		if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE)){
			spawnDisparos();
		}

		for (DisparoAmigo disparo: misDisparos){
			disparo.setPosY(disparo.getPosY() + disparo.getVelY());
		}

		if (miBatallon.getPosXFirst() == 0){
			miBatallon.setVelXBat(1.0f);
			for (int i = 0; i < miBatallon.misEscuadrones.size(); i++) {
				for (NaveEnemiga nave : miBatallon.misEscuadrones.get(i).misNavesEnemigas) {
					nave.setPosY(nave.getPosY() - navesEnemigas.getHeight());
				}
			}
		} else if (miBatallon.getPosXLast() == (Gdx.graphics.getWidth() - navesEnemigas.getWidth())){
			miBatallon.setVelXBat(-1.0f);
		}

		for (int i = 0; i < miBatallon.misEscuadrones.size(); i++){
			for (NaveEnemiga nave: miBatallon.misEscuadrones.get(i).misNavesEnemigas){
				nave.setPosX(nave.getPosX() + nave.getVelX());
			}
		}

		for (int i = 0; i < miBatallon.misEscuadrones.size(); i++){
			for (NaveEnemiga nave: miBatallon.misEscuadrones.get(i).misNavesEnemigas) {
				for (DisparoAmigo disparo: misDisparos){
					if (nave.colision(disparo)){
						nave.setVivo(false);
						nave.settNaveEnemiga(explosion);
					}

				}

			}
		}

		batch.begin();
		for (DisparoAmigo disparo: misDisparos){
			if ((disparo.getPosY() - disparo.getHeight()) < Gdx.graphics.getHeight()){
				disparo.render(batch);
			}
		}

		miBatallon.render(batch);
		miNave.render(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
		miNave.dispose();
		miBatallon.dispose();
		disparo.dispose();
	}
}