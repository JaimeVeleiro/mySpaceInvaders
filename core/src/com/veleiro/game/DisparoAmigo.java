package com.veleiro.game;

import com.badlogic.gdx.graphics.Texture;

public class DisparoAmigo extends Disparo{
    protected Texture spriteDisparoAmigo;

    public DisparoAmigo(float posX, float posY, float velX, float velY, boolean pantalla, Texture spriteDisparoAmigo) {
        super(posX, posY, velX, velY, pantalla);
        this.spriteDisparoAmigo = spriteDisparoAmigo;
    }

    public Texture getSpriteDisparoAmigo() {
        return spriteDisparoAmigo;
    }

    public void setSpriteDisparoAmigo(Texture spriteDisparoAmigo) {
        this.spriteDisparoAmigo = spriteDisparoAmigo;
    }
}
