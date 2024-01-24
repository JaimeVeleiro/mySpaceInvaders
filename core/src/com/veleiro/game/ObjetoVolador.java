package com.veleiro.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.nio.channels.spi.SelectorProvider;

public class ObjetoVolador {
    protected float posX, posY, velX, velY;
    protected Texture imagen;


    public ObjetoVolador(float posX, float posY, float velX, float velY) {
        this.posX = posX;
        this.posY = posY;
        this.velX = velX;
        this.velY = velY;
    }

    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    public float getVelX() {
        return velX;
    }

    public void setVelX(float velX) {
        this.velX = velX;
    }

    public float getVelY() {
        return velY;
    }

    public void setVelY(float velY) {
        this.velY = velY;
    }

    public boolean colision(ObjetoVolador unDisparo){
        return this.colisionFilas(unDisparo) && this.colisionColumnas(unDisparo);
    }

    public boolean colisionColumnas(ObjetoVolador unDisparo){
        if (unDisparo.getPosX() <= this.getPosX() && unDisparo.getPosX() >= (this.getPosX() + this.getHeight())) return true;
        return (((unDisparo.getPosX() + unDisparo.getHeight()) <= this.getPosX()) &&  ((unDisparo.getPosX() + unDisparo.getHeight()) >= (this.getPosX() + this.getHeight())));
    }

    public boolean colisionFilas(ObjetoVolador unDisparo){
        if ((unDisparo.getPosX() >= this.getPosX()) && (unDisparo.getPosX() <= (this.getPosX() + this.getWidth()))) return true;
        return (unDisparo.getPosX() + unDisparo.getWidth()) >= this.getPosX() && ((unDisparo.getPosX() + unDisparo.getWidth() <= (this.getPosX() + this.getWidth())));

    }

    public int getWidth() {
        return this.imagen.getWidth();
    }

    public int getHeight() {
        return this.imagen.getHeight();
    }

    public void dispose(){
        if (imagen != null){
            imagen.dispose();
        }
    }

    public void render(SpriteBatch sb) {
        sb.draw(imagen, posX, posY);
    }
}
