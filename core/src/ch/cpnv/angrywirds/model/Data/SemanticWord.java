package ch.cpnv.angrywirds.model.Data;

import java.util.HashMap;

public class SemanticWord {

    HashMap<String, String> Values = new HashMap<String, String>();

    public void addTranslation(String language, String value) {
        Values.put(language,value);
    }

    public String getValue(String language){
        return Values.get(language);
    }
}
