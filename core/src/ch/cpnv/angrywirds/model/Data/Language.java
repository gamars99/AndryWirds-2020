package ch.cpnv.angrywirds.model.Data;

public class Language {

    private String displayName;
    private String ISO_639_1;

    public String getDisplayName() {
        return displayName;
    }

    public String getISO_639_1() {
        return ISO_639_1;
    }

    public Language(String ISO_639_1, String name) {
        this.displayName = name;
        this.ISO_639_1 = ISO_639_1;
    }

}
