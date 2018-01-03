package com.mygdx.juego1;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.juego1.actors.ActorJugador;
import com.mygdx.juego1.actors.ActorPinchos;

/**
 * Created by arman on 28/12/2017.
 */

public class MainGameScreen extends BaseScreen {

    private Stage stage;
    private ActorJugador jugador;
    private Texture texturaJugador, texturaPinchos;
    private TextureRegion regionPinchos;
    private ActorPinchos pinchos;

    public MainGameScreen(MainGame game) {
        super(game);
        texturaJugador = new Texture("android.png");
        texturaPinchos = new Texture("pinchos_sin_fondo.png");
        regionPinchos = new TextureRegion(texturaPinchos,0,88,128,40);
    }



    @Override
    public void show() {
        stage = new Stage();
        stage.setDebugAll(true);

        jugador = new ActorJugador(texturaJugador);
        pinchos = new ActorPinchos(regionPinchos);
        stage.addActor(jugador);
        stage.addActor(pinchos);
        jugador.setPosition(10, 10);
        pinchos.setPosition(500,10);
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
