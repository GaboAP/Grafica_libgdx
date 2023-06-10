package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Actores extends Actor implements InputProcessor {
    Texture image;
    public Actores(){
        image=new Texture (Gdx.files.internal("Space-Invaders-Ship.png"));
        Gdx.input.setInputProcessor(this);
    }

    @Override
    public void draw(Batch batch, float parentAlpha){
        batch.draw(image,getX(), getY(), 60, 60);
    }

    @Override
    public void act(float delta) {
        // Update the spaceship's logic here
        super.act(delta);
    }

    @Override
    public boolean keyDown(int keycode) {
        switch (keycode){
            case Input.Keys.UP:
                setY(getY() + 5);
                break;
            case Input.Keys.RIGHT:
                setX(getX() + 5);
                break;
            case Input.Keys.DOWN:
                setY(getY() - 5);
                break;
            case Input.Keys.LEFT:
                setX(getX() - 5);
                break;
            default:
                break;
        }
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }
}
