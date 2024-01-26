package com.veleiro.game;

import com.badlogic.gdx.graphics.Texture;

public class Disparo extends ObjetoVolador{
    protected boolean pantalla;

    public Disparo(float posX, float posY, float velX, float velY, boolean pantalla) {
        super(posX, posY, velX, velY);
        this.pantalla = pantalla;
    }

    public boolean isPantalla() {
        return pantalla;
    }

    public void setPantalla(boolean pantalla) {
        this.pantalla = pantalla;
    }

    public void disparoAmigoFuera(ObjetoVolador unDisparo){
        if (unDisparo.getPosX() > 1000 && (unDisparo.getPosX() + unDisparo.getHeight()) > 1000) unDisparo.dispose();
    }

    public void disparoEnemigoFuera(ObjetoVolador unDisparo){
        if (unDisparo.getPosX() > 0 && (unDisparo.getPosX() + unDisparo.getHeight()) > 0) unDisparo.dispose();
    }
}
