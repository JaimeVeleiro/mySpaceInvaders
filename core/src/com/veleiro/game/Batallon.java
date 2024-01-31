package com.veleiro.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;

public class Batallon {
    //Atributos
    protected ArrayList<Escuadron> misEscuadrones = new ArrayList<Escuadron>();


    //Constructor
    public Batallon(int altura,int ancho, int numeroEscuadrones, Texture tExplosion, Texture tNaveEnemiga){
        int y, trozo;
        trozo = (altura/2) / (numeroEscuadrones + 1);
        y = trozo + (altura/2);

        for (int i = 0; i < numeroEscuadrones; i++){
            Escuadron unEscuadron = new Escuadron(ancho, 7,  y, tExplosion, tNaveEnemiga);
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

    }

    public float getPosXFirst(){
        return misEscuadrones.get(0).getPosXFirst();
    }

    public float getPosXLast(){
        return misEscuadrones.get(0).getPosXLast();
    }

    public void setVelXBat(float velX){
        for (Escuadron escuadron: misEscuadrones){
            escuadron.setVelXBat(velX);
        }
    }


}
