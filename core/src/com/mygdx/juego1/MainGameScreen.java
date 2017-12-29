package com.mygdx.juego1;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.juego1.actors.ActorJugador;

/**
 * Created by arman on 28/12/2017.
 */

public class MainGameScreen extends BaseScreen {


    public MainGameScreen(MainGame game) {
        super(game);
    }

    private Stage stage;
    private ActorJugador jugador;
    private Texture texturaJugador;
    @Override
    public void show() {
         texturaJugador = new Texture("android.png");
        stage = new Stage();
        jugador = new ActorJugador(texturaJugador);
        stage.addActor(jugador);

        jugador.setPosition(20, 100);
    }

    @Override
    public void hide() {
        stage.dispose();
        texturaJugador.dispose();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.4f, 0.5f, 0.8f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw();
    }
}
