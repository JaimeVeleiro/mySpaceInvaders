package com.veleiro.game;

import com.badlogic.gdx.graphics.Texture;

public class DisparoEnemigo extends Disparo{

    protected Texture spriteDisparoEnemigo;
    public DisparoEnemigo(float posX, float posY, float velX, float velY, boolean pantalla, Texture spriteDisparoEnemigo) {
        super(posX, posY, velX, velY, pantalla);
        this.spriteDisparoEnemigo = spriteDisparoEnemigo;

    }

    public Texture getSpriteDisparoEnemigo() {
        return spriteDisparoEnemigo;
    }

    public void setSpriteDisparoEnemigo(Texture spriteDisparoEnemigo) {
        this.spriteDisparoEnemigo = spriteDisparoEnemigo;
    }
}
