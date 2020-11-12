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
    private static final float x = 10;
    private static final float y = 10;

    private String value;
    private String ISO_639;
    private BitmapFont font;

    public Button(Vector2 position, String value,String ISO_639){
        super(position,260,160,PICNAME,value);
        this.value = value;
        this.ISO_639 = ISO_639;
        font= new BitmapFont();
        font.setColor(Color.BLACK);
        font.getData().setScale(2);
    }

    public String getValue(){ return value;}

    public String getISO() {return ISO_639;}

    public void draw(Batch batch){
        super.draw(batch);
        font.draw(batch, getText(), getX()+TEXT_OFFSET_X, getY()+TEXT_OFFSET_Y);
    }
}
