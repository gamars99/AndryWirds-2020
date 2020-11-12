package ch.cpnv.angrywirds.model.Data;

import com.badlogic.gdx.Gdx;

import java.util.HashMap;

public class SemanticWord {

    HashMap<String, String> Values = new HashMap<String, String>();

    public void addTranslation(String language, String value) {
        Values.put(language,value);
        Gdx.app.log("TESTVP", "Add translation "+value+" success");
    }

    public String getValue(String language){
        Gdx.app.log("TESTVP", "Get transpation "+language+" Success");
        return Values.get(language);
    }
}
