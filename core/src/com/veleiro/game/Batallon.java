package com.veleiro.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class Batallon {
    //Atributos
    protected ArrayList<Escuadron> misEscuadrones = new ArrayList<Escuadron>();
    protected Texture imagen;

    //Constructor
    public Batallon(int altura, int numeroEscuadrones, Texture tExplosion, Texture tNaveEnemiga){
        int y, trozo;
        trozo = (altura/2) / (numeroEscuadrones + 1);
        y = trozo;

        for (int i = 0; i < numeroEscuadrones; i++){
            Escuadron unEscuadron = new Escuadron(800, 6,  y, tExplosion, tNaveEnemiga);
            misEscuadrones.add(unEscuadron);
            y += trozo;
        }
    }
    //Metodos
    public void render(SpriteBatch sb){
        if(misEscuadrones != null) {
            for (Escuadron escuadron:misEscuadrones) {
                escuadron.render(sb);
            }
        }
    }

    public void dispose(){
        if (imagen != null){
            imagen.dispose();
        }
    }
}
