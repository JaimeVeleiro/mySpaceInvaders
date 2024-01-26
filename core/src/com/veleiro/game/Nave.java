package com.veleiro.game;

import com.badlogic.gdx.graphics.Texture;

public class Nave extends ObjetoVolador{
    //Atributos
    protected boolean vivo;
    //Constructor

    public Nave(float posX, float posY, float velX, float velY, boolean vivo) {
        super(posX, posY, velX, velY);
        this.vivo = vivo;
    }

    //Metodo

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
