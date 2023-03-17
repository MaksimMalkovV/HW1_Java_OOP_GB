package characters.Units;

import characters.Class.MagClass;

public class Priest extends MagClass {

    public Priest(String name) {
        super(360, 254, -35, -45, 40, 300, name);
    }

    @Override
    public String getInfo() {
        return "Священник";
    }

}
