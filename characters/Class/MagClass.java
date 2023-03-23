package characters.Class;

public class MagClass extends BaseHero {
    
    int mana;

    public int getMana() {
        return mana;
    }
    

    public MagClass(int hp, int speed, int damage, int armor,int attack, int mana, String name, int x, int y) {
        super(hp, speed, damage, attack, armor, name, x, y);
        this.mana = mana;
    }

    @Override
    public String getInfo() {
        String outStr = String.format("\t%-3s\tARM %-3d\tHP %-3d%%\tDM %-3d\tMN %-3s\t      ", getName(), armor,
                (int) hp * 100 / maxHp, damage, mana);
        return outStr;

    }
}
