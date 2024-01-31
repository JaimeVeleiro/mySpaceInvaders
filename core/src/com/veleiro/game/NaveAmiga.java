package com.veleiro.game;

import com.badlogic.gdx.graphics.Texture;

public class NaveAmiga extends Nave{
    //Atributos
    protected Texture tExplosion;

    //Constuctor
    public NaveAmiga(float posX, float posY, float velX, float velY, Texture imagen, boolean vivo, Texture tExplosion) {
        super(posX, posY, velX, velY, imagen, vivo);
        this.imagen = imagen;
        this.tExplosion = tExplosion;

    }


    //Metodos
    public Texture gettNaveAmiga() {
        return imagen;
    }

    public void settNaveAmiga(Texture imagen) {
        this.imagen = imagen;
    }

    public Texture gettExplosion() {
        return tExplosion;
    }

    public void settExplosion(Texture tExplosion) {
        this.tExplosion = tExplosion;
    }
}
