package characters.Units;

import characters.Class.MagClass;

public class Priest extends MagClass {

    public Priest(String name, int x, int y) {
        super(360, 254, -35, -45, 40, 300, name, x, y);
    }

    @Override
    public String getInfo() {
        return "Священник";
    }

}
