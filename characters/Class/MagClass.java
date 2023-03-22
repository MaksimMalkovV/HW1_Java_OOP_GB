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

    
}
