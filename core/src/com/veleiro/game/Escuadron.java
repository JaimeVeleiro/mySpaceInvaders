package com.veleiro.game;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class Escuadron {
    //Atributos
    protected ArrayList<NaveEnemiga> misNavesEnemigas = new ArrayList<NaveEnemiga>();
    protected float posY;
    //Constructor
    public Escuadron(int ancho, int numeroNaves, float posY, Texture tExplosion, Texture tNaveEnemiga){
        this.posY = posY;

        int x, trozo;
        trozo = ancho / (numeroNaves + 1);
        x = trozo;

        for (int i = 0; i < numeroNaves; i++){
            NaveEnemiga unaNaveEnemiga = new NaveEnemiga(x, posY, 1.0f, 0, tNaveEnemiga, true, tExplosion);
            misNavesEnemigas.add(unaNaveEnemiga);
            x += trozo;
        }
    }
    //Métodos
    public void render(SpriteBatch sb){
        if(misNavesEnemigas != null) {
            for (NaveEnemiga naveEnemiga:misNavesEnemigas) {
                naveEnemiga.render(sb);
            }
        }
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    public float getPosXFirst(){
        return misNavesEnemigas.get(0).getPosX();
    }

    public float getPosXLast(){
        return misNavesEnemigas.get(misNavesEnemigas.size()-1).getPosX();
    }

    public void setVelXBat(float velX){
        for (NaveEnemiga nave: misNavesEnemigas){
            nave.setVelX(velX);
        }
    }
}
