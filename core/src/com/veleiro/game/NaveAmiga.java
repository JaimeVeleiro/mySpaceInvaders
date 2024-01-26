package com.veleiro.game;

import com.badlogic.gdx.graphics.Texture;

public class NaveAmiga extends Nave{
    //Atributos
    protected Texture tNaveAmiga, tExplosion;

    //Constuctor
    public NaveAmiga(float posX, float posY, float velX, float velY, boolean vivo, Texture tNaveAmiga, Texture tExplosion) {
        super(posX, posY, velX, velY, vivo);
        this.tNaveAmiga = tNaveAmiga;
        this.tExplosion = tExplosion;

    }


    //Metodos
    public Texture gettNaveAmiga() {
        return tNaveAmiga;
    }

    public void settNaveAmiga(Texture tNaveAmiga) {
        this.tNaveAmiga = tNaveAmiga;
    }

    public Texture gettExplosion() {
        return tExplosion;
    }

    public void settExplosion(Texture tExplosion) {
        this.tExplosion = tExplosion;
    }
}
