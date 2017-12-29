package com.mygdx.juego1.actors;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by arman on 29/12/2017.
 */

public class ActorPinchos extends Actor {

    private TextureRegion pinchos;

    public ActorPinchos(TextureRegion pinchos){
        this.pinchos = pinchos;
    }

    @Override
    public void act(float delta) {
        setX(getX() - 250 * delta);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(pinchos, getX(), getY());
    }
}
