package characters;

import java.util.Random;

public abstract class BaseHero implements BaseInterfase {

    protected static Random r;
    protected static int number;

    protected final String NAME;
    protected int hp;
    protected int maxHp;

    public BaseHero(String name, int hp) {
        NAME = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    @Override
    public String getInfo() {
        return String.format("Имя: %s  Hp: %d  Тип: %s",
                this.NAME, this.hp, this.getClass().getSimpleName());
    }

    @Override
    public void step() {
        System.out.println("Ничего не делает");
    }

    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }

    }

    public void Attack(BaseHero target) {
        int damage = 10;
        target.GetDamage(damage);
    }

    public void getNAME() {
        System.out.println(NAME);
    }
}