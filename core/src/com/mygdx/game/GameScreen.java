package com.mygdx.game;

import com.badlogic.gdx.ScreenAdapter;

public class GameScreen extends ScreenAdapter {
    private Escenario stage;

    @Override
    public void show() {
        stage = new Escenario();
        // Set up the stage and actors
        Actores actor = new Actores();
        stage.addActor(actor);
    }

    @Override
    public void render(float delta) {
        // Update and render the stage
        stage.act(delta);
        stage.draw();
    }

    // Override other necessary methods as needed
}
