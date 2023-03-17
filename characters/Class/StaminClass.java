package characters.Class;

public class StaminClass extends BaseHero {
    int stamina;

    public StaminClass(int hp, int speed, int damage, int maxDamage, int armor, int stamina, String name) {
        super(hp, speed, damage, maxDamage, armor, name);
        this.stamina = stamina;
    }
}
