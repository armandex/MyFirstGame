package com.mygdx.juego1.actors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by arman on 28/12/2017.
 */

public class ActorJugador extends Actor {

    private Texture jugador;

    public ActorJugador(Texture jugador){
        this.jugador = jugador;
        setSize(jugador.getWidth(), jugador.getHeight());
    }

    @Override
    public void act(float delta) {
        super.act(delta);

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(jugador,getX(),getY());
    }
}
