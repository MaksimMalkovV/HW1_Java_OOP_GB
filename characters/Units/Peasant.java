package characters.Units;

import java.util.ArrayList;

import characters.Class.BaseHero;

public class Peasant extends BaseHero {
    
    public Peasant(String name) {
        super(250, 255, 0, 0, 20, name);
    }

    @Override
    public String getInfo() {
        return "Крестьянин";
    }

    @Override
    public void step(ArrayList<BaseHero> team, ArrayList<BaseHero> friends) {
        System.out.println("Что ему делать!");
    }
    
}
