package ch.cpnv.angrywirds.activities;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;

import ch.cpnv.angrywirds.AngryWirds;
import ch.cpnv.angrywirds.model.Bird;
import ch.cpnv.angrywirds.model.Button;
import ch.cpnv.angrywirds.model.Data.Language;
import ch.cpnv.angrywirds.providers.VocProvider;

public class Welcome extends Game implements InputProcessor {

    public static final float WORLD_WIDTH = 1600;
    public static final float WORLD_HEIGHT = 900;

    private SpriteBatch batch;
    private Texture background;
    private BitmapFont title;
    public ArrayList<Language> languages; // all available languages
    private VocProvider test;
    private String languageFrom;
    private String languageTo;

    private Button btnFrom;
    private Button btnTo;

    private OrthographicCamera camera;

    public Welcome() {

        batch = new SpriteBatch();
        background = new Texture(Gdx.files.internal("background.jpg"));
        btnFrom = new Button(new Vector2(WORLD_WIDTH/8, WORLD_HEIGHT/2), "Français", "fr");
        btnTo = new Button(new Vector2(WORLD_WIDTH/2, WORLD_HEIGHT/2), "Espagnole", "es");


        camera = new OrthographicCamera();
        camera.setToOrtho(false, WORLD_WIDTH, WORLD_HEIGHT);
        camera.position.set(camera.viewportWidth / 2, camera.viewportHeight / 2, 0);
        camera.update();

        title= new BitmapFont();
        title.setColor(Color.ROYAL);
        title.getData().setScale(6);

        Gdx.input.setInputProcessor(this);
    }

    @Override
    public void create() {

    }

    public void update() {
        float dt = Gdx.graphics.getDeltaTime();
    }

    @Override
    public void render() {
        update();
        batch.begin();
        batch.setProjectionMatrix(camera.combined);
        batch.draw(background, 0, 0, camera.viewportWidth, camera.viewportHeight);
        title.draw(batch,"Welcom",WORLD_WIDTH/4,WORLD_HEIGHT-20);
        btnFrom.draw(batch);
        btnTo.draw(batch);
        batch.end();
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
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
        if((screenX > 268 && screenX < 600) && (screenY > 400 && screenY < 490)){
            languageFrom = btnFrom.getISO();
        }else if((screenX > 1050 && screenX < 1380) && (screenY > 400 && screenY < 490)){
            languageTo = btnTo.getISO();
        }else {
            AngryWirds.pages.push(new Play("Français","Espagnole"));
        }
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
    public boolean scrolled(int amount) {
        return false;
    }
}
