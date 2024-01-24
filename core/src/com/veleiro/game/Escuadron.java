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
            NaveEnemiga unaNaveEnemiga = new NaveEnemiga(x, posY, 0, 0, true, tNaveEnemiga, tExplosion);
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
}
