package characters.Units;

import characters.Class.StaminClass;

public class Robber extends StaminClass  {
    
    private int gold;
    private int maxGold;

    public Robber(String name) {
        super(340, 330, 70, 80, 60, 450, name);
        this.maxGold = Magician.r.nextInt(50, 150);
        this.gold = maxGold;
    }

    @Override
    public String getInfo() {
        return String.format("Разбойник Золото: %d", this.gold);
    }




}
