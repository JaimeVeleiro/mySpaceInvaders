package com.veleiro.game;

import com.badlogic.gdx.graphics.Texture;

public class NaveEnemiga extends Nave{
    //Atributos
    protected Texture tExplosion;
    //Constuctor

    public NaveEnemiga(float posX, float posY, float velX, float velY, Texture imagen, boolean vivo, Texture tExplosion) {
        super(posX, posY, velX, velY, imagen, vivo);
        this.tExplosion = tExplosion;
    }


    //Metodos

    public Texture gettNaveEnemiga() {
        return imagen;
    }

    public void settNaveEnemiga(Texture imagen) {
        this.imagen = imagen;
    }

    public Texture gettExplosion() {
        return tExplosion;
    }

    public void settExplosion(Texture tExplosion) {
        this.tExplosion = tExplosion;
    }
}