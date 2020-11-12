package ch.cpnv.angrywirds.model;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.Vector2;

import ch.cpnv.angrywirds.model.Data.Language;

public class Button extends TextualObject {

    private static final String PICNAME = "button.png";
    private static final int TEXT_OFFSET_X = 40;
    private static final int TEXT_OFFSET_Y = 100;
    private static final float x = 100;
    private static final float y = 100;

    private String value;
    private BitmapFont font;

    public Button(Language language){
        super(new Vector2 (x,y),x+160,y+60,PICNAME,language.getDisplayName());
        font= new BitmapFont();
        font.setColor(Color.BLACK);
        font.getData().setScale(2);
    }

    public String getValue(){ return value}

    public void draw(Batch batch){
        super.draw(batch);
        font.draw(batch, getText(), TEXT_OFFSET_X, TEXT_OFFSET_Y);
    }
}
