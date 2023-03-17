package characters.Units;

import characters.Class.ShooterClass;

public class Crossbowman extends ShooterClass  {



    public Crossbowman(String name) {
        super(430, 290, 52, 65, 50, 23, name);
    }

    @Override
    public String getInfo() {
        return "Арбалетчик";
    }

}
