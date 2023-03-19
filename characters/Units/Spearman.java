package characters.Units;

import characters.Class.StaminClass;

public class Spearman extends StaminClass {

    public Spearman(String name, int x, int y) {
        super(450, 360, 60, 75, 55, 430, name, x, y);

    }

    @Override
    public String getInfo() {
        return "Копейщик";
    }

}
