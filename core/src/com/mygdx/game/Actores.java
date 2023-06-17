package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.assets.loaders.ModelLoader;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.loader.ObjLoader;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Actores extends ModelInstance {
    public Actores() {
        super(createModel());
    }

    private static Model createModel() {
        ModelLoader loader = new ObjLoader();
        Model model = loader.loadModel(Gdx.files.internal("ship.obj"));
        return model;
    }
    public void update(float delta) {
        // Update the ship's position, rotation, or any other properties here
    }

}
