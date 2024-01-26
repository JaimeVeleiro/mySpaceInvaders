package com.veleiro.game;

import com.badlogic.gdx.graphics.Texture;

public class NaveEnemiga extends Nave{
    //Atributos
    protected Texture tNaveEnemiga, tExplosion;
    //Constuctor

    public NaveEnemiga(float posX, float posY, float velX, float velY, boolean vivo, Texture tNaveEnemiga, Texture tExplosion) {
        super(posX, posY, velX, velY, vivo);
        this.tNaveEnemiga = tNaveEnemiga;
        this.tExplosion = tExplosion;
        imagen = tNaveEnemiga;
    }


    //Metodos

    public Texture gettNaveEnemiga() {
        return tNaveEnemiga;
    }

    public void settNaveEnemiga(Texture tNaveEnemiga) {
        this.tNaveEnemiga = tNaveEnemiga;
    }

    public Texture gettExplosion() {
        return tExplosion;
    }

    public void settExplosion(Texture tExplosion) {
        this.tExplosion = tExplosion;
    }
}