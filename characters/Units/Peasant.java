package characters.Units;

import characters.Class.BaseHero;

public class Peasant extends BaseHero {

    public Peasant(String name, int x, int y) {
        super(1, 3, 1, 1, 1, name, x, y);
    }

    // @Override
    // public String getInfo() {
    //     return "Крестьянин";
    // }

    @Override
    public String getName() {
        return "Peasant";
    }

}
