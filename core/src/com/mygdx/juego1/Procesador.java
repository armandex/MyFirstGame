package com.mygdx.juego1;

import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputProcessor;

/**
 * Created by arman on 28/12/2017.
 */

public class Procesador extends InputAdapter {

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        System.out.println("Has tocado en la posicion "+screenX +","+screenY);
        System.out.println("con el dedo"+pointer+ "en el boton"+ button);
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }
}
