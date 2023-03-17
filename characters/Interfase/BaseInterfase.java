package characters.Interfase;

import java.util.ArrayList;

import characters.Class.BaseHero;

public interface BaseInterfase {
    void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2);
    String getInfo();
}
