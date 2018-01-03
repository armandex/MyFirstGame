package com.mygdx.juego1;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by arman on 3/01/2018.
 */

public class Box2DScreen extends BaseScreen {

    private World world;
    public Box2DScreen(MainGame game) {
        super(game);
    }

    @Override
    public void show() {
        world = new World(new Vector2(0 , -10), true);
    }

    @Override
    public void dispose() {
        world.dispose();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        world.step(delta, 6, 2);
    }
}
